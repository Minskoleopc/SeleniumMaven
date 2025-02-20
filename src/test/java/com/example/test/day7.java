package com.example.test;

import org.testng.annotations.Test;

public class day7 {

	@Test
	 public void login() {
		System.out.println("Login failed");
		throw new RuntimeException("Login failed");
	}
	
	@Test(dependsOnMethods = "login" ,alwaysRun = true)
	 public void Dashboard() {
		System.out.println("Navigating to Dashboard");
		
	}
	
}
