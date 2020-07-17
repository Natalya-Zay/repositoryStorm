package com.github.NatalyaZay;

import javax.sound.midi.Soundbank;

public class ProgramTask47 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a << 1); // 0000 1010 - сдвигает на один разряд влево 0001 0100
        int a1 = 20;
        System.out.println(a1 >> 2); // 0001 0100 - сдвигает на 2 разрядa вправо 0000 0101
        int a2 = -5;
        System.out.println(a2 >>> 1); /* 101 (5 положит) меняем на доп код = +1  доп код 011

         01111111111111111111111111111101 - сдвиг на единицу в начале добавился 0, число стало положительным

         оператор >>>  используется для 32 и 64- битовых значениях
*/
    }
}
