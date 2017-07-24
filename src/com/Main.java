package com;

public class Main {

    public static void main(String[] args) {
        Footsoldier s1 = new Footsoldier("Soldier 1");
        Footsoldier s2 = new Footsoldier("Soldier 2");
        Gunner s3 = new Gunner("Soldier 3");
        Gunner s4 = new Gunner("Soldier 4");
        Officer s5 = new Officer("Soldier 5");
        Officer s6 = new Officer("Soldier 6");

        System.out.println("------ S1 ------");
        System.out.println(s1.toString());
        System.out.println("------ S2 ------");
        System.out.println(s2.toString());
        System.out.println("------ S3 ------");
        System.out.println(s3.toString());
        System.out.println("------ S4 ------");
        System.out.println(s4.toString());
        System.out.println("------ S5 ------");
        System.out.println(s5.toString());
        System.out.println("------ S6 ------");
        System.out.println(s6.toString());

        System.out.println();

        System.out.println("Footsoldier methods");
        System.out.println(s1.sleep());
        System.out.println(s1.eat());
        System.out.println(s1.walk());
        System.out.println(s1.speak());
        System.out.println(s1.changeWeapon());
        System.out.println(s1.strike());
        System.out.println(s1.shoot());
        System.out.println(s1.reload());

        System.out.println();

        System.out.println("Gunner methods");
        System.out.println(s3.sleep());
        System.out.println(s3.eat());
        System.out.println(s3.walk());
        System.out.println(s3.speak());
        System.out.println(s3.changeWeapon());
        System.out.println(s3.strike());
        System.out.println(s3.shoot());
        System.out.println(s3.reload());

        System.out.println();

        System.out.println("Officer methods");
        System.out.println(s5.sleep());
        System.out.println(s5.eat());
        System.out.println(s5.walk());
        System.out.println(s5.speak());
        System.out.println(s5.changeWeapon());
        System.out.println(s5.strike());
        System.out.println(s5.shoot());
        System.out.println(s5.reload());

        System.out.println();

        System.out.println(s1.getRank() + " giving order to " + s2.getRank());
        System.out.println(s1.giveOrder(s2, "eat"));
        System.out.println("----------------------------------");
        System.out.println(s1.getRank() + " giving order to " + s4.getRank());
        System.out.println(s1.giveOrder(s4, "eat"));
        System.out.println("----------------------------------");
        System.out.println(s1.getRank() + " giving order to " + s6.getRank());
        System.out.println(s1.giveOrder(s6, "eat"));

        System.out.println();

        System.out.println(s3.getRank() + " giving order to " + s2.getRank());
        System.out.println(s3.giveOrder(s2, "eat"));
        System.out.println("----------------------------------");
        System.out.println(s3.getRank() + " giving order to " + s4.getRank());
        System.out.println(s3.giveOrder(s4, "eat"));
        System.out.println("----------------------------------");
        System.out.println(s3.getRank() + " giving order to " + s6.getRank());
        System.out.println(s3.giveOrder(s6, "eat"));

        System.out.println();

        System.out.println(s5.getRank() + " giving order to " + s2.getRank());
        System.out.println(s5.giveOrder(s2, "eat"));
        System.out.println("----------------------------------");
        System.out.println(s5.getRank() + " giving order to " + s4.getRank());
        System.out.println(s5.giveOrder(s4, "eat"));
        System.out.println("----------------------------------");
        System.out.println(s5.getRank() + " giving order to " + s6.getRank());
        System.out.println(s5.giveOrder(s6, "eat"));

        System.out.println();

        Pilot p1 = new Pilot("First Pilot");
        System.out.println("I am a pilot");
        System.out.println(p1.dropIt().toString());
    }
}