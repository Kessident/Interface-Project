package com;

public class Pilot extends Soldier implements Bombing {
    public Pilot(String name) {
        super(name, "Pilot");
    }

    public Pilot(String name, String rank) {
        super(name, "Pilot");
    }

    @Override
    public String eat() {
        return null;
    }

    @Override
    public String walk() {
        return null;
    }

    @Override
    public String speak() {
        return null;
    }

    @Override
    public String changeWeapon() {
        return null;
    }

    @Override
    public String shoot() {
        return null;
    }

    @Override
    public String reload() {
        return null;
    }

    @Override
    public Bomb dropIt() {
        return new Bomb();
    }
}
