/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.componenttest.email;

/**
 *
 * @author lamb
 */
public class WeakValidator implements EmailValidator{

     @Override
    public boolean isValid(String email) {
        if (email == null) {
            return false;
        }
        return email.contains("@") && email.endsWith(".com");
    }
    
}
