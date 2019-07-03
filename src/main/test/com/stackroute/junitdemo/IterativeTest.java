package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IterativeTest {
    Iterative iterative=new Iterative();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void givenNumberisIteratedfornNumberofTimesAndPrintsEachNumbernNumberofTimes()
    {
        //Add
        String result = iterative.numberrepeat(3);
        //Assert
        assertEquals("122333", result);
    }
    @Test
    public void givenNumberisIteratedfornegativeNumberofTimesAndPrintsEachNumbernNumberofTimes()
    {
        //Add
        String result = iterative.numberrepeat(-1);
        //Assert
        assertNotEquals("negative number", result);
    }
    @Test
    public void givenNumberisIteratedfor0NumberofTimesAndPrintsEachNumbernNumberofTimes()
    {
        //Add
        String result = iterative.numberrepeat(0);
        //Assert
        assertEquals("Entered zero", result);
    }
}