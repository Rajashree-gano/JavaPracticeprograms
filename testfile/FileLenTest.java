package com.stackroute.test;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.coding.FileLen;
public class FileLenTest {

private static FileLen len;
    
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        len= new  FileLen();
    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
    len= null;

    }
    
    @Test
    public void testFileLength() {
        String expect = "GOOD MORNING";
        assertEquals(expect, len.upperCase("/home/rajashree/Desktop/uppercase.txt"));
        assertEquals("13.0", len.fileLength("/home/rajashree/Desktop/uppercase.txt"));

    }
}
