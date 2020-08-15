package com.github.NatalyaZay.module02;

import java.util.Objects;

public class ProgramTask23 {
    public static void main(String[] args) {
        Dog dog = new Dog("Марс");
        Dog dog1 = new Dog("Карат");
        Dog dog2 = new Dog("Марс");
        System.out.println(dog.equals(dog1));
        System.out.println(dog.equals(dog2));
    }
    public static class Dog {
        String name;
        public Dog(String name){
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Dog dog = (Dog) o;
            return Objects.equals(name, dog.name);
        }
    }
}
