package com.github.NatalyaZay;

public class ProgramTask82 {
    public static void main(String[] args) {
        System.out.println( countBigZeroFirst(100));
        System.out.println( countBigZeroSecond(-1));
        System.out.println( countBigZeroThird(5));
    }

    public static boolean countBigZeroFirst(int a) {
       return a > 0;
    }

    public static String countBigZeroSecond(int a){
        if (countBigZeroFirst(a)) {
            return "Число больше нуля";
        }else {
            return "Число не больше нуля или равно нулю";
        }
    }

    public static String countBigZeroThird(int a){
        if (countBigZeroFirst(a) && a > 10 ){
            return "Число больше нуля и больше 10" + " число : " + a;
        }
        else {
            return "Число отрицательное или меньше 10" + " число: " + a;
        }
    }
}