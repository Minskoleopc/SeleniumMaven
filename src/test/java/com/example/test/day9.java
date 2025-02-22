package com.example.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class day9 {

	
	@DataProvider(name="logiData")
	public Object[][] getData(){
		return new Object[][] {
			
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}
			
		};
		
	}
	
	@Test(dataProvider = "logiData")
	public void loginTest(String username,String password) {
		System.out.println(username);
		System.out.println(password);
		
//		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        // Create an instance of WebDriver
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.saucedemo.com/v1/");
//        driver.findElement(By.id("user-name")).sendKeys(username);
//        driver.findElement(By.id("passwoerc")).sendKeys(password);
//        driver.findElement(By.id("login-button")).click();

		
	}
	

	
	
	
}
