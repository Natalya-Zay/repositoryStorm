package com.github.NatalyaZay.module02;

public class ProgramTask41 {

    private String name;
    private int id;
    private int age;

    public String getName (){
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge (){
        return age;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }
}
 class Access {
     public static void main(String[] args) {

         ProgramTask41 pr = new ProgramTask41();
         pr.getName();
         pr.getAge();
         pr.getId();
         pr.setAge(90);
         pr.setId(20);
         pr.setName("Aaaaaa");
     }
 }