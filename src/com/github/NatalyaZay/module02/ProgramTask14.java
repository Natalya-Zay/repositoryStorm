package com.github.NatalyaZay.module02;

import java.util.Arrays;

public class ProgramTask14 {
    public static void main(String[] args) {
        Person person = new Person("Vova",21);
        Person person1 = new Person("Dima",26);
        Person person2 = new Person("Oleg",18);
        Person person3 = new Person("Sahsa",29);
        Person person4 = new Person("Serega",27);
        Person person5 = new Person("Petr",80);

        Person [] people = new Person[6];
        people[0] = person;
        people[1] = person1;
        people[2] = person2;
        people[3] = person3;
        people[4] = person4;
        people[5] = person5;
        System.out.println(Arrays.toString(people));
    }

    public static class Person{
        String name;
        int age;
       public Person (String name, int age){
           this.name = name;
           this.age = age;

       }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
