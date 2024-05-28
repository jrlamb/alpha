/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.componenttest.email;

import java.util.regex.Pattern;

/**
 *
 * @author lamb
 */
public class StrongEmailValidator implements EmailValidator{

    // Regex pattern for strong email validation
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
        "^(?=.{1,64}@.{1,253}$)(?=.{6,})([A-Za-z0-9_\\-.]+)@([A-Za-z0-9\\-]+\\.[A-Za-z]{2,})$"
    );

    @Override
    public boolean isValid(String email) {
        if (email == null) {
            return false;
        }
        return EMAIL_PATTERN.matcher(email).matches();
    }    
}
