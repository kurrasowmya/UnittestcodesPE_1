package com.stackroute.junitdemo;

public class TomJerry {
    public String evenoddcheck(int num)
    {
        //If number is even and between 20 and 30, print Jerry
        if(num%2==0 && num>=20 && num<=30)
        {
            return "Jerry";
        }
        //If number is odd and between 20 and 30, print Tom
        else if(num%2!=0 && num>=20 && num<=30)
        {
            return "Tom";
        }
        else
            {
            return "error";
        }
    }
}
