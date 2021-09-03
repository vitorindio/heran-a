package com.vitorindio.zoo;

public class Lion extends Animal implements Loggable, Printable{

    public void age(){
        System.out.println("lion is 20");
    }
    public void eat() {
        System.out.println("Now Lion is eating");
    }
    public void pritn(){
        System.out.println("printing");
    }
    public String message(){
        return "...";
    }
}
