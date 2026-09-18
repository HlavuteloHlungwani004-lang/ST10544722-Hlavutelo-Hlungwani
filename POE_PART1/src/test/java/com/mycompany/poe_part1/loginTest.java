/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.poe_part1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Student
 */
public class loginTest {
    
    public loginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkUserName method, of class login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "Kyl_1";
        login instance = new login();
        boolean expResult = true;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
 
    }

    /**
     * Test of checkPasswordComplexity method, of class login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Password@2233";
        login instance = new login();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);

    }

    /**
     * Test of checkCellPhoneNumber method, of class login.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String cellNumber = "+27721779444";
        login instance = new login();
        boolean expResult = true;
        boolean result = instance.checkCellPhoneNumber(cellNumber);
        assertEquals(expResult, result);

    }

    /**
     * Test of registerUser method, of class login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "Kyl_1";
        String password =  "Password@2233";
        String firstName = "Hlavutelo";
        String lastName = "Hlungwani";
        String cellNumber = "+27721779444";
        login instance = new login();
        String expResult = "Username successfully captured.\nPassword successfully captured.\nCell phone number successfully added.";
        String result = instance.registerUser(username, password, firstName, lastName, cellNumber);
        assertEquals(expResult, result);

    }

    /**
     * Test of loginUser method, of class login.
     */
    @Test
    public void testLoginUser() {

        String username = "Kyl_1";
        String password = "Password@2233";        
        login instance = new login();
        boolean expResult = true;
    }

    /**
     * Test of returnLoginStatus method, of class login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String firstName = "Hlavutelo";
        String lastName = "Hlungwani";
        boolean loginSuccess = true;
        login instance = new login();
        String expResult ="Welcome " + firstName + ", " + lastName + " it is great to see you again.";

    }
    
}
