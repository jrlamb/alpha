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
public class WeakPasswordValidator implements PasswordValidator {

    private static final Pattern LENGTH_PATTERN = Pattern.compile(".{8,}");

    @Override
    public boolean isValid(String login, String pass) {
        if (pass == null || login == null) {
            return false;
        }

        if (!LENGTH_PATTERN.matcher(pass).matches()) {
            return false;
        }

        return true;
    }

}
