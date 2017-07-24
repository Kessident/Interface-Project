package com;

public class Gunner extends Soldier implements Melee, Shooting {
    public Gunner(String name) {
        super(name, "Gunner");
    }

    public Gunner(String name, String rank) {
        super(name, "Gunner");
    }

    @Override
    public String eat() {
        return "Oh look, some delicious food.";
    }

    @Override
    public String walk() {
        return "Trudging on.";
    }

    @Override
    public String speak() {
        return "This is my gun. There are many like it but this one is mine.";
    }

    @Override
    public String changeWeapon() {
        return "This is my gun, I'm not switching it for anything";
    }

    @Override
    public String strike() {
        return "What are you expecting me to punch, I'm a gunner.";
    }

    @Override
    public String shoot() {
        return "BlamBlamBlam";
    }

    @Override
    public String reload() {
        return "Reloading!";
    }
}
