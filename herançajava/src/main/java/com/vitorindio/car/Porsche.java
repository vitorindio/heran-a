package com.vitorindio.car;

public class Porsche implements Car, Cloneable {

    private String ownerName;

    public Porsche(String ownerName) {
        this.ownerName = ownerName;
    }

    public void sellTo(String ownerName) {
        this.ownerName = ownerName;
    }

    public String asString(){
        return "Porsche of " + ownerName;
    }

    public void drive(){
            System.out.println("Porsche drivin ...");
    }
    @Override
    public Porsche clone() {
        try {
            return (Porsche) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
