/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package faced.pattern;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Class used to test the ShapeMaker class
 *
 * @author Kushal Patel
 * @version 1.0
 */
public class ShapeMakerTest {

    public ShapeMakerTest() {
    }

    /**
     * Test of drawCircle method, of class ShapeMaker.
     */
    @Test
    public void testDrawCircle() {
        System.out.println("drawCircle");
        ShapeMaker instance = new ShapeMaker();

        assertEquals(instance.getCircle().getClass(), Circle.class);
    }

    /**
     * Test of drawRectangle method, of class ShapeMaker.
     */
    @Test
    public void testDrawRectangle() {
        System.out.println("drawRectangle");
        ShapeMaker instance = new ShapeMaker();
        assertEquals(instance.getRectangle().getClass(), Rectangle.class);

    }

    /**
     * Test of drawSquare method, of class ShapeMaker.
     */
    @Test
    public void testDrawSquare() {
        System.out.println("drawSquare");
        ShapeMaker instance = new ShapeMaker();
        assertEquals(instance.getSquare().getClass(), Square.class);

    }

}
