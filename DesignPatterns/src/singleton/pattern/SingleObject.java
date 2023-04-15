/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton.pattern;

/**
 * Allows the demo class to get a single package out of this class so that only
 * ne instance can be made
 *
 * @author Kushal Patel
 * @version 1.0
 */
public class SingleObject {

    private static final SingleObject instance = new SingleObject();

    private SingleObject() {
    }

    /**
     * Returns an instance of this class; Can only be used once.
     *
     * @return An object of type SingleObject
     */
    public static SingleObject getInstance() {
        return instance;
    }

    /**
     * Displays a random String, "Hello, World!" in this case; Does not return
     * anything.
     */
    public void showMessage() {
        System.out.println("Hello, World!");
    }
}
