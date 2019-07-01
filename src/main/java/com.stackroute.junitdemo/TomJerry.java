package com.stackroute.junitdemo;

public class TomJerry {
    public String evenoddcheck(int number)
    {
        //If number is even and between 20 and 30, print Jerry
        if(number%2==0 && number>=20 && number<=30)
        {
            return "Jerry";
        }
        //If number is odd and between 20 and 30, print Tom
        else if(number%2!=0 && number>=20 && number<=30)
        {
            return "Tom";
        }
        else
            {
            return "error";
        }
    }
}
