package com.stackroute.test;

import static org.junit.Assert.*;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotEquals;
//import static org.junit.Assert.assertNotNull;     

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
//import java.util.Arrays;
import com.stackroute.coding.CheckFile;
import org.junit.Test;

public class CheckFileTest {
	// private static CheckFile check;
	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		//check = new CheckFile();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		//check = null;

	}

	@Test
	public void testFileFilter() {
		File folder1 = new File("/home/rajashree/Desktop/filecheck/");
		assertEquals("HELLO WORLD", CheckFile.listFilesForFolder(folder1));
	}
}
