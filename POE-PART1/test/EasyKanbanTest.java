/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class EasyKanbanTest {
    
    public EasyKanbanTest() {
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
     * Test of displayOptions method, of class EasyKanban.
     */
    @Test
    public void testDisplayOptions() {
        System.out.println("displayOptions");
        EasyKanban instance = null;
        instance.displayOptions();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of authenticate method, of class EasyKanban.
     */
    @Test
    public void testAuthenticate() {
        System.out.println("authenticate");
        EasyKanban instance = null;
        boolean expResult = false;
        boolean result = instance.authenticate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayMenu method, of class EasyKanban.
     */
    @Test
    public void testDisplayMenu() {
        System.out.println("displayMenu");
        EasyKanban instance = null;
        int expResult = 0;
        int result = instance.displayMenu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTasks method, of class EasyKanban.
     */
    @Test
    public void testAddTasks() {
        System.out.println("addTasks");
        EasyKanban instance = null;
        instance.addTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class EasyKanban.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EasyKanban.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
