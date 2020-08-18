package com.github.NatalyaZay.module02;

public class ProgramTask34 {
    public static void main(String[] args) {

        Doctor doctor = new Doctor("Artur",45);
        doctor.speak();
        doctor.heal();
        doctor.workInfo();
        doctor.think();
        System.out.println();

        Builder builder = new Builder("Valera",39);
        builder.speak();
        builder.build();
        builder.workInfo();
        builder.drag();
        System.out.println();

        Programmer programmer = new Programmer("Mari",21);
        programmer.speak();
        programmer.programming();
        programmer.workInfo();
        programmer.think();
    }
}
