package com.stackroute.junitdemo;

import java.util.Arrays;

public class Sorting {
    public int[] sumdecreasingnumbers(int input)
    {
        int sumOfEven = 0;
        int len = Integer.toString(input).length();
        int[] arr = new int[len];
        if(input>0) {
            //Spliting the number and placing each number into array
            for (int i = 0; i < len; i++) {
                arr[i] = input % 10;
                //finding the digit is even or odd, if it even add the number to sumOfEven
                if (arr[i] % 2 == 0) {
                    sumOfEven = sumOfEven + arr[i];
                }
                input = input / 10;
            }
            //Sorting the number in arrays in ascending order(sort method by default ascending order)
            Arrays.sort(arr);
            int num = 0;
            for (int i = 0; i < len; i++) {
                //getting the Array elements in reverse order
                num = (num * 10) + arr[len - i - 1];

            }
            return new int[]{num, sumOfEven};
        }
        else {
            return new int[]{0, 0};
        }

    }
}
