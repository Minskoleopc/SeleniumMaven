package com.example.test;

import org.testng.annotations.Test;

public class day4 {
	
	@Test(priority = 1)
	public void TestCaseA() {
		System.out.println("Testcase one ....");
	}
	
	@Test(priority = 0)
	public void TestCaseB() {
		System.out.println("Testcase two ....");
	}
	
	@Test(priority = -1)
	public void TestCaseC() {
		System.out.println("Testcase three ....");
	}
	
	
	

}
