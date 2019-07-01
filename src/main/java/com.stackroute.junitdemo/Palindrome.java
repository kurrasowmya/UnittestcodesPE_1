package com.stackroute.junitdemo;

public class Palindrome
{
    public String palindromeandgreater(long number)
    {
        long a,temp,sum=0,evensum=0;
        temp=number;
        while(number!=0)
        {
            a=number%10;
            //digit is checked for even number to get evensum
            if(a%2==0)
            {
                evensum=evensum+a;
            }
            sum=sum*10+a;
            number=number/10;
        }
        //if-else to compare the original number with reversed number
        if(sum==temp)
        {
            //check whether the evensum is greater or less than 25
            if(evensum>25)
            {
                return "Number is palindrome and sum of even numbers is greater than 25";
            }
            else
            {
                return "Number is palindrome and sum of even numbers is less than 25";
            }
        }
        else
        {
            return "Number is not a palindrome";
        }
    }
}
