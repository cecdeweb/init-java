package fr.m2i;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nombre;

        try {
            System.out.print("Entrez le premier nombre : ");
            nombre = scanner.nextInt();
            scanner.close();

            for (int i = 0; i < 11; i++) {
                int result = nombre * i;
                System.out.println(nombre + " x " + i + " = " + result);

            }


        } catch (InputMismatchException e) {
            System.out.println("Attention ! Tu es sencé mettre un nombre entier");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}