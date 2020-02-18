package com.registration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration registration = new UserRegistration();

    //test cases for FirstName
    @Test
    public void givenFirstName_whenProper_shouldReturnTrue() {
        boolean name = registration.firstName_validation("Lakshmi");
        Assert.assertEquals(true, name);
    }
    @Test
    public void givenFirstName_whenEnteredDigit_shouldReturnFalse() {
        boolean name = registration.firstName_validation("Lakshmi123");
        Assert.assertEquals(false, name);
    }
    @Test
    public void givenFirstName_whenStartsWithSmallLetter_shouldReturnFalse() {
        boolean name = registration.firstName_validation("lakshmi");
        Assert.assertEquals(false,name);
    }
    @Test
    public void givenFirstName_whenEnteredSpecialCharacter_shouldReturnFalse() {
        boolean name = registration.firstName_validation("Lakshmi@patil");
        Assert.assertEquals(false, name);
    }
    @Test
    public void givenFirstName_whenEntered_lessThanThreeCharacter_shouldReturnFalse() {
        boolean name = registration.firstName_validation("La");
        Assert.assertEquals(false, name);
    }

    //test cases for LastName
    @Test
    public void givenLastName_whenProper_shouldReturnTrue() {
        boolean name = registration.lastName_validation("Patil");
        Assert.assertEquals(true, name);
    }
    @Test
    public void givenLastName_whenEnteredDigit_shouldReturnFalse() {
        boolean name = registration.lastName_validation("Patil123");
        Assert.assertEquals(false, name);
    }
    @Test
    public void givenLastName_whenStartsWithSmallLetter_shouldReturnFalse() {
        boolean name = registration.lastName_validation("patil");
        Assert.assertEquals(false,name);
    }
    @Test
    public void givenLastName_whenEnteredSpecialCharacter_shouldReturnFalse() {
        boolean name = registration.lastName_validation("@patil");
        Assert.assertEquals(false, name);
    }
    @Test
    public void givenLastName_whenEntered_lessThanThreeCharacter_shouldReturnFalse() {
        boolean name = registration.lastName_validation("Pa");
        Assert.assertEquals(false, name);
    }

    //test cases for Email address
    @Test
    public void givenEmail_whenProper_shouldReturn_True() {
        boolean mail = registration.emailId_validation("abc.xyz@bl.co.in");
        Assert.assertEquals(true, mail);
    }
    @Test
    public void givenEmail_whenSpecialCharacter_atStartOrEnd_shouldReturnFalse() {
        boolean mail = registration.emailId_validation("%abc.xyz@bl.co.in#");
        Assert.assertEquals(false, mail);
    }
    @Test
    public void givenEmail_whenMissing_atSymbol_shouldReturnFalse() {
        boolean mail = registration.emailId_validation("abc.xyz.co.in");
        Assert.assertEquals(false, mail);
    }
    @Test
    public void givenEmail_whenMissing_domain_shouldReturnFalse() {
        boolean mail = registration.emailId_validation("abc.xyz@gmail");
        Assert.assertEquals(false, mail);
    }

    //test cases for Mobile number
    @Test
    public void givenMobileNo_whenProper_shouldReturnTrue() {
        boolean mobile = registration.mobileNo_validation("91 9876543210");
        Assert.assertEquals(true, mobile);
    }
    @Test
    public void givenMobileNo_whenSpaceNotEntered_shouldReturnFalse() {
        boolean mobile = registration.mobileNo_validation("919876543210");
        Assert.assertEquals(false, mobile);
    }
    @Test
    public void givenMobileNo_whenNotEntered_Exact_10Digit_shouldReturnFalse() {
        boolean mobile = registration.mobileNo_validation("76543210");
        Assert.assertEquals(false, mobile);
    }

    //test cases for password
    @Test
    public void givenPassword_withMinimum_8_character_shouldReturnTrue() {
        boolean password = registration.password_shouldMinimum_8_character("Lakshmi@123");
        Assert.assertEquals(true,password);
    }
    @Test
    public void givenPassword_withMinimum_One_Uppercase_shouldReturnTrue() {
        boolean password = registration.password_shouldMinimum_8_character("lakshmiPatil@123");
        Assert.assertEquals(true, password);
    }
    @Test
    public void givenPassword_withMinimum_One_NumericNumber_shouldReturnTrue() {
        boolean password = registration.password_shouldMinimum_8_character("Lakshmi123");
        Assert.assertEquals(true, password);
    }


    @Test
    public void givenPassword_within_8_character_shouldReturnFalse() {
        boolean password = registration.password_shouldMinimum_8_character("abc@2");
        Assert.assertEquals(false, password);
    }
    @Test
    public void givenPassword_whenMissingUppercase_shouldReturnFalse() {
        boolean password = registration.password_shouldMinimum_8_character("lakshmi@123");
        Assert.assertEquals(false, password);
    }
    @Test
    public void givenPassword_whenMissing_NumericNumber_shouldReturnFalse() {
        boolean password = registration.password_shouldMinimum_8_character("LakshmiPatil");
        Assert.assertEquals(false, password);
    }

}
