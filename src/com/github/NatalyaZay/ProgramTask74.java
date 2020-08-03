package com.github.NatalyaZay;

public class ProgramTask74 {
    public static void main(String[] args) {

        int lenth = 10;
        for (int i = 0; i < lenth/2; i++) {
            for (int j = 0; j < lenth/2-i ; j++) {
                System.out.print(" ");
            }
            for (int s = 0; s < i * 2 ; s++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
