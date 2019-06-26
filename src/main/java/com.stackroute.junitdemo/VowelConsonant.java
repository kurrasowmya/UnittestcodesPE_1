package com.stackroute.junitdemo;
public class VowelConsonant
{
    public String consonantvowelcheck(String inputString) {
        int i;
        String outputstring="";
        //check each and every character in the string
        for (i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if((c>=65&&c<=96)||(c>=97&&c<=122))
            {
                //if condition for vowel check
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
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

