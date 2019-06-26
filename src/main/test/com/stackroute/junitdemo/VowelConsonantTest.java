package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VowelConsonantTest
{
    //arrange
    VowelConsonant app=new VowelConsonant();
    @Before
    public void setUp() throws Exception
    {
        System.out.println("Before");
    }
    @After
    public void tearDown() throws Exception {
        System.out.println("After");
    }
    @Test
    public void givenStringinlowercaseisCheckedAndPrintVowelAreConsonant()
    {
        //Add
        String result= app.consonantvowelcheck("abce");
        //Assert
        assertEquals("VowelConsonantConsonantVowel",result);

    }
    @Test
    public void givenStringinUppercaseisCheckedAndPrintVowelAreConsonant()
    {
        //Add
        String result= app.consonantvowelcheck("ABCE");
        //Assert
        assertEquals("VowelConsonantConsonantVowel",result);

    }
    @Test
    public void givenStringContainsNonAlphabetvalueAndReturnsErrorMessages()
    {
        //Add
        String result= app.consonantvowelcheck("7-e");
        //Assert
        assertEquals("NotanAlphabetNotanAlphabetVowel",result);

    }
}
