/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.pattern;

/**
 * Factory class that will allow for the creation of the objects without
 * exposing the logic behind it.
 *
 * @author Kushal Patel
 * @version 1.0
 */
public class ShapeFactory {

    public enum ShapeType {
        CIRCLE, RECTANGLE, SQUARE;
    }

    /**
     * Method that will return a Shape depending upon the parameter received.
     *
     * @param shapeType A String value that will determine what Object will be
     * returned, the values it can take are "Circle", "Rectangle" and "Square"
     * @return The required Shape object
     */
    public Shape getShape(ShapeType shapeType) {
        return switch (shapeType) {
            case CIRCLE ->
                new Circle();
            case RECTANGLE ->
                new Rectangle();
            case SQUARE ->
                new Square();
            default ->
                null;
        };

    }
}
