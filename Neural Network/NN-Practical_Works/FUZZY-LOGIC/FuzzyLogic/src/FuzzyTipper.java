import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;

/**
 * Created by linuxsagar on 7/7/15.
 */
public class FuzzyTipper {

    public static void main(String[] args) throws Exception {
// Load from 'FCL' file
        String fileName = "tipper.fcl";
        FIS fis = FIS.load(fileName, true);
// Error while loading?
        if( fis == null ) {
            System.err.println("Can't load file: '" + fileName + "'");
            return;
        }
        FunctionBlock fb = fis.getFunctionBlock(null);
// Show
        JFuzzyChart.get().chart(fb);
// Set inputs
        fis.setVariable("service", 3);
        fis.setVariable("food", 7);
// Evaluate
        fis.evaluate();
// Show output variable's chart
        Variable tip = fb.getVariable("tip");
        JFuzzyChart.get().chart(tip, tip.getDefuzzifier(), true);
// Print ruleSet
        System.out.println(fis);
        System.out.println(fb.getVariable("tip").getValue());
    }

}
