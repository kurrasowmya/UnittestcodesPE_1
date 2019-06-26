package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharactercheckTest {
    //arrange
    Charactercheck app=new Charactercheck();
    @Before
    public void setUp() throws Exception
    {
        System.out.println("Before");
    }
    @After
    public void tearDown() throws Exception
    {
        System.out.println("After");
    }
    @Test
    public void givenCharacterisCheckedforDigitAndPrintsDigit()
    {
        //Add
        String result= app.charcheck('7');
        //Assert
        assertEquals("Digit",result);

    }
    @Test
    public void givenCharacterisCheckedForUpperCaseAlphabetAndPrintsUpperCase()
    {
        //Add
        String result= app.charcheck('A');
        //Assert
        assertEquals("Upper Case",result);

    }
    @Test
    public void givenCharacterisCheckedForLowerCaseAlphabet()
    {
        //Add
        String result= app.charcheck('a');
        //Assert
        assertEquals("Lower Case",result);

    }
    @Test
    public void givenCharacterisCheckedForSpecialCharacterAndPrintsSpecialCharacter()
    {
        //Add
        String result= app.charcheck('#');
        //Assert
        assertEquals("Special Character",result);

    }
}