package com;

public abstract class Soldier implements Comparable<Soldier> {
    String name;
    String rank;
    int serialNumber;
    static int currentSerialNumber = 0;

    public Soldier(String name, String rank) {
        this.name = name;
        this.rank = rank;
        currentSerialNumber++;
        this.serialNumber = currentSerialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String sleep() {
        return "zzzzzz...";
    }

    public abstract String eat();

    public abstract String walk();

    public abstract String speak();

    public abstract String changeWeapon();

    public String giveOrder(Soldier subordinate, String order) {
        if (this.compareTo(subordinate) < 0) {
            return "Who do you think you are, trying to give orders to your superiors?";
        } else if (this.compareTo(subordinate) == 0) {
            return "Stop trying to give me orders, we're the same rank.";
        } else {
            if (order.equals("sleep")) {
                return subordinate.sleep();
            } else if (order.equals("eat")) {
                return subordinate.eat();
            } else if (order.equals("walk")) {
                return subordinate.walk();
            } else if (order.equals("speak")) {
                return subordinate.speak();
            } else if (order.equals("changeWeapon")) {
                return subordinate.changeWeapon();
            } else {
                return "That's not a valid order";
            }
        }
    }

    @Override
    public int compareTo(Soldier otherSoldier) {
        if (this.rank.equals(otherSoldier.getRank())) {
            return 0;
        } else if (this.rank.equals("Officer")) {
            return 1;
        } else if (this.rank.equals("Gunner")) {
            if (otherSoldier.getRank().equals("Officer")) {
                return -1;
            } else {
                return 1;
            }
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        String toString = "Name: " + name + "\n" +
            "Rank: " + rank + "\n" +
            "SerialNumber: " + serialNumber;
        return toString;
    }
}
