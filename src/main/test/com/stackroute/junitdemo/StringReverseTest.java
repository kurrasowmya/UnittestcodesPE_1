package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse reversestring;
    @Before
    public void setUp() throws Exception {
        reversestring=new StringReverse();

    }

    @After
    public void tearDown() throws Exception {
        reversestring=null;
    }
    @Test
    public void givenStringShouldBeReversedAndPrintsreverserString()
    {
        //Add
        String result= reversestring.ReverseofString("Hi");
        //Assert
        assertEquals("iH",result);

    }
    @Test
    public void givenStringWithSpacesShouldBeReversedAndPrintsReverseStringWithSpace()
    {

        //Add
        String result= reversestring.ReverseofString("Hello World");
        //Assert
        assertEquals("dlroW olleH",result);

    }
    @Test
    public void givenStringWithOtherThanAlphabetsShouldBeReversedandPrintsItReverseString()
    {

        //Add
        String result= reversestring.ReverseofString("$%637#!");
        //Assert
        assertEquals("!#736%$",result);

    }
    @Test
    public void givenAlphaNumericStringShouldBeReversedAnDReversedStringIsprinted()
    {

        //Add
        String result= reversestring.ReverseofString("h65rf43S6");
        //Assert
        assertEquals("6S34fr56h",result);

    }


}