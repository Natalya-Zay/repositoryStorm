package com.github.NatalyaZay.module02;

abstract class Employee {
    String name;
    int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void speak (){
        System.out.println("Hello, my name is "+ this.getName() + " I am "+ this.getAge() + " old");
    }

    abstract void workInfo();
}

