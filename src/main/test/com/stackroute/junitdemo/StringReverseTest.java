package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After");
    }
    @Test
    public void givenStringShouldBeReversedAndPrintsreverserString()
    {
        //arrange
        StringReverse app=new StringReverse();
        //Add
        String result= app.ReverseofString("Hi");
        //Assert
        assertEquals("iH",result);

    }
    @Test
    public void givenStringWithSpacesShouldBeReversedAndPrintsReverseStringWithSpace()
    {
        //arrange
        StringReverse app=new StringReverse();
        //Add
        String result= app.ReverseofString("Hello World");
        //Assert
        assertEquals("dlroW olleH",result);

    }
    @Test
    public void givenStringWithOtherThanAlphabetsShouldBeReversedandPrintsItReverseString()
    {
        //arrange
        StringReverse app=new StringReverse();
        //Add
        String result= app.ReverseofString("$%637#!");
        //Assert
        assertEquals("!#736%$",result);

    }
    @Test
    public void givenAlphaNumericStringShouldBeReversedAnDReversedStringIsprinted()
    {
        //arrange
        StringReverse app=new StringReverse();
        //Add
        String result= app.ReverseofString("h65rf43S6");
        //Assert
        assertEquals("6S34fr56h",result);

    }


}