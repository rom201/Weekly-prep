package org.romkov.week4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyArrayTest {

    @Test
    void getMultiplyArray_5() {

        int[] input = {2, 3, 4, 5, 6};
        int[] expected = {6, 8, 15, 24, 30};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(MultiplyArray.getMultiplyArray(input)));
    }

    @Test
    void getMultiplyArray_2() {

        int[] input = {5,2};
        int[] expected = {10, 10};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(MultiplyArray.getMultiplyArray(input)));
    }

    @Test
    void getMultiplyArray_3() {

        int[] input = {5,7,2};
        int[] expected = {35,10,14};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(MultiplyArray.getMultiplyArray(input)));
    }


    @Test
    void getMultiplyArray_1() {

        int[] input = {2};
        int[] expected = {2};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(MultiplyArray.getMultiplyArray(input)));
    }

    @Test
    void getMultiplyArray_0() {

        int[] input = {};
        int[] expected = {};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(MultiplyArray.getMultiplyArray(input)));
    }
//    @Test
//    void getMultiplyArray_N() {
//
//        int[] input = null;
//        int[] expected = null;
//        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(MultiplyArray.getMultiplyArray(input)));
//    }


    @Test
    void getMultiplyArray_N1() {

        int[] input = null;
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            MultiplyArray.getMultiplyArray(input);
                    });
    }

    @Test
    void getMultiplyArray_N2() {

        int[] input = null;
        Assertions.assertThrowsExactly(IllegalArgumentException.class, ()->{
            MultiplyArray.getMultiplyArray(input);
        });



    }





    //jamal did explanation and we can have


}