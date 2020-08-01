package com.github.NatalyaZay;

public class ProgramTask82 {
    public static void main(String[] args) {
        System.out.println( bolshe_O(100));
        bolshe_O_1(-1);
        bolshe_O_2(5);
    }

    public static boolean bolshe_O(int a) {
        if (a > 0) {
           return true;
        } else {
           return false;
        }
    }

    public static String bolshe_O_1(int a){
        if (bolshe_O(a)){
            System.out.println("chislo bolshe 0");
        }else {
            System.out.println("chislo NE bolshe 0 ili ravno 0");
        }
        return null;
    }

    public static String bolshe_O_2(int a){
        if (bolshe_O(a) && a > 10 ){
            System.out.println("chislo bolshe 0 i bolshe 10 " + "chislo: " + a);
        }
        else {
            System.out.println("chislo otricatelnoe ili menshe 10 " + "chislo: " + a);
        }
        return null;
    }
}