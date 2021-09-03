package com.vitorindio.zoo;

public abstract class Animal {

    public static void something(){
        Animal.something();
    }

    /*instance variable*/
    protected int age;

    /*instance methods*/
    public abstract void eat();

    protected void age(){
        System.out.println("age is calculated");
    }
}
