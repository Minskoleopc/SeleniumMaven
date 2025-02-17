package com.example.test;
import org.testng.annotations.Test;

public class day3b {
	@Test
	public void testSeven() {
		System.out.println("Test case seven.....");
	}
	
	@Test(groups="smoke")
	public void testEight() {
		System.out.println("Test case Eight ........");

	}
		
	@Test(groups="smoke")
	public void testNine() {
		System.out.println("Test case Nine");
	}


}
