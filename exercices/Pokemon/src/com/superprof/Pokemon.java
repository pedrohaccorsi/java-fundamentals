package com.superprof;

public class Pokemon {

    public String name;
    public double strength;

    Pokemon(String name, double strength){
        this.name = name;
        this.strength = strength;
    }

    public double getStrength() {
        return strength;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "My name is "
                + name
                + " and my strength is "
                + strength;
    }

}
