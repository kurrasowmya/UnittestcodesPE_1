package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome pal=new Palindrome();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void givenNumberisCheckedforPalindromeAndEvenSumlessThan25ThenPrintsReturnStatement()
    {
        //Add
        String result = pal.palindromeandgreater(123454321);
        //Assert
        assertEquals("Number is palindrome and sum of even numbers is less than 25", result);
    }
    @Test
    public void givenNumberisNotApalindromeAndEvenSumNotCalculatedThenPrintsReturnStatement()
    {
        //Add
        String result = pal.palindromeandgreater(126541);
        //Assert
        assertEquals("Number is not a palindrome", result);
    }
    @Test
    public void givenNumberisCheckedforPalindromeAndEvenSumGreaterThan25ThenPrintsReturnStatement()
    {
        //Add
        String result = pal.palindromeandgreater(8638368);
        //Assert
        assertEquals("Number is palindrome and sum of even numbers is greater than 25", result);
    }


}