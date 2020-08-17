package com.github.NatalyaZay.module02;

public class ProgramTask22 {
    public static void main(String[] args) {

        Human human = new Human("Petr");
        System.out.println(human.hashCode());
    }

    public static class Human{
        String name;

        public Human(String name){
        this.name = name;
        }

        @Override
        public int hashCode() {
        return 10 * name.hashCode() + 1;
        }
    }
}
