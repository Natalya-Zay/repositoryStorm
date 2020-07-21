package com.github.NatalyaZay;

public class ProgramTask53 {
    public static void main(String[] args) {
        int a = 34;
        int b = 2;
        int c = 78;

         if (a > b && a > c ){
            System.out.println(" max count : " + a );
        } else if (b > c && b > a) {
            System.out.println(" max count : " + b);
        } else if (c > a && c > b) {
            System.out.println(" max count : " + c);
        }
          if (a < b && a < c ) {
            System.out.println(" min count : " + a);
        }  else if (b < c && b < a) {
            System.out.println(" min count : " + b);
        } else if (c < a && c < b) {
            System.out.println(" min count : " + c);
        }
    }
}
