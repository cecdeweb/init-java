package fr.m2i;

public class Main {
    public static void main(String[] args) {

        Wizard wizard = new Wizard();
        //wizard.getHealthPoint()=10;
        System.out.println(wizard.speak());
        wizard.ennemy(2); // attack points

/*
        System.out.println(wizard.attack());
        System.out.println("getHealthPoint");
        System.out.println(wizard.healtEnnemy);
*/

    }

}