package com.github.NatalyaZay;

public class ProgramTask81 {
    public static void main(String[] args) {
        count();
        count(6);
        count(1, 10);
        count(2,2,100);
    }

    public static void count() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("    ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void count(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println();
    }

    public static void count(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void count(int a, int b, int c){
        if (a + b > c  &&  c + a > b  &&  c + b > a){
            System.out.println("Треугольник возможен");
        } else {
            System.out.println("Треугольник NE возможен");
        }
    }
}


