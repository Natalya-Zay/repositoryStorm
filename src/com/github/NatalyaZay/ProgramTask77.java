package com.github.NatalyaZay;

public class ProgramTask77 {
    public static void main(String[] args) {
      int people = 10000000;
      int born = 14;
      int death = 8;
      int difference = born-death;
      for (int i = 1; i <= 10; i++){
         people +=  people/1000 * difference;

      }
        System.out.println(people);
    }
}
