package com.company;

public class Constable extends Character {
    private String jurisdiction;

    public Constable(String name, String jurisdiction) {
        super(name);
        this.setStrength(60);
        this.setStamina(60);
        this.setSpeed(20);
        this.setAttackPower(5);
        this.jurisdiction = jurisdiction;
    }

    public void arrest(Character character) {
        System.out.println(this.getName() + "arresting" + character.getName());
        this.decreaseStamina(5);
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }
}
