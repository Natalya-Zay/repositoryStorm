package com.github.NatalyaZay.module02;

import java.util.Date;

public class ProgramTask12 {
    public static void main(String[] args) {
      Person person = new Person("Decard Cain",68);
      person.meditation();
    }

    public static class Person {
        String name;
        int age;
        Date date = new Date();

        public Person (String name, int age) {
            this.name=name;
            this.age=age;
        }

     public void meditation (){
         System.out.println("I think - it means I exist. "+ this.name + " "+ date);
     }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", date=" + date +
                    '}';
        }
    }
}