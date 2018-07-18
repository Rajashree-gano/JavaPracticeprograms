package com.stackroute.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import com.stackroute.coding.MemberVariable;

public class MemberTest {
	//public static MemberVariable str1; 
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
//		str1=new MemberVariable();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		//str1=null;

	}

	//@SuppressWarnings("static-access")
	@Test
	public void testDisplayMembervar() {
		assertArrayEquals(new String[] {"Member Name:HarryPotter","Member Age:30","Member Salary:2500.3"}, MemberVariable.displayMemberVariable(new String[] {"Member Name:","Member Age:","Member Salary:"} ));
	}

}
