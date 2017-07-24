package com;

public class Officer extends Soldier implements Melee, Shooting {
    public Officer(String name) {
        super(name, "Officer");
    }

    public Officer(String name, String rank) {
        super(name, "Officer");
    }

    @Override
    public String eat() {
        return "Someone go get me some food  before I make you all clean the latrines for a month.";
    }

    @Override
    public String walk() {
        return "Walking is beneath me. Someone get me a vehicle.";
    }

    @Override
    public String speak() {
        return "ATTENTION!!";
    }

    @Override
    public String changeWeapon() {
        return "I am an officer, fighting is beneath me";
    }

    @Override
    public String strike() {
        return "I am an officer, fighting is beneath me";
    }

    @Override
    public String shoot() {
        return "I am an officer, fighting is beneath me";
    }

    @Override
    public String reload() {
        return "I am an officer, fighting is beneath me";
    }
}
