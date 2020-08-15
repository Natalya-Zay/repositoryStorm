package com.github.NatalyaZay.module02;

public class ProgramTask21 {
    public static void main(String[] args) {
     Cat cat = new Cat("Мурзик",3,"Сиамская");
        Cat cat1 = new Cat("Васька",2,"Бирма");
          Cat cat2 = new Cat("Ангел",2,"Рэгдолл");
          System.out.println(cat.toString());
          System.out.println(cat1.toString());
          System.out.println(cat2.toString());
    }

    public static class Cat {
        String name;
        int age;
        String breed;

        public Cat(String name, int age, String breed){
            this.name = name;
            this.age = age;
            this.breed = breed;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", breed='" + breed + '\'' +
                    '}';
        }
    }
}
