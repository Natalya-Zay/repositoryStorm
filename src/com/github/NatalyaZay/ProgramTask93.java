package com.github.NatalyaZay;

import java.util.Scanner;

public class ProgramTask93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        String str = scanner.nextLine();
        concat(st,str);
    }
    public static void concat(String st1, String st2) {
        String a = st1.substring(0,st1.length()/2);
        String b = st2.substring(st2.length()/2);
        System.out.println(a+b);
    }
}