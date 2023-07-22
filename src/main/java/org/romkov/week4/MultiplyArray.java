package org.romkov.week4;

import java.util.Arrays;


 /*

Given an array of integers, update every element with the multiplication of previous and next
elements with the following exceptions.
 a) The First element is replaced the by multiplication the of first and second.
 b) The last element is replaced by multiplication of the last and second last.
if length 1 ? null ?


     */

public class MultiplyArray {
    public static void main(String[] args) {

          int [] arr1 = {2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(getMultiplyArray(arr1)));

    }

    public static int[] getMultiplyArray(int[] arr1) {

//        if(arr1 == null) return null;
        if(arr1 == null) throw new IllegalArgumentException("can not be null");

        if(arr1.length <= 1) return arr1;

        int [] arr2 = new int[arr1.length];

        arr2[0] = arr1[0]*arr1[1];
        arr2[arr2.length-1] = arr1[arr1.length-1]*arr1[arr1.length-2];

            for (int i = 1; i <= arr1.length - 2; i++) {
                arr2[i] = arr1[i-1]*arr1[i+1];
        }

        return arr2;
    }


}
