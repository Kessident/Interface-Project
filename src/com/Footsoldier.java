package com;

public class Footsoldier extends Soldier implements Melee, Shooting {
    public Footsoldier(String name) {
        super(name, "Footsoldier");
    }

    public Footsoldier(String name, String rank) {
        super(name, "Footsoldier");
    }

    @Override
    public String eat() {
        return "I'm so hungry.\nOh look, some delicious food.";
    }

    @Override
    public String walk() {
        return "I just love being told to march in the rain. Joy.";
    }

    @Override
    public String speak() {
        return "Is this war really necessary?";
    }

    @Override
    public String changeWeapon() {
        return "Switching weapons!";
    }

    @Override
    public String strike() {
        return "Take this you pig!";
    }

    @Override
    public String shoot() {
        return "PewPew";
    }

    @Override
    public String reload() {
        return "Cover me! Reloading!";
    }
}
