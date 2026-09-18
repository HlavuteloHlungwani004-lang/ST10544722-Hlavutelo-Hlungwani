/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part1;

/**
 *
 * @author Student
 */
public class login {
        
    String registeredUsername;
    String registeredPassword;
    String firstName;
    String lastName;
    String cellPhoneNumber;
    
    public boolean checkUserName(String username) {
        if (username.contains("_") && username.length() <= 5) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean checkPasswordComplexity(String password) {
        if (password.length() < 8) {
            return false;
        }
        
        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
        
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                hasCapital = true;
            } 
            else if (Character.isDigit(ch)) {
                hasNumber = true;
            }     
            if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }
        
        return hasCapital && hasNumber && hasSpecial; 
    }
    
    public boolean checkCellPhoneNumber(String cellNumber) {
        if (!cellNumber.startsWith("+27")) {
            return false;
        }
        
        if (cellNumber.length() < 12 || cellNumber.length() > 13) {
            return false;
        }
        
        for (int i = 3; i < cellNumber.length(); i++) {
            if (!Character.isDigit(cellNumber.charAt(i))) {
            return false;
            }
        }
        
        return true;
    }
    
    public String registerUser(String username, String password, String firstName, String lastName, String cellNumber) {
        if (!checkUserName(username)) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is not more than five character in length.";
        }
        
        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted or please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        
        if (!checkCellPhoneNumber(cellNumber)) {
            return "cell phone number incorrectly formatted or does not contain an international code.";
        }
        
        this.registeredUsername = username;
        this.registeredPassword = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellPhoneNumber = cellNumber;
        
        return "Username successfully captured.\nPassword successfully captured.\nCell phone number successfully added.";
    }
    
    public boolean loginUser(String username, String password) {
        if (username.equals(registeredUsername) && password.equals(registeredPassword)) {
            return true;
        } else {
            return false;
        }
    }
    
    public String returnLoginStatus(boolean loginSuccess) {
        if (loginSuccess) {
            return "Welcome " + this.firstName + ", " + this.lastName + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
    
}
