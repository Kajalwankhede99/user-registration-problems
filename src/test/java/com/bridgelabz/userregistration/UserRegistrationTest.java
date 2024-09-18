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
}
