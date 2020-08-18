package com.github.NatalyaZay.module02;

class Doctor extends Employee implements Intellectual{

    public Doctor(String name, int age){
        super(name, age);
    }

    @Override
    void workInfo() {
        System.out.println("Doctor heals people");
    }

    public void heal (){
        System.out.println("Heals");
    }
}

class Builder extends Employee implements Strongman{

    public Builder(String name, int age){
        super(name, age);
    }

    @Override
    void workInfo() {
        System.out.println("Builder constructing a building");
    }

    public void build (){
        System.out.println("Builds");
    }
}

class Programmer extends Employee implements Intellectual{

    public Programmer(String name, int age){
        super(name, age);
    }

    @Override
    void workInfo() {
        System.out.println("Programmer development and debugging of computer programs");
    }

    public void programming (){
        System.out.println("Programming");
    }
}

