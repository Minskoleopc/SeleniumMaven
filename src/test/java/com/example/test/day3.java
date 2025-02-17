package com.example.test;

import org.testng.annotations.Test;

public class day3 {
	
	// Running multiple test cases 
	// Grouping of test cases
	// Setting properties 
	// Running test cases in parallel
	// Parameterizing of test case
	
	@Test
	public void testOne() {
		System.out.println("Test case one");
	
	}
	@Test
	public void testTwo() {
		System.out.println("Test Case two");
	
	}
	@Test(groups="smoke")
	public void testThree() {
		System.out.println("Test case Three");
	
	}

}
