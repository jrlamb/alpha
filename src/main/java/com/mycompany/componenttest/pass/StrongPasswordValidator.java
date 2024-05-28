/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.componenttest.pass;

import java.util.regex.Pattern;

/**
 *
 * @author lamb
 */
public class StrongPasswordValidator implements PasswordValidator {

    private static final Pattern LENGTH_PATTERN = Pattern.compile(".{8,}");
    private static final Pattern UPPERCASE_PATTERN = Pattern.compile(".*[A-Z].*");
    private static final Pattern LOWERCASE_PATTERN = Pattern.compile(".*[a-z].*");
    private static final Pattern DIGIT_PATTERN = Pattern.compile(".*\\d.*");
    private static final Pattern SPECIAL_CHARACTER_PATTERN = Pattern.compile(".*[!@#$%^&*(),.?\":{}|<>].*");

    @Override
    public boolean isValid(String login, String pass) {
        if (pass == null || login == null) {
            return false;
        }

        if (!LENGTH_PATTERN.matcher(pass).matches()) {
            return false;
        }

        if (!UPPERCASE_PATTERN.matcher(pass).matches()) {
            return false;
        }

        if (!LOWERCASE_PATTERN.matcher(pass).matches()) {
            return false;
        }

        if (!DIGIT_PATTERN.matcher(pass).matches()) {
            return false;
        }

        if (!SPECIAL_CHARACTER_PATTERN.matcher(pass).matches()) {
            return false;
        }

        if (pass.toLowerCase().contains(login.toLowerCase())) {
            return false;
        }

        return true;
    }

}
