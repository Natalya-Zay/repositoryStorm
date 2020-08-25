package com.github.NatalyaZay.module02;

public class ProgramTask43 {
    public static void main(String[] args) {

       Lion lion = new Lion("Simba" );
       System.out.println(lion.name);
       lion.changeName(lion);
       System.out.println(lion.name);
    }
}

class Lion {

    String name;

    public Lion(String name){
        this.name = name;
    }

  public static void changeName (Lion lion){

        lion.name = "Mufasa";
    }
}