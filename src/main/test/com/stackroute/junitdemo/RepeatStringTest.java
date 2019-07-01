package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatStringTest {
    RepeatString repeatstring;

    @Before
    public void setUp() throws Exception {
        repeatstring=new RepeatString();

    }

    @After
    public void tearDown() throws Exception {
        repeatstring=null;
    }
    @Test
    public void givenStringistakenandTheLastnCharacterArePrintednNumberOfTimes()
    {
        //Add
        String result = repeatstring.Repeatsubstring("Stackroute",2);
        //Assert
        assertEquals("Stackroutetete", result);
    }
    @Test
    public void givenStringisTakenandThenisGivenOutOfBoundThenitPrintsErrorMessage()
    {
        //Add
        String result = repeatstring.Repeatsubstring("Stackroute",11);
        //Assert
        assertEquals("Out Of Bound", result);
    }
    @Test
    public void givenStringisTakenandThenRepeated0TimesAndprintsThesameString()
    {
        //Add
        String result = repeatstring.Repeatsubstring("Stackroute",0);
        //Assert
        assertEquals("Stackroute", result);
    }
}