package com.stackroute.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.coding.EvenNumTest;

public class EvenNumTestcase {
	//private static EvenNumTest even;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		//even=new EvenNumTest();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		//even=null;

	}

	@Test
	public void testIseven() {
		assertEquals("testIseven()",true,EvenNumTest.isEven(44));
		assertEquals("testIseven()",false,EvenNumTest.isEven(33));
	}

}
