import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;

/**
 * Created by linuxsagar on 7/7/15.
 */
public class Bandwidth {

    public static void main(String[] args) {
        String filename = "bandwidth.fcl";
        FIS fis = FIS.load(filename,true);

        if(fis == null){
            System.err.println("Error opening file" + filename);
            System.exit(1);
        }

        FunctionBlock fb = fis.getFunctionBlock(null);

        fb.setVariable("curBan",8);
        fb.evaluate();
        fb.getVariable("drBan").defuzzify();

        System.out.println("fb.getVariable(\"drBan\").getValue() = " + fb.getVariable("drBan").getValue());
        

    }
}
