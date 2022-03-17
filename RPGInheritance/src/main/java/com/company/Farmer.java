package com.company;

public class Farmer extends Character {


    public Farmer(String name) {
        super(name);
        this.setStrength(75);
        this.setStamina(75);
        this.setSpeed(10);
        this.setAttackPower(1);
    }

    public void plow() {
        System.out.println(this.getName() + "plowing");
        this.decreaseStamina(3);
    }

    public void harvest() {
        System.out.println(this.getName() + "harvesting");
        this.decreaseStamina(3);
    }
}
