package com.stackroute.junitdemo;

public class IntegerAddition {
    public int integersum(int n,int[] array)
    {
        int i,sum=0;
        //Ask user to enter numbers
        //write try to catch the exception of on-integer value
        for (i = 0; i < n; i++)
            {
                if (array[i] == (int) array[i])
                {
                    sum = sum + array[i];
                }
            }
            return sum;
        }

}
