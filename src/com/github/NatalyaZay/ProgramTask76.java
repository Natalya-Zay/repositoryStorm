package com.github.NatalyaZay;

import java.util.Scanner;

public class ProgramTask76 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String  n = scanner.nextLine();
            String [] arr = n.split("");
            for (int i = 0; i < arr.length-1; i++){
                if (arr[i].equals(arr[i+1])) {
                    System.out.println("Yes: " + arr[i]);
                } else {
                    System.out.println("No");
                }
            }
    }
}
