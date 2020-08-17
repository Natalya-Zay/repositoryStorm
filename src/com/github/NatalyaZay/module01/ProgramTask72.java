package com.github.NatalyaZay.module01;

import java.util.Scanner;

public class ProgramTask72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 1;
        int a = 1;
        while (true){
            a = s * s;
            s++;
            if (a > n){
                break;
            }
          System.out.println(a);
        }
    }
}