/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory.pattern;

/**
 * The Main class for Factory Pattern
 *
 * @author Kushal Patel
 * @version 1.0
 */
public class FactoryMain {

    /**
     * The main method for this Demo.
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape(ShapeFactory.ShapeType.CIRCLE);
        Shape shape2 = shapeFactory.getShape(ShapeFactory.ShapeType.RECTANGLE);
        Shape shape3 = shapeFactory.getShape(ShapeFactory.ShapeType.SQUARE);

        System.out.println(shape1.draw());
        System.out.println(shape2.draw());
        System.out.println(shape3.draw());
    }
}
