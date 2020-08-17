package com.github.NatalyaZay.module02;

import java.util.Arrays;
import java.util.Comparator;

public class ProgramTask14 {
    public static void main(String[] args) {

        Person[] people = new Person[6];
        people[0] = new Person("Vova", 21);
        people[1] = new Person("Dima", 26);
        people[2] = new Person("Oleg", 18);
        people[3] = new Person("Sahsa", 29);
        people[4] = new Person("Serega", 27);
        people[5] = new Person("Petr", 80);

        System.out.println("До сортировки : ");
        System.out.println(Arrays.toString(people));
        System.out.println();

        System.out.println("После сортировки по имени :");
        Arrays.sort(people, Person.sortName);
        System.out.println(Arrays.toString(people));
        System.out.println();

        System.out.println("После сортировки по возрасту :");
        Arrays.sort(people,Person.sortAge);
        System.out.println(Arrays.toString(people));
    }

    public static class Person  {

        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;

        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public static Comparator<Person> sortName = new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.getName().compareTo(person2.getName());
            }
        };
        public static Comparator<Person> sortAge = new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.getAge()- person2.getAge();
            }
        };
    }
}