package com.example.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day6 {

	@Test
	public void login() {
		System.out.println("Login success");
	   Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = "login")
	public void searchProduct() {
		System.out.println("Search product test pass");
	}
	
	@Test(dependsOnMethods = {"login","searchProduct"})
	public void placeOrder() {
		System.out.println("Order place successfully");
	}
	
	@Test(dependsOnMethods = {"login","searchProduct","placeOrder"})
	public void payement() {
		System.out.println("Payment done successfully");
	}
	
	// circular dependency is not allowed
	
	
}
