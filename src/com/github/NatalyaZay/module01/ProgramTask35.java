package com.github.NatalyaZay.module01;

public class ProgramTask35 {
    public static void main(String[] args) {
        float a = 1245.554F; // 4 байта (3.4e-38; 3.4e+38)
        double b = 256.3758;  // 8 байт (1.7e-308; 1.7e+308)
        double c = (a * b) % 1;
        System.out.println(c);


    }
}
