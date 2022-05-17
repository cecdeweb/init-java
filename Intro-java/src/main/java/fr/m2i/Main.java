package fr.m2i;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rayon;
        double surface = 0;
        double pi = 3.14;

        System.out.print("Entrez le rayon du cercle : ");
        rayon = scanner.nextInt();
        surface = pi * rayon * rayon;
        System.out.println("La surface du cercle est : "+surface);

    }
}