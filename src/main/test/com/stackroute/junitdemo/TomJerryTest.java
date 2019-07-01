package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TomJerryTest {
    TomJerry jerrytom;

    @Before
    public void setUp() throws Exception {
        jerrytom=new TomJerry();
    }

    @After
    public void tearDown() throws Exception {
        jerrytom=null;
    }
    @Test
    public void givenNumberisCheckedforEvenBetween20And30ThenPrintsJerry()
    {
        //Add
        String result = jerrytom.evenoddcheck(22);
        //Assert
        assertEquals("Jerry", result);
    }
    @Test
    public void givenNumberIsCheckedForOddBetween20And30ThenPrintsTom()
    {
        //Add
        String result = jerrytom.evenoddcheck(27);
        //Assert
        assertEquals("Tom", result);
    }
    @Test
    public void givenNumberOutOfRangeShouldReturnsError()
    {
        //Add
        String result = jerrytom.evenoddcheck(67);
        //Assert
        assertEquals("error", result);
    }
}