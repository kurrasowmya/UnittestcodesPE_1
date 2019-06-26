package com.stackroute.junitdemo;

public class Integeraddition {
    public int integersum(int n,int[] arr)
    {
        int i,sum=0;
        //Ask user to enter numbers
        //write try to catch the exception of on-integer value
        for (i = 0; i < n; i++)
            {
                if (arr[i] == (int) arr[i])
                {
                    sum = sum + arr[i];
                }
            }
            return sum;
        }

}
