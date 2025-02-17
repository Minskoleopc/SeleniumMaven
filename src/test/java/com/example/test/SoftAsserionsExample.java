package com.example.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserionsExample {
	
	@Test
	public void testThree() {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("step 1");
		softAssert.assertEquals("google", "Google","Title does not match");
		
		System.out.println("step 2");
		softAssert.assertFalse(true,"value should be false");
		
		System.out.println();
		softAssert.assertTrue(true,"value should be true");
		
		softAssert.assertAll();
		
	}
	
	// validation critical scenario - hard assertion
	// checking multiple element -    soft assertion
	// stopping execution if a failure occurs - hardassertion
	// gathering multiple failures before stoping  - softassertion
	
	
	

}
