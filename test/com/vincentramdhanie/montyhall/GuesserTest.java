package com.vincentramdhanie.montyhall;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vincent Ramdhanie
 */
public class GuesserTest {
    
    public GuesserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of roundWithNoChange method, of class Guesser.
     */
    @Test
    public void testRoundWithNoChange() {
        System.out.println("roundWithNoChange");
        Guesser instance = new Guesser();
        boolean expResult = false;
        boolean result = instance.roundWithNoChange();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of roundWithChange method, of class Guesser.
     */
    @Test
    public void testRoundWithChange() {
        System.out.println("roundWithChange");
        Guesser instance = new Guesser();
        boolean expResult = false;
        boolean result = instance.roundWithChange();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of runSimulation method, of class Guesser.
     */
    @Test
    public void testRunSimulation() {
        System.out.println("runSimulation");
        Guesser instance = new Guesser();
        instance.runSimulation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Guesser.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Guesser.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
