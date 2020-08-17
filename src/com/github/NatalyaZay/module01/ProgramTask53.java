package com.github.NatalyaZay.module01;

public class ProgramTask53 {
    public static void main(String[] args) {
        int a = 34;
        int b = 2;
        int c = 78;
        int result = 0;

         if (a > b && a > c ){
             result = a;
        } else if (b > c && b > a) {
             result = b;
        } else if (c > a && c > b) {
             result = c;
        }
        System.out.println("max count: "+ result);
          if (a < b && a < c ) {
              result = a;
        }  else if (b < c && b < a) {
              result = b;
        } else if (c < a && c < b) {
              result = c;
        }
        System.out.println("min count: "+ result);
    }
}
