/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part1;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class MyMainClass{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        login system = new login();
        
        System.out.println("==== POE PART 1 REGISTRATION ===");
        
        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();
        
        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();
        
        System.out.print("Create Username: ");
        String username = input.nextLine();
        
        System.out.print("Create Password: ");
        String password = input.nextLine();
        
        System.out.print("Enter South African CellNumber (+27): ");
        String cell = input.nextLine();
        
        String regOutput = system.registerUser(username, password, firstName, lastName, cell);
        
        System.out.println("----- Registration Status ---");
        System.out.println(regOutput);
        
        if (regOutput.contains("successfully")) {
            System.out.println("=== POE PART 1 LOGIN ==");
            
            System.out.print("Enter Username: ");
            String loginUser = input.nextLine();
            
            System.out.print("Enter Password: ");
            String loginPass = input.nextLine();
            
            boolean canLogin = system.loginUser(loginUser, loginPass);
            
            System.out.println("---- Login Status---");
            System.out.println(system.returnLoginStatus(canLogin));
        }
        
        input.close();
    }
}          
    
