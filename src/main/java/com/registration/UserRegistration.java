package com.registration;

import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration problem ");
    }

    public boolean firstName(String fname) {
        return Pattern.matches("^[A-Z][a-z]{2,}",fname);
    }

    public boolean lastName(String lname) {
        return Pattern.matches("^[A-Z][a-z]{2,}",lname);
    }
}
