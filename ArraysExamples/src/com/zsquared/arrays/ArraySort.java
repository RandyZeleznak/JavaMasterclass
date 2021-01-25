package com.zsquared.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int []myIntegers = getIntegers(5);
        int [] sortedArray = sortIntegers(myIntegers);
        printArray(sortedArray);


    }

    public static int[] getIntegers(int arrayBound){
        int[] array = new int [arrayBound];
        System.out.println("Enter " +arrayBound+ " integer values:\r");
        for(int i =0 ; i < arrayBound; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int a = 0; a < array.length; a++){
            System.out.println("Element " +a+ " contains " +array[a] );
        }
    }


    public static int[] sortIntegers(int[] array){
      //  int[] sortedArray = new int[array.length];
       // for(int i =0; i<array.length; i++){
       //     sortedArray[i]= array[i];
        //}

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for (int a = 0; a < sortedArray.length - 1; a++) {
                if (sortedArray[a] < sortedArray[a + 1]) {
                    temp = sortedArray[a];
                    sortedArray[a] = sortedArray[a + 1];
                    sortedArray[a + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

}












