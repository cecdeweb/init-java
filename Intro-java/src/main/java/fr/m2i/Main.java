package fr.m2i;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calcul = new Calculator(); // appeler sa class

        int nbr1=0;
        int nbr2=0;

        System.out.println("Taper un premier nombre :");
        nbr1 = scanner.nextInt();
        System.out.println("Taper un deuxième nombre :");
        nbr2 = scanner.nextInt();

        System.out.println(calcul.addition(nbr1, nbr2));
        System.out.println(calcul.multiplication(nbr1, nbr2));
        System.out.println(calcul.soustract(nbr1, nbr2));
        System.out.println(calcul.division(nbr1, nbr2));

    }
}