package com.registration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration registration = new UserRegistration();

    //test cases for FirstName
    @Test
    public void givenFirstName_whenProper_shouldReturnTrue() {
        boolean name = registration.firstName("Lakshmi");
        Assert.assertEquals(true, name);
    }

    //test cases for LastName
    @Test
    public void givenLastName_whenProper_shouldReturnTrue() {
        boolean name = registration.lastName("Patil");
        Assert.assertEquals(true, name);
    }

    //test cases for Email address
    @Test
    public void givenEmail_whenProper_shouldReturnTrue() {
        boolean mail = registration.emailId("abc.xyz@bl.co.in");
        Assert.assertEquals(true, mail);
    }

    // test cases for Mobile number
    @Test
    public void givenMobileNo_whenProper_shouldReturnTrue() {
        boolean mobile = registration.mobileNo("91 9876543210");
        Assert.assertEquals(true, mobile);
    }
}
