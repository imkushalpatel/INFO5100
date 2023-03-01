/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author imkus
 */
public class UserDirectory {

    private ArrayList<User> userList;

    public UserDirectory() {
        userList = new ArrayList<>();
    }

    ArrayList<User> getAllUser() {
        return userList;
    }

    User getUser(String employeeId) {
        return userList.stream().filter((u) -> u.getEmployeeId().equals(employeeId)).findAny().get();
    }

    public boolean addUser(User user) {
        user.generateEmployeeId();
        return userList.add(user);
    }

    public User updateUser(String employeeId, User user) {
        int index = userList.indexOf(userList.stream().filter((u) -> u.getEmployeeId().equals(employeeId)).findAny().get());
        return userList.set(index, user);
    }

    public boolean removeUser(User user) {
        return userList.remove(user);
    }

    public boolean removeUser(String employeeId) {
        return userList.removeIf((u) -> u.getEmployeeId().equals(employeeId));
    }

}
