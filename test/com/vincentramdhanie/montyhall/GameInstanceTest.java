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
public class GameInstanceTest {
    
    public GameInstanceTest() {
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
     * Test of toString method, of class GameInstance.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        GameInstance instance = new GameInstance();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOtherNonWinningDoor method, of class GameInstance.
     */
    @Test
    public void testFindOtherNonWinningDoor() {
        System.out.println("findOtherNonWinningDoor");
        int choice = 0;
        GameInstance instance = new GameInstance();
        int expResult = 0;
        int result = instance.findOtherNonWinningDoor(choice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWin method, of class GameInstance.
     */
    @Test
    public void testGetWin() {
        System.out.println("getWin");
        GameInstance instance = new GameInstance();
        int expResult = 0;
        int result = instance.getWin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWin method, of class GameInstance.
     */
    @Test
    public void testSetWin() {
        System.out.println("setWin");
        int win = 0;
        GameInstance instance = new GameInstance();
        instance.setWin(win);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLose method, of class GameInstance.
     */
    @Test
    public void testGetLose() {
        System.out.println("getLose");
        GameInstance instance = new GameInstance();
        int expResult = 0;
        int result = instance.getLose();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLose method, of class GameInstance.
     */
    @Test
    public void testSetLose() {
        System.out.println("setLose");
        int lose = 0;
        GameInstance instance = new GameInstance();
        instance.setLose(lose);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOther method, of class GameInstance.
     */
    @Test
    public void testGetOther() {
        System.out.println("getOther");
        GameInstance instance = new GameInstance();
        int expResult = 0;
        int result = instance.getOther();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOther method, of class GameInstance.
     */
    @Test
    public void testSetOther() {
        System.out.println("setOther");
        int other = 0;
        GameInstance instance = new GameInstance();
        instance.setOther(other);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
