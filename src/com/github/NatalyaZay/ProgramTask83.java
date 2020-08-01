package com.github.NatalyaZay;

public class ProgramTask83 {
    public static void main(String[] args) {
        multip(5);
        multip(8, 9);
        multip(2.5, 10);
        multip(3.8, 7.2);
        int[] array1 = {1, 2, 3, 4, 5};
        multip(array1);
    }

    public static void multip(int a) {
        int a1 = 2;
        System.out.println(a1 * a);
    }

    public static void multip(int a, int b) {
        int a1 = 3;
        System.out.println(a1 * a * b);
    }

    public static void multip(double a, int b) {
        int a1 = 4;
        System.out.println(a1 * a * b);
    }

    public static void multip(double a, double b) {
        int a1 = 5;
        System.out.println(a1 * a * b);
    }

    public static void multip(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int k = array[i];
            array[i] = array[i] * 20;
            System.out.print(array[i] + " ");
        }
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


