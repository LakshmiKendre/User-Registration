package com.registration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration registration = new UserRegistration();
    @Test
    public void testFirstName() {
        boolean name = registration.firstName("Lakshmi");
        Assert.assertEquals(true, name);

    }
}
