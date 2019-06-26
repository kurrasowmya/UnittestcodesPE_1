package com.stackroute.junitdemo;

public class Iterative {
    public String numberrepeat(int n)
    {
        int i,j;
        String output="";
        if(n>0) {
            //print the number n for n number of times from 1 to n
            for (i = 1; i < n + 1; i++) {
                for (j = 0; j < n; j++) {
                    while (i != j && i >= j) {
                        output = output + i;
                        j++;
                    }
                }
            }
        }
        else if(n==0)
        {
            output="Entered zero";
        }
        else
        {
            output="Entered negative number";
        }
        return output;
    }
}
