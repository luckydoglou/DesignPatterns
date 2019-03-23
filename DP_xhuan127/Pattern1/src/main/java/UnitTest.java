package main.java;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * This unit test class tests the functionalities of students grades, using Strategy design pattern.
 * @author Xiaolou Huang
 *
 */
public class UnitTest {
    
    Student s1;
    Student s2;
    Student s3;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * This method sets up the necessary variables.
     * @throws Exception exception
     */
    @Before
    public void setUp() throws Exception {
        // lets create some grades
        int[] grades = {90,80,70,90};
        
        s1 = new Student("Lea", Major.CS, grades);
        s2 = new Student("Astrid", Major.SER, grades);
        s3 = new Student("Gisela", Major.IT, grades);
        
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        System.out.println("Test CS algorithm:");
        assertEquals("SER algorithm fails", 82.5, s1.calculateFinalGrade(), 0.01);
        System.out.println("Test SER algorithm:");
        assertEquals("CS algorithm fails", 79.5, s2.calculateFinalGrade(), 0.01);
        System.out.println("Test IT algorithm:");
        assertEquals("IT algorithm fails", 86.0, s3.calculateFinalGrade(), 0.01);
    }

}
