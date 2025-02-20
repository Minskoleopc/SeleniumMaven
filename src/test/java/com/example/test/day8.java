package com.example.test;

import org.testng.annotations.Test;

public class day8 {
	// group level dependency
	
	@Test(groups="login")
	public void testLogin() {
		System.out.println("Login test passed");
	}
	
	@Test(groups="login")
	public void testDashboard() {
		System.out.println("Login test passed");
	}
	
	@Test(groups="search")
	public void Search() {
		System.out.println("Login test passed");
	}
	
	@Test(dependsOnGroups = {"login","search"})
	public void pay() {
		System.out.println("Login test passed");
	}
	
	
	
	

}
