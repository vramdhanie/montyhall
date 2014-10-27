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
        GameInstance instance = new GameInstance(1,2,3);
        String expResult = "Winning Door:1, Other Doors:2,3";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of findOtherNonWinningDoor method, of class GameInstance.
     */
    @Test
    public void testFindOtherNonWinningDoorChoiceEqualsWin() {
        System.out.println("find Other Non Winning Door When Choice is the winning door");
        int choice = 1;
        GameInstance instance = new GameInstance(1, 2, 3);
        int expResult = 3;
        int result = instance.findOtherNonWinningDoor(choice);
        assertEquals(expResult, result);
    }

    /**
     * Test of findOtherNonWinningDoor method, of class GameInstance.
     */
    @Test
    public void testFindOtherNonWinningDoorChoiceEqualsOther() {
        System.out.println("find Other Non Winning Door When Choice is the other door");
        int choice = 3;
        GameInstance instance = new GameInstance(1, 2, 3);
        int expResult = 1;
        int result = instance.findOtherNonWinningDoor(choice);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of findOtherNonWinningDoor method, of class GameInstance.
     */
    @Test
    public void testFindOtherNonWinningDoorChoiceEqualsLose() {
        System.out.println("find Other Non Winning Door When Choice is the losing door");
        int choice = 2;
        GameInstance instance = new GameInstance(1, 2, 3);
        int expResult = 1;
        int result = instance.findOtherNonWinningDoor(choice);
        assertEquals(expResult, result);
    }
    /**
     * Test of getWin method, of class GameInstance.
     */
    @Test
    public void testGetWin() {
        System.out.println("getWin");
        GameInstance instance = new GameInstance(1,2,3);
        int expResult = 1;
        int result = instance.getWin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWin method, of class GameInstance.
     */
    @Test
    public void testSetWin() {
        System.out.println("setWin");
        int win = 1;
        GameInstance instance = new GameInstance();
        instance.setWin(win);
        assertEquals(win, instance.getWin());
    }

    /**
     * Test of getLose method, of class GameInstance.
     */
    @Test
    public void testGetLose() {
        System.out.println("getLose");
        GameInstance instance = new GameInstance(1,2,3);
        int expResult = 2;
        int result = instance.getLose();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setLose method, of class GameInstance.
     */
    @Test
    public void testSetLose() {
        System.out.println("setLose");
        int lose = 2;
        GameInstance instance = new GameInstance();
        instance.setLose(lose);
        assertEquals(lose, instance.getLose());
    }

    /**
     * Test of getOther method, of class GameInstance.
     */
    @Test
    public void testGetOther() {
        System.out.println("getOther");
        GameInstance instance = new GameInstance(1,2,3);
        int expResult = 3;
        int result = instance.getOther();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOther method, of class GameInstance.
     */
    @Test
    public void testSetOther() {
        System.out.println("setOther");
        int other = 3;
        GameInstance instance = new GameInstance();
        instance.setOther(other);
        assertEquals(other, instance.getOther());
    }
    
}
