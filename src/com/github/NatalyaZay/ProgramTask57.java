package com.github.NatalyaZay;

import java.util.Scanner;

public class ProgramTask57 {
    public static void main(String[] args) {
        System.out.println(" Введите день недели. ");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.next().toLowerCase();

        switch (day){
            case "понедельник" :
                System.out.println(" Первый день недели ");
                break;
            case "вторник" :
                System.out.println(" Второй день недели ");
                break;
            case "среда" :
                System.out.println(" Третий день недели ");
                break;
            case "четверг" :
                System.out.println(" Четвертый день недели ");
                break;
            case "пятница" :
                System.out.println(" Пятый день недели ");
                break;
            case "суббота" :
                System.out.println(" Шестой день недели ");
                break;
            case "воскресенье" :
                System.out.println(" Седьмой день недели ");
                break;
            default:
                System.out.println(" Такого дня недели не сущетсвует ");
                   break;
        }
    }
}
