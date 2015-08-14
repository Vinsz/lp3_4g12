package com.br.lp3.controller;

/**
 *
 * @author 31431038
 */
public class LoginManager {
    
    private String username, password;
    
    public static boolean authorize(String username, String password){
        return ("vinicius".equals(username)&&"123".equals(password));           
    }
    
}
