package com.example.test;

import org.testng.annotations.Test;

public class day5 {
		
		// if a test does not have a priority then default priority = 0
		// if two test has same priority then they execute in alphabetical order
		
		@Test(priority=1)
		public void testC() {
			System.out.println("Test case one");
		}
		
		@Test(priority=2)
		public void testD() {
			System.out.println("Test case two");
		}
		// By default priority = 0
		@Test
		public void testE() {
			System.out.println("Test case three");
		}
		
}
