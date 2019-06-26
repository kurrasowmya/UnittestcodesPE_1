package com.stackroute.junitdemo;

public class StringReverse {
    public String ReverseofString(String original)
    {
        //Take a empty reverse string
        String reverse="";
        //calculate the length of string and store it
        int length = original.length();
        //logic for reversing a string
        for (int i = length - 1 ; i >= 0 ; i--)
        {
            reverse = reverse + original.charAt(i);
        }
        //print the reverse number
        return reverse;
    }
}
