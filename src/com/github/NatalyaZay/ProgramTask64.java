package com.github.NatalyaZay;

import java.util.Arrays;

public class ProgramTask64 {
    public static void main(String[] args) throws Exception {

        int[] array = {1, 2, 3};
        swap(array, 1, 2);
        swap(array,1,3);
        swap(array,-1,0);

        int[] array1 = new int[]{2, 4, 6, 8, 10};
        swap(array1, 2, 3);
        swap(array1, 5, 3);
        swap(array1, -2, 0);
    }

    private static void swap(int[] array, int indexA, int indexB) {
        System.out.println("Trying swap: " + Arrays.toString(array) + " indexA " + indexA + " and " + indexB);

                        for (int i = 0; i < 1; i++) {
                            if (indexA >= array.length ) {
                                System.out.println(" indexA " + indexA + " and " + indexB + " Neverni ! ");
                                System.out.println(" indexA " + indexA);

                            } else if (indexB >= array.length){
                                System.out.println(" indexA " + indexA + " and " + indexB + " Neverni ! ");
                                System.out.println(" indexB " + indexB);
                            }
                            else  if (indexA < 0 ) {
                                System.out.println(" indexA " + indexA + " and " + indexB + " Neverni ! ");
                                System.out.println(" indexA " + indexA);
                                }
                            else if (indexB < 0){
                                System.out.println(" indexA " + indexA + " and " + indexB + " Neverni ! ");
                                System.out.println(" indexB " + indexB);
                            }
                             else{
                                    int arr = array[indexA];
                                    array[indexA] = array[indexB];
                                    array[indexB] = arr;
                                }
                            }
        System.out.println(" Result: " + Arrays.toString(array) + "\n");
    }
}
