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

    public static void main(String[] args)
    {
        System.out.println("Welcome to User Registration Problem");
        String testName1 = "Kajal";
        System.out.println(testName1 + " is " + (isValidFirstName(testName1) ? "a valid" : "an invalid") + " first name.");
        String lastName = "Wankhede";
        System.out.println(lastName + " is " + (isValidLastName(lastName) ? "a valid" : "an invalid") + " last name.");
    }
}
