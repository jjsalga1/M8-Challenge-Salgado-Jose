package com.company;

public class Character {
    protected String name;
    protected int strength;
    protected int health = 100;
    protected int stamina;
    protected int speed;
    protected int attackPower;

    public Character(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(this.name + "running");
        this.decreaseStamina(10);
    }

    public void attack(Character character) {
        System.out.println(this.name + "attacking" + character.getName());

        // decrease opposing character health
        character.decreaseHealth(this.attackPower);

        // decrease character stamina
        this.decreaseStamina(5);
    }

    public void heal() {
        System.out.println(this.name + "healing");
        this.health = 100;
    }

    public void decreaseHealth(int decrease) {
        this.health -= decrease;
    }

    public void increaseStamina(int increase) {
        this.stamina += increase;
    }

    public void decreaseStamina(int decrease) {
        this.stamina -= decrease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
