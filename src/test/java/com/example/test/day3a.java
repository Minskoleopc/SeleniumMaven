package com.example.test;
import org.testng.annotations.Test;

public class day3a {
	
	@Test(groups={"regression"})
	public void testFour() {
		System.out.println("Test case one .....");
	}
	
	@Test
	public void testFive() {
		System.out.println("Test case two ........");

	}
		
	@Test(groups={"smoke","regression"})
	public void testSix() {
		System.out.println("Test case six");
	}


}
