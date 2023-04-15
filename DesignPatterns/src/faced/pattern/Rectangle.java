/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faced.pattern;

/**
 * A class to represent the shape rectangle that implements the Shape interface.
 *
 * @author Kushal Patel
 * @version 1.0
 */
public class Rectangle implements Shape {

    /**
     * Prints out a String to let user know which shape is drawn.
     *
     * @return Returns a string to let user know which shape is drawn.
     */
    @Override
    public String draw() {
        return "Rectangle Drawn";
    }
}
