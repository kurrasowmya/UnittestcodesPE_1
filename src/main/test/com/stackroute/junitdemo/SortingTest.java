package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortingTest {
    Sorting st=new Sorting();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void givenIntegerNumberIssplitedAndNumberIsReversedCalculatingEvenSumAndPrintsReverseNumberAndEvensum()
    {
        //Add
        int[] result = st.sumdecreasingnumbers(234534);
        //Assert
        assertEquals("[544332, 10]", Arrays.toString(result));
    }
    @Test
    public void givenIntegerNumberIszeroAndPrintsReverseNumberAndEvensum()
    {
        //Add
        int[] result = st.sumdecreasingnumbers(0);
        //Assert
        assertEquals("[0, 0]", Arrays.toString(result));
    }
    @Test
    public void givenIntegerNumberIssplitedReversedCalculatingEvenSumAndPrintsReverseNumberAndEvensum()
    {
        //Add
        int[] result = st.sumdecreasingnumbers(-563434);
        //Assert
        assertEquals("[0, 0]", Arrays.toString(result));
    }
}