/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.awt.Image;
import java.time.LocalDate;
import javax.swing.ImageIcon;

/**
 *
 * @author imkus
 */
public class User {

    public static final String EMPLOYEEIDINITIAL = "EMP";
    static int employeeIdCount = 0;
    public static final String DEFAULTIMAGE = "src/view/profile.jpg";

    String firstName;
    String lastName;
    String employeeId;

    public enum Gender {
        MALE, FEMALE, OTHER;
    }
    Gender gender;
    LocalDate birthDate;
    LocalDate startDate;

    String phone;
    String email;
    String level;
    Image profileImage;

    public User(String firstName, String lastName, Gender gender, LocalDate birthDate, LocalDate startDate, String phone, String email, String level) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.startDate = startDate;
        this.phone = phone;
        this.email = email;
        this.level = level;

    }

    public User() {

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void generateEmployeeId() {
        this.employeeId = User.EMPLOYEEIDINITIAL + User.employeeIdCount++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Image getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(Image profileImage) {
        this.profileImage = profileImage;
    }

    public void setDefaultProfileImage() {
        this.profileImage = new ImageIcon(DEFAULTIMAGE).getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
    }

}
