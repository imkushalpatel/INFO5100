/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faced.pattern;

/**
 * The Main class for Facade Pattern
 *
 *
 * @author Kushal Patel
 * @version 1.0
 */
public class FacadeMain {

    /**
     * The main method for this Demo
     *
     */
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawSquare();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();

    }
}
