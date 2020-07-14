package com.github.NatalyaZay;

public class ProgramTask39 {
    public static class Dog { // любой класс это ссылочный тип
        String name; // ссылочная переменная представляет способ получения объекта
        int age;

        public Dog(String name, int age) {
            this.name=name;
            this.age = age;
        }
    }
    public static void main(String[] args) {
        int a1 = 15;                 //примитивные передаются по значению
        int b1 = 19;
        System.out.println("a1 = "+ a1);
        System.out.println("b1 = "+ b1);
        Dog dog = new Dog ("Shark",3); // Dog - ccылка на создаваемый объект
        Dog dog1 = new Dog("Fari",2); //
        System.out.println("Собаку зовут " +dog.name +" " + "Возраст "+ dog.age);
        System.out.println("Собаку зовут " +dog1.name + "  " + "Возраст "+ dog1.age);

    }
}

//  для ссылочных типов в СТЕКЕ хранятся ссылки на объект
// для примитивных типов в СТЕКЕ хранятся переменные
// в HEAP хранятся объекты