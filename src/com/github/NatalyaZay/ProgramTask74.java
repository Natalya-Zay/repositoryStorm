package com.github.NatalyaZay;

public class ProgramTask74 {
    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7-i ; j++) {
                System.out.print(" ");
            }
            for (int s = 0; s < i * 2 ; s++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
