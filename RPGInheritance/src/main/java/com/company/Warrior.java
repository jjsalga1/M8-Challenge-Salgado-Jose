package com.company;

public class Warrior extends Character {
    private int shieldStrength;

    public Warrior(String name) {
        super(name);
        this.setStrength(75);
        this.setStamina(100);
        this.setSpeed(50);
        this.setAttackPower(10);
        this.setShieldStrength(100);
    }

    public void decreaseShieldStrength(int decrease) {
        this.shieldStrength -= decrease;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }
}
