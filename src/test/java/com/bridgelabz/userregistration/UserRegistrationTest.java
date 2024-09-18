package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void FirstNameCorrectTest() {
        boolean result = UserRegistration.isValidFirstName("Kajal");
        Assert.assertTrue(result);    }

    @Test
    public void FirstNameIncorrectTest() {
        boolean result = UserRegistration.isValidFirstName("payal");
        Assert.assertFalse(result);
    }

    @Test
    public void LastNameCorrectTest() {
        boolean result = UserRegistration.isValidLastName("Wankhede");
        Assert.assertTrue(result);
    }

    @Test
    public void LastNameIncorrectTest() {
        boolean result = UserRegistration.isValidLastName("wankhede");
        Assert.assertFalse(result);
    }
}
