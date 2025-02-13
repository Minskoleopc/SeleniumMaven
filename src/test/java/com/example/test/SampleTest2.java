package com.example.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest2 {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Runnes before every test");
		
	}
	
	@Test
	public void testOne() {
		System.out.println("Test case one .....");
	}
	
	@Test
	public void testTwo() {
		System.out.println("Test case two ........");

	}
		
	@AfterMethod
	public void afterMethod() {
		System.out.println("Runes after every test");
	}

	
	
	

}
