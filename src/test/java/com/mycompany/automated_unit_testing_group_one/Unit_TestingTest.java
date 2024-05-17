/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.automated_unit_testing_group_one;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author siyan
 */
public class Unit_TestingTest {
    
    public Unit_TestingTest() {
    }

    @Test
    public void testAdditionMethod() {
        
        // Create an instance of trh class
        Unit_Testing ut = new Unit_Testing();
        
        int expected = 4;
        int actual = ut.addition(2, 2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtractionMethod(){
        
        // Create an instance of trh class
        Unit_Testing ut = new Unit_Testing();
        
        int expected = 6;
        int actual = ut.subtraction(10, 4);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMessageMethod(){
        
        Unit_Testing ut = new Unit_Testing();
        String expected = "Hello World";
        String actual = ut.message();
        assertEquals(expected, actual);
    }
}
