package com.qa.javaAssessment;

public class superBlockAssessment {
	
	public int superBlock(String input) {
		int Alpha=1, Word=0;
			for(int i = 0; i< input.length()-1; i++) {
			if (input.substring(i, i+1).equals(input.substring(i+1, i+2))) {
					Alpha = (Alpha +1);
					if (Word>Alpha) {
						Alpha=Word;
					}
			} else {
				Alpha=1;
			}
		}
		return Word;

	}

}
