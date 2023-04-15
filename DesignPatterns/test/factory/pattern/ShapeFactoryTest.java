/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package factory.pattern;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Class used to test the ShapeFactory class
 *
 * @author Kushal Patel
 * @version 1.0
 */
public class ShapeFactoryTest {

    public ShapeFactoryTest() {
    }

    /**
     * Test of Shape CIRCLE , of class ShapeFactory.
     */
    @Test
    public void testGetShapeCircle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape(ShapeFactory.ShapeType.CIRCLE);

        assertEquals(shape.getClass(), Circle.class);

    }

    /**
     * Test of Shape SQUARE , of class ShapeFactory.
     */
    @Test
    public void testGetShapeSqare() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape(ShapeFactory.ShapeType.SQUARE);

        assertEquals(shape.getClass(), Square.class);

    }

    /**
     * Test of Shape RECTANGLE , of class ShapeFactory.
     */
    @Test
    public void testGetShapeRectangle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape(ShapeFactory.ShapeType.RECTANGLE);

        assertEquals(shape.getClass(), Rectangle.class);

    }

}
