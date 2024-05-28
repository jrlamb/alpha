/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.componenttest.app;

import com.mycompany.componenttest.email.EmailValidator;
import com.mycompany.componenttest.email.StrongEmailValidator;
import com.mycompany.componenttest.pass.PasswordValidator;
import com.mycompany.componenttest.pass.WeakPasswordValidator;
import com.mycompany.componenttest.user.AuthUser;

/**
 *
 * @author lamb
 */
public class Application {
    public static void main(String[] args) {
        EmailValidator e = new StrongEmailValidator();
        PasswordValidator p = new WeakPasswordValidator();                
        
        AuthUser user = new AuthUser(e, p);
        user.autenticar("", "", "");
    }
}
