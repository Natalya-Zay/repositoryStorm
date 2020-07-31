package com.github.NatalyaZay;

public class ProgramTask77 {
    public static void main(String[] args) {
      int people = 10000000;
      int s = 0;
      int born = 14;
      int death = 8;
      int difference = born-death;
      for (int i = 1; i <= 10; i++){
         s = ( people / 1000) * difference * i;
         s = people + s;
      }
        System.out.println(s);
    }
}
