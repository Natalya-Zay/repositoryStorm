package com.github.NatalyaZay;

import java.util.Scanner;

public class ProgramTask75 {
    public static void main(String[] args) {

        int sum =0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int  n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            sum += n;
        }
        System.out.println(sum);
    }
}
