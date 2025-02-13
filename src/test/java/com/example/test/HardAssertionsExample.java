package com.example.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsExample {
	
	
	
	@Test
	public void testOne() {
		String actual = "Hello";
		String expected = "Hell";
		Assert.assertEquals(actual, expected,"Title does not match");
		
	}
	
	@Test
	public void testTwo() {
		boolean isDisplayed = true;
		Assert.assertTrue(isDisplayed,"false should be true");
		
	}
	@Test
	public void testThree() {
		boolean isDisplayed = false;
		Assert.assertFalse(isDisplayed,"value should be false");
		
		
	}
	@Test
	public void testFour() {
		String actual = null;
		Assert.assertNull(actual,"String should be null");
		
	}
	
	

}
