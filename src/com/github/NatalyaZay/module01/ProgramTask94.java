package com.github.NatalyaZay.module01;

import java.util.Scanner;

public class ProgramTask94 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sb1 = scanner.nextLine();

        revers(sb1);
    }
    public static void revers(String st){
     String sb = new StringBuffer(st).reverse().toString();
     System.out.println(sb);
    }
}
