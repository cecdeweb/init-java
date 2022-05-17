package fr.m2i;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/**
*  Ecrire un programme Java qui demande à l'utilisateur de saisir la valeur du diamètre, et qui ensuite va effectuer le calcul de la surface.
*  Surface = Rayon x Rayon x PI;
*  Rayon = Diamètre / 2
**/
        Scanner scanner = new Scanner(System.in);

        double rayon;
        double surface = 0;
        double pi = Math.PI;

        System.out.print("Entrez le rayon du cercle : ");
        rayon = scanner.nextInt();
        surface = pi * rayon * rayon;
        System.out.println("La surface du cercle est : "+surface);

        // voir pour afficher un float à 2 décimal en sortie

    }
}