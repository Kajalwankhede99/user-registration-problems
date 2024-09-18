package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean isValidFirstName(String firstName) {
        String regex = "[A-Z][a-z]{3,}";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(firstName).matches();
    }

    public static boolean isValidLastName(String lastName) {
        String regex = "[A-Z][a-z]{3,}";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(lastName).matches();
    }

    public static boolean validateEmail(String email) {
        String regex = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(email).matches();
    }

    public static boolean validatePhone(String phone) {
        String regex = "(0|91)?[-\\s]?[6-9][0-9]{9}";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(phone).matches();
    }

    public static boolean validatePassword(String password) {
        String regex = "((?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[@#$%]).{8,20})";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(password).matches();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem");
        String testName1 = "Kajal";
        System.out.println(testName1 + " is " + (isValidFirstName(testName1) ? "a valid" : "an invalid") + " first name.");
        String lastName = "Wankhede";
        System.out.println(lastName + " is " + (isValidLastName(lastName) ? "a valid" : "an invalid") + " last name.");
        String testEmail1 = "abc.xyz@bl.co.in";
        System.out.println(testEmail1 + " is " + (validateEmail(testEmail1) ? "a valid" : "an invalid") + " email address.");
        String testPhone = "91 9876543210";
        System.out.println(testPhone + " is " + (validatePhone(testPhone) ? "a valid" : "an invalid") + " phone number.");
        String testPassword = "Password@123";
        System.out.println(testPassword + " is " + (validatePassword(testPassword) ? "a valid" : "an invalid") + " password.");
    }
}
