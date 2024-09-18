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

    @Test
    public void EmailCorrectTest() {
        boolean result=UserRegistration.validateEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void EmailIncorrectTest() {
        boolean result=UserRegistration.validateEmail("abc.com");
        Assert.assertFalse(result);
    }

    @Test
    public void PhoneNumberCorrectTest() {
        boolean result=UserRegistration.validatePhone("91 8878564543");
        Assert.assertTrue(result);
    }
    @Test
    public void PhoneNumberIncorrectTest() {
        boolean result=UserRegistration.validatePhone("5436546546");
        Assert.assertFalse(result);
    }

    @Test
    public void PasswordCorrectTest() {
        boolean result=UserRegistration.validatePassword("Kajal@123");
        Assert.assertTrue(result);
    }

    @Test
    public void PasswordIncorrectTest() {
        boolean result=UserRegistration.validatePassword("kajal234");
        Assert.assertFalse(result);
    }

    @Test
    public void allEmailSamplesCorrectTest() {
        Assert.assertTrue(UserRegistration.validateAllEmailSamples("abc@yahoo.com"));
        Assert.assertTrue(UserRegistration.validateAllEmailSamples("abc-100@yahoo.com"));
        Assert.assertTrue(UserRegistration.validateAllEmailSamples("abc.100@yahoo.com"));
        Assert.assertTrue(UserRegistration.validateAllEmailSamples("abc111@abc.com"));
        Assert.assertTrue(UserRegistration.validateAllEmailSamples("abc-100@abc.net"));
        Assert.assertTrue(UserRegistration.validateAllEmailSamples("abc.100@abc.com.au"));
        Assert.assertTrue(UserRegistration.validateAllEmailSamples("abc@1.com"));
        Assert.assertTrue(UserRegistration.validateAllEmailSamples("abc@gmail.com.com"));
        Assert.assertTrue(UserRegistration.validateAllEmailSamples("abc+100@gmail.com.com"));
    }
}
