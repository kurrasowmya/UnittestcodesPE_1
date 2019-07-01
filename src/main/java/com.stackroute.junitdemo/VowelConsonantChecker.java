package com.stackroute.junitdemo;
public class VowelConsonantChecker
{
    public String consonantvowelcheck(String inputString) {
        int i;
        String outputstring="";
        //check each and every character in the string
        for (i = 0; i < inputString.length(); i++) {
            char character= inputString.charAt(i);
            if((character>=65&&character<=96)||(character>=97&&character<=122))
            {
                //if condition for vowel check
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character== 'u' || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U')
                {
                    outputstring = outputstring + "Vowel";
                }
                //if not vowel, print it as consonant
                else
                    {
                    outputstring = outputstring + "Consonant";
                }
            }
            else
            {
                outputstring=outputstring+"NotanAlphabet";
            }

        }
        return outputstring;
    }
}

