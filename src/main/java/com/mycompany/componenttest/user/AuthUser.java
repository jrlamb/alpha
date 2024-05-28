/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.componenttest.user;

import com.mycompany.componenttest.email.EmailValidator;
import com.mycompany.componenttest.pass.PasswordValidator;

/**
 *
 * @author lamb
 */
public class AuthUser {
    EmailValidator e;
    PasswordValidator p;

    public AuthUser(EmailValidator e, PasswordValidator p) {
        this.e = e;
        this.p = p;
    }
    
    public void autenticar(String email, String pass, String login){
        if (e.isValid(email)){
            System.out.println("Email autenticado com sucesso");
        }
        
        if (p.isValid(login, pass)){
            System.out.println("Senha autenticada com sucesso");
        }
    }
    
}
