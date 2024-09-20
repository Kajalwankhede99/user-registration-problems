package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenValid_ShouldReturns_True() {
        boolean result=UserRegistration.isValidFirstName("Kajal");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenValid_ShouldReturns_False() {
        boolean result=UserRegistration.isValidFirstName("kajal");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturn_True() {
        boolean result=UserRegistration.isValidLastName("Wankhede");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturn_False() {
        boolean result=UserRegistration.isValidLastName("wankhede");
        Assert.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com","abc-100@yahoo.com"})
    public void givenEmail_WhenValid_ShouldReturn_True(String email) {
        boolean result=UserRegistration.validateEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc","abc@.com.my"})
    public void givenEmail_WhenValid_ShouldReturn_False(String email) {
        boolean result=UserRegistration.validateEmail("abc.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenValid_ShouldReturn_True() {
        boolean result=UserRegistration.validatePhone("91 8765432123");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhoneNumber_WhenValid_ShouldReturn_False() {
        boolean result=UserRegistration.validatePhone("432456543");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturn_True() {
        boolean result=UserRegistration.validatePassword("Kajal#123");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturn_False() {
        boolean result=UserRegistration.validatePassword("Kajal123");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailsamples_WhenValid_Return_True() {
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