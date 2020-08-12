package com.github.NatalyaZay.module02;

public class ProgramTask13 {
    public static void main(String[] args) {
        Owner person = new Owner("Petr",28);
        Cat cat = new Cat("Angel",2,Cat.Breed.BIRMAN,person);
        System.out.println(cat.toString());
    }

    public static class Cat {
        String name;
        int age;
        Breed breed;
        Owner person;

        public enum  Breed {
         SIAMESE, NEBELUNG, BIRMAN;
        }

        public Cat(String name, int age, Breed breed, Owner person){
            this.name = name;
            this.age = age;
            this.breed = breed;
            this.person = person;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", breed=" + breed +
                    ", person=" + person +
                    '}';
        }
    }
    public static class Owner{
        String name;
        int age;

      public Owner(String name,int age){
          this.name = name;
          this.age = age;
      }

        @Override
        public String toString() {
            return "Owner{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
