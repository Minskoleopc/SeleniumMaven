package com.example.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4B {
	

	@Test(priority = 1)
	@Parameters({"username","password"})
	public void TestCaseA(String un , String pwd) {
		System.out.println("Testcase one ....");
		System.out.println(un);
		System.out.println(pwd);
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
