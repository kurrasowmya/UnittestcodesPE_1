package com.stackroute.junitdemo;

public class RepeatString {
    public String Repeatsubstring(String input1,int input2)
    {
        int i,count=0,a;
        String output=input1;
        //calculate the string length
        a=input1.length();
        if(input2<=a) {
            //iterate loop until we reach end after printing substring for n time
            while (count != input2) {
                //print the last n characters in string for n times
                for (i = a - input2; i < input1.length(); i++) {
                    char c = input1.charAt(i);
                    output = output + c;
                }
                count++;
            }
        }
        else
        {
            output="Out Of Bound";
        }
        return output;
    }
}
