/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton.pattern;

/**
 * The Main class for Singleton Pattern
 *
 * @author Kushal Patel
 * @version 1.0
 */
public class SingletonMain {

    /**
     * The main method for this Demo.
     */
    public static void main(String[] args) {
        SingleObject onlyObject = SingleObject.getInstance();
        onlyObject.showMessage();
    }
}
