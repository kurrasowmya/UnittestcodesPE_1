package com.stackroute.junitdemo;

public class Charactercheck
{
    public String charcheck(char m)
    {
        //Checking character for lowercase
        if(m >= 97 && m <= 123)
        {
            return "Lower Case";
        }
        //Checking character for Uppercase
        else if(m >= 65 && m <= 96)
        {
            return "Upper Case";
        }
        //Checking character for digit
        else if(m >= 48 && m <= 57)
        {
            return "Digit";
        }
        //if above conditions fail print it as special character
        else
        {
            return "Special Character";

        }
    }
}
