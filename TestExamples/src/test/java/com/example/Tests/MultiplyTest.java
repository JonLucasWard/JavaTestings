package com.example.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created this test by going to desired file to test, right click
 * go to new->junit test case->next and click the methods you want tested
 * 
 * @Test before each unique test you want
 */

public class MultiplyTest {

	@Test(expected = IllegalArgumentException.class) //passes if exception occurs
	public void testExceptionIsThrown() {
		multiplication tester = new multiplication(); //create instance of tested class
		tester.multiply(1000, 5); //run method
	}
	
	@Test
	public void testMultiply() {
		multiplication tester = new multiplication();
		//describe test, list expected result, run method
		assertEquals("10 x 5 is 50", 50, tester.multiply(10, 5));
		//fail("Not yet implemented"); auto fails test
	}

}
