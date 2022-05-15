package fr.m2i;

public class Main {
    public static void main(String[] args) {

        Soldier Carja = new Soldier();
        Wizard Sylens = new Wizard();
        System.out.println(Carja.getName() + " : " + Carja.speak() + " J'attaque de " + Carja.attack() + ". Il me reste " + Carja.getHealthPoint() + " de points de vie.");
        System.out.println(Sylens.getName() + " : " + Sylens.speak() + " J'attaque de " + Sylens.attack() + ". Il me reste " + Sylens.getHealthPoint() + " de points de vie.");

    }

}