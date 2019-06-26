package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TomJerryTest {
    TomJerry tm = new TomJerry();

    @Before
    public void setUp() throws Exception {
        tm=new TomJerry();
    }

    @After
    public void tearDown() throws Exception {
        tm=null;
    }
    @Test
    public void givenNumberisCheckedforEvenBetween20And30ThenPrintsJerry()
    {
        //Add
        String result = tm.evenoddcheck(22);
        //Assert
        assertEquals("Jerry", result);
    }
    @Test
    public void givenNumberIsCheckedForOddBetween20And30ThenPrintsTom()
    {
        //Add
        String result = tm.evenoddcheck(27);
        //Assert
        assertEquals("Tom", result);
    }
    @Test
    public void givenNumberOutOfRangeShouldReturnsError()
    {
        //Add
        String result = tm.evenoddcheck(67);
        //Assert
        assertEquals("error", result);
    }
}