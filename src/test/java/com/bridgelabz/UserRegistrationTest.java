package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturn_True() {
        UserRegistration UserRegistration = new UserRegistration();
        boolean result = UserRegistration.validateFirstName("Gopinath");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturn_False() {
        UserRegistration UserRegistration = new UserRegistration();
        boolean result = UserRegistration.validateFirstName("Go");
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturn_True() {
        UserRegistration UserRegistration = new UserRegistration();
        boolean result = UserRegistration.validateLastName("Das");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturn_False() {
        UserRegistration UserRegistration = new UserRegistration();
        boolean result = UserRegistration.validateLastName("Da");
        Assert.assertFalse(result);
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturn_True() {
        UserRegistration UserRegistration = new UserRegistration();
        boolean result = UserRegistration.validateEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmail_WhenNotProper_ShouldReturn_False() {
        UserRegistration UserRegistration = new UserRegistration();
        boolean result = UserRegistration.validateEmail("shubham@.com");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPhone_WhenProper_ShouldReturn_True() {
        UserRegistration UserRegistration = new UserRegistration();
        boolean result = UserRegistration.validatePhone("918105215414");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPhone_WhenNotProper_ShouldReturn_False() {
        UserRegistration UserRegistration = new UserRegistration();
        boolean result = UserRegistration.validatePhone("8105215414");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturn_True() {
        UserRegistration UserRegistration = new UserRegistration();
        boolean result = UserRegistration.validatePassword("abcdfdA@fg0");
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenNotProper_ShouldReturn_False() {
        UserRegistration UserRegistration = new UserRegistration();
        boolean result = UserRegistration.validatePassword("adasdas0daS");
        Assert.assertFalse(result);
    }
}
