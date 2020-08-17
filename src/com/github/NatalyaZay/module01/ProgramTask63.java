package com.github.NatalyaZay.module01;

import java.util.Arrays;

public class ProgramTask63 {
    public static void main(String[] args) {
        // 3 задание
        int [] array = {1, 2, 3, 4, 5};
        swap(array,0,1);

        int [] array1 = new int[] {2, 3, 4, 5, 6, 10};
        swap(array1,2,5);
    }

    private static void swap(int[] array, int indexA, int indexB) {
        System.out.println("Trying swap: "+ Arrays.toString(array) + " indexA " + indexA + " and " + indexB );

        for (int i = 0; i < 1; i++){
             int arr = array[indexA];
             array[indexA] = array[indexB];
             array[indexB] = arr;
     }
        System.out.println(" Result: " + Arrays.toString(array) + "\n");
    }
}
