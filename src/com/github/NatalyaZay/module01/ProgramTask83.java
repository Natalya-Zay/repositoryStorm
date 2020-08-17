package com.github.NatalyaZay.module01;

import java.util.Arrays;

public class ProgramTask83 {
    public static void main(String[] args) {
        System.out.println( multip(5));
        System.out.println(multip(8, 9));
        System.out.println( multip(2.5, 10));
        System.out.println(multip(3.8, 7.2));
        int[] array1 = {2,3,4};
        System.out.println(multip(array1));
    }

    public static int multip(int a) {
        return 2 * a;
    }

    public static int multip(int a, int b) {
        return 3 * a * b;
    }

    public static int multip(double a, int b) {
        return (int) (4 * a * b);
    }

    public static double multip(double a, double b) {
        return  5 * a * b;
    }

    public static int multip(int[] array) {
        int count = 1 ;
        for (int i = 0; i < array.length; i++) {
           count *= array[i];
            }
         return count;
        }
    }

/*
1. Перегрузка (overloading) - это методы с одинаковыми названиями , но  с разными параметрами. Код в методе тоже может изменяться.
Return type может быть одинаковый или разный.
Access modifier может быть одинаковый или разный.
Если метод отличается только return type или access modifier , то такой метод не является overloading.
2. Написать метод с тем же именем, изменить параметры (добавить, убрать, изменить тип данных), дополнить код или написать новый.
3.  * 1 и 2 метод не overloading. (Если метод отличается только return type , то такой метод не является overloading )
    * 1 и 3 метод overloading
    * 2 и 3 метод overloading
 */


