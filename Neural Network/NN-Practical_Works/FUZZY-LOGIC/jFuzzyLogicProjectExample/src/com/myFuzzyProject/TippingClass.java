package com.myFuzzyProject;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;

public class TippingClass {
	public static void main(String[] args) throws Exception {
		String filename = "tipper.fcl";
		FIS fis = FIS.load(filename, true);

		if (fis == null) {
			System.err.println("Can't load file: '" + filename + "'");
			System.exit(1);
		}

		// Get default function block
		FunctionBlock fb = fis.getFunctionBlock(null);

		// Set inputs
		fb.setVariable("food", 8.5);
		fb.setVariable("service", 7.5);

		// Evaluate
		fb.evaluate();

		// Show output variable's chart
		fb.getVariable("tip").defuzzify();

		// Print ruleSet
		System.out.println(fb);
		System.out.println("Tip: " + fb.getVariable("tip").getValue());

	}

}
