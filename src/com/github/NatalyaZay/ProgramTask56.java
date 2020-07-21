package com.github.NatalyaZay;

import java.util.Scanner;

public class ProgramTask56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month){
            case 12 :
            case 1 :
            case 2 :
                System.out.println(" Сейчас на улице зима ");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println(" Сейчас на улице весна ");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println(" Сейчас на улице лето ");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println(" Сейчас на улице осень ");
                break;
            default:
                System.out.println(" Такого месяца не существует ");
                break;


        }
    }
}
