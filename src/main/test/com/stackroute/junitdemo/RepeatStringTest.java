package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatStringTest {
    RepeatString rs=new RepeatString();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void givenStringistakenandTheLastnCharacterArePrintednNumberOfTimes()
    {
        //Add
        String result = rs.Repeatsubstring("Stackroute",2);
        //Assert
        assertEquals("Stackroutetete", result);
    }
    @Test
    public void givenStringisTakenandThenisGivenOutOfBoundThenitPrintsErrorMessage()
    {
        //Add
        String result = rs.Repeatsubstring("Stackroute",11);
        //Assert
        assertEquals("Out Of Bound", result);
    }
    @Test
    public void givenStringisTakenandThenRepeated0TimesAndprintsThesameString()
    {
        //Add
        String result = rs.Repeatsubstring("Stackroute",0);
        //Assert
        assertEquals("Stackroute", result);
    }
}