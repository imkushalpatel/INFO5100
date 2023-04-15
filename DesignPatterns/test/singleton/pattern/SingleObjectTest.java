/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package singleton.pattern;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Class used to test the SingletonObject class
 *
 * @author Kushal Patel
 * @version 1.0
 */
public class SingleObjectTest {

    public SingleObjectTest() {
    }

    /**
     * Test of getInstance method, of class SingleObject.
     */
    @Test
    public void testGetInstance() {
        SingleObject object1 = SingleObject.getInstance();
        SingleObject object2 = SingleObject.getInstance();

        assertEquals(object1, object2);

    }

}
