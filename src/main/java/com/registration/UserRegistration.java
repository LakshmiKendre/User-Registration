package com.registration;

import javax.swing.*;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration problem ");
    }

    public boolean firstName_validation(String fname) {
        return Pattern.matches("^[A-Z][a-z]{2,}",fname);
    }

    public boolean lastName_validation(String lname) {
        return Pattern.matches("^[A-Z][a-z]{2,}",lname);
    }

    public boolean emailId_validation(String email) {
        return Pattern.matches("^([a-z]{3,}|[a-z]{3,}[.][a-z]{3,})[@]([a-z]{2,}[.][a-z]{2,}|[a-z]{2,}[.][a-z]{2,}[.][a-z]{2,})",email);
    }

    public boolean mobileNo_validation(String mobile) {
        return Pattern.matches("^([0-9]{2}[ ][1-9][0-9]{9})",mobile);
    }

    public boolean password_shouldMinimum_8_charactor(String password) {
        return Pattern.matches("^[a-zA-Z0-9!@#$%^&*()_+-/?.;:=']{8,}",password);
    }
}
