package com.github.NatalyaZay.module01;

public class ProgramTask46 {
    public static void main(String[] args) {
        int a = 4; //  0000 0100                //0 false //1 true
        int b = 3; //  0000 0011
        System.out.println(a & b); //false false false false  0000
        System.out.println(a | b); // true true true false = 1110
        System.out.println(a ^ b); // true true true false = 1110
        System.out.println(~a);
/*
похожи на логические операторы
  NOT меняет положительное на отрицательное +1
  отрицательное меняет на положительное -1

 */
    }
}
