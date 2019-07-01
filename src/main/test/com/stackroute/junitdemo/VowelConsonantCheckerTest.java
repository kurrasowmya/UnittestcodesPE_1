package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VowelConsonantCheckerTest
{
    //arrange
    VowelConsonantChecker vowelconsonant=new VowelConsonantChecker();
    @Before
    public void setUp() throws Exception
    {
        vowelconsonant=new VowelConsonantChecker();
    }
    @After
    public void tearDown() throws Exception {
        vowelconsonant=null;
    }
    @Test
    public void givenStringinlowercaseisCheckedAndPrintVowelAreConsonant()
    {
        //Add
        String result= vowelconsonant.consonantvowelcheck("abce");
        //Assert
        assertEquals("VowelConsonantConsonantVowel",result);

    }
    @Test
    public void givenStringinUppercaseisCheckedAndPrintVowelAreConsonant()
    {
        //Add
        String result= vowelconsonant.consonantvowelcheck("ABCE");
        //Assert
        assertEquals("VowelConsonantConsonantVowel",result);

    }
    @Test
    public void givenStringContainsNonAlphabetvalueAndReturnsErrorMessages()
    {
        //Add
        String result= vowelconsonant.consonantvowelcheck("7-e");
        //Assert
        assertEquals("NotanAlphabetNotanAlphabetVowel",result);

    }
}
