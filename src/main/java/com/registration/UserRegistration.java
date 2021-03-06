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
        return Pattern.matches("^([a-zA-Z]{3,}([.|_|+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$",email);
    }

    public boolean mobileNo_validation(String mobile) {
        return Pattern.matches("^([0-9]{2}[ ][1-9][0-9]{9})",mobile);
    }

    public boolean password_Validation(String password) {
        return Pattern.matches("^((?=.*?[A-Z])(?=.*?[0-9])(?=[^#|?|!|@|$|%|&|*|-]*[#|?|!|@|$|%|&|*|-][^#|?|!|@|$|%|^|&|*|-]*$)[a-zA-Z0-9#?!@$%^&*-]{8,})$",password);
    }

}


