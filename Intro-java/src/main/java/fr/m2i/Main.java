package fr.m2i;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/* instancier un objet scanner
Scanner scanner = new Scanner(System.in);
demander un premier nombre
demander un deuxième nombre
utiliser une méthode du scanner pour réaliser l’opération et retourner le résultat */

        System.out.println("Saisissez un premier nombre: ");
        Scanner nombre1 = new Scanner(System.in);
        int nb1=nombre1.nextInt();

        System.out.println("Saisissez un deuxième nombre: ");
        Scanner nombre2 = new Scanner(System.in);
        int nb2=nombre2.nextInt();

        System.out.println("Résultat :" + nb1*nb2);

    }
}