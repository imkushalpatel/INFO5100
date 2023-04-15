/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faced.pattern;

/**
 * Uses the concrete classes Circle, Rectangle and Square to delegate user calls
 * and draw the respective shapes
 *
 * @author Kushal Patel
 * @version 1.0
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    /**
     * Initializes the shape objects
     */
    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public Shape getCircle() {
        return circle;
    }

    public Shape getRectangle() {
        return rectangle;
    }

    public Shape getSquare() {
        return square;
    }

    /**
     * Executes the draw() method of the Circle class
     */
    public void drawCircle() {
        System.out.println(circle.draw());

    }

    /**
     * Executes the draw() method of the Rectangle class
     */
    public void drawRectangle() {
        System.out.println(rectangle.draw());

    }

    /**
     * Executes the draw() method of the Square class
     */
    public void drawSquare() {
        System.out.println(square.draw());

    }
}
