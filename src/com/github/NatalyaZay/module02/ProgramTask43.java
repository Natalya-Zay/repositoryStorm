package com.github.NatalyaZay.module02;

public class ProgramTask43 {
    public static void main(String[] args) {
       Lion lion = new Lion("Simba" );
        System.out.println(lion.name);
        lion.changeName(lion);
    }
}

class Lion {

    String name;

    public Lion(String name){
        this.name = name;
    }

  public void changeName (Lion lion){

      Lion lionSecond = new Lion ("Mufasa");
        System.out.println(lionSecond.name);
    }
}