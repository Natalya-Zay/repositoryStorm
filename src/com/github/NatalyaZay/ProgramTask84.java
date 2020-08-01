package com.github.NatalyaZay;

public class ProgramTask84 {
    public static void main(String[] args) {
        System.out.println(recursion1(-1));
    }

    public static String recursion1 (int a) {
      if (a == 0 || a < 0){
          return "0";
      }
        return recursion1(a - 1 ) + " " + a;
    }
}
/*
   * - Рекурсию сравнивают с циклом.
   * - Если неверно обозначить условие выхода из рекурсии , можно попасть в бесконечный цикл или StackOverflowError.
 */