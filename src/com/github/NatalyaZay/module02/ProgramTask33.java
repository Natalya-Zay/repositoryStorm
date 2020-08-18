package com.github.NatalyaZay.module02;

interface Intellectual {

    default void think(){
        System.out.println("Thinks");
    }
}

interface Strongman {

    default void drag(){
        System.out.println("Drags");
    }
}
