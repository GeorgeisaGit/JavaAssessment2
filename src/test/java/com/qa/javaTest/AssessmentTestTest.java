package com.qa.javaTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.javaAssessment.superBlockAssessment;

public class AssessmentTestTest {

	@Test
	public void test() {
		public void superBlockTest() {
			
			superBlockAssessment oe = new superBlockAssessment();
			
			assertFalse("Are you returning the right thing?", oe.superBlock("hoopplla")==-1);
			assertEquals(2, oe.superBlock("hoopplla"));
			assertEquals(3, oe.superBlock("abbCCCddDDDeeEEE"));
			assertEquals(0, oe.superBlock(""));
		}
	}
}

