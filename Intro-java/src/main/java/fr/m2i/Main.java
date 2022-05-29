package fr.m2i;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/***
 * Ecrire un programme Java qui demande à l'utilisateur de saisir son nom,
 * prenom et age, et qui ensuite va afficher le message : "Vous vous
 * appelez <prenom> <nom>, et vous avez <age> ans"
 ***/
        Scanner scanner = new Scanner(System.in);

        String name = "";
        String firstname = "";
        int age = 0;

        System.out.println("Quel est votre nom ?");
        name = scanner.nextLine();
        System.out.println("Quel est votre prénom ?");
        firstname = scanner.nextLine();
        System.out.println("Quel est votre age ?");
        age = scanner.nextInt();
        System.out.println("Vous vous appelez " + firstname + " " + name + ", et vous avez " + age + " ans");

    }
}