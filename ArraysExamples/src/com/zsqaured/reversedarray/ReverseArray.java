package com.zsqaured.reversedarray;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int [] array = { 1,3,5,13,8,15};
        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("ReversedArray = " + Arrays.toString(array));
    }

        private static void reverse(int [] array){
            int maxIndex = array.length-1;
            int halfLength = array.length/2;
            for(int i = 0; i<halfLength;i++){
                int temp=array[i];
                array[i]=array[maxIndex-i];
                array[maxIndex-i]=temp;
            }
        }




}
