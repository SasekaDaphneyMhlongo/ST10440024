
package ST10440024;

import java.util.Scanner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class tasksTest {
    
    public tasksTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Auto method, of class tasks.
     */
    @Test
    public void testAuto() {
        System.out.println("Auto");
        tasks instance = null;
        String expResult = "";
        String result = instance.Auto();
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of description method, of class tasks.
     */
    @Test
    public void testDescription() {
        System.out.println("description");
        String descript = "";
        tasks instance = null;
        boolean expResult = false;
        boolean result = instance.description(descript);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTasks method, of class tasks.
     */
    @Test
    public void testAddTasks() {
        System.out.println("addTasks");
        Scanner scan = null;
        tasks.addTasks(scan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returntotalhours method, of class tasks.
     */
    @Test
    public void testReturntotalhours() {
        System.out.println("returntotalhours");
        int[] duration = null;
        tasks instance = null;
        int expResult = 0;
        int result = instance.returntotalhours(duration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Duration method, of class tasks.
     */
    @Test
    public void testDuration() {
        System.out.println("Duration");
        String[] name = null;
        int[] jjj = null;
        tasks.Duration(name, jjj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
