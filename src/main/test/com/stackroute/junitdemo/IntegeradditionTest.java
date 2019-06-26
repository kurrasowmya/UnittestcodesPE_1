package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegeradditionTest {
    Integeraddition ia=new Integeraddition();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void givennumberisTakenAsArraySizeAndprintsAddedElemenetsInTheArray()
    {
        //Add
        int result = ia.integersum(3,new int[] {11,25,3});
        //Assert
        assertEquals(39,result);
    }
    @Test
    public void givenArrayWithAlphabetistakenAndPrintIntegervalueBytakingAlphabetAsciiValue()
    {
        //Add
        int result = ia.integersum(3,new int[] {'A' ,20,3});
        //Assert
        assertEquals(88,result);
    }
    @Test
    public void givenArrayWithdigitandSpecialCharistakenAndPrintIntegervalueBytakingAlphabetAsciiValue()
    {
        //Add
        int result = ia.integersum(3,new int[] {'@' ,'#',3});
        //Assert
        assertEquals(102,result);
    }
}