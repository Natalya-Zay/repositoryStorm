package com.github.NatalyaZay.module02;

public class ProgramTask11 {
    public static void main(String[] args) {
        Person person = new Person("Petr",33);
    }

    public static class Person{
        String name;
        int age;

    public Person (String name, int age) {
        this.name=name;
        this.age=age;
    }
    }
}
