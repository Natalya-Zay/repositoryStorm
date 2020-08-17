package com.github.NatalyaZay.module01;

import java.util.Arrays;
import java.util.Collections;

public class ProgramTask61 {
    public static void main(String[] args) {
        // 1 задание
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(array));

        // 2 задание
        int [] array1 = {1,2,3,4,5,6,7,8,9,10};
        int [] reverse = new int [array1.length];
        System.arraycopy(array1,0,reverse,0,10);
        System.out.println(Arrays.toString(reverse));

        for (int i = 0; i < reverse.length; i++){
            for (int j =0; j < reverse.length-1; j++){
               if (reverse[j] < reverse[j+1]) {
                   int k = reverse[j];
                   reverse[j] = reverse[j+1];
                   reverse[j+1] = k;
               }
            }
       }
        System.out.println(Arrays.toString(reverse));
    }
}
