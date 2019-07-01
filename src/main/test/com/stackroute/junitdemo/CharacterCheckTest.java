package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterCheckTest {
    //arrange
    CharacterCheck obj;
    @Before
    public void setUp() throws Exception
    {
        obj=new CharacterCheck();
    }
    @After
    public void tearDown() throws Exception
    {
        obj=null;
    }
    @Test
    public void givenCharacterisCheckedforDigitAndPrintsDigit()
    {
        //Add
        String result= obj.charcheck('7');
        //Assert
        assertEquals("Digit",result);

    }
    @Test
    public void givenCharacterisCheckedForUpperCaseAlphabetAndPrintsUpperCase()
    {
        //Add
        String result= obj.charcheck('A');
        //Assert
        assertEquals("Upper Case",result);

    }
    @Test
    public void givenCharacterisCheckedForLowerCaseAlphabet()
    {
        //Add
        String result= obj.charcheck('a');
        //Assert
        assertEquals("Lower Case",result);

    }
    @Test
    public void givenCharacterisCheckedForSpecialCharacterAndPrintsSpecialCharacter()
    {
        //Add
        String result= obj.charcheck('#');
        //Assert
        assertEquals("Special Character",result);

    }
}