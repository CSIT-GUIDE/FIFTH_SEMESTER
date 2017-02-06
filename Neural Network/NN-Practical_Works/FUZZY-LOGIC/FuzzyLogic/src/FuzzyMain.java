/**
 * Created by linuxsagar on 7/7/15.
 */

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;

import java.util.Scanner;

public class FuzzyMain {
    public static void main(String[] args) throws Exception {
        String filename = "bathtub.fcl";
        FIS fis = FIS.load(filename, true);
        if (fis == null) {
            System.err.println("Can't load file: '" + filename + "'");
            System.exit(1);
        }
        FunctionBlock fb = fis.getFunctionBlock(null);

        System.out.println("Enter the temperature.");
        Scanner tempScanner = new Scanner(System.in);
        double temp = tempScanner.nextDouble();
        fb.setVariable("temp", temp);

        fb.evaluate();

        fb.getVariable("hot_valve").defuzzify();
        fb.getVariable("cold_valve").defuzzify();
        JFuzzyChart.get().chart(fb);

        Variable hot_valve = fb.getVariable("hot_valve");
        Variable cold_valve = fb.getVariable("cold_valve");
        JFuzzyChart.get().chart(hot_valve, hot_valve.getDefuzzifier(), true);
        JFuzzyChart.get().chart(cold_valve, cold_valve.getDefuzzifier(), true);

        double hotVal = fb.getVariable("hot_valve").getValue();
        double coldVal = fb.getVariable("cold_valve").getValue();


        //System.out.println(fb);
        /*System.out.println("Hot Valve: " + fb.getVariable("hot_valve").getValue());
        System.out.println("Cold Valve: " + fb.getVariable("cold_valve").getValue());*/
        if(hotVal == 100 && coldVal == 0){
            System.out.println("It's cold outside, Open the HOT VALVE");
        }
        if(coldVal == 100 && hotVal == 0 ){
            System.out.println("It's hot outside, open the COLD VALVE");
        }
        if(hotVal == coldVal){
            System.out.println("It's neither cold nor hot outside. So, any valve can be opened.");
        }

    }

}