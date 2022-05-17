package fr.m2i;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*
*       Ecrivez un programme Java qui lit un nombre et
*       indique s'il est positif, négatif ou s'il vaut zéro
*       et s'il est pair ou impair.
*/

        int number=0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Entrer un nombre entier : ");
        number=scan.nextInt();

        //positif, négatif, pair et impair
        if (number<0 && number%2==0){
            System.out.println("Votre nombre est négatif et pair.");
        } else if (number<0 && number%2!=0){
            System.out.println("Votre nombre est négatif et impair.");
        } else if (number>0 && number%2!=0){
            System.out.println("Votre nombre est positif et impair.");
        } else if (number>0 && number%2==0){
            System.out.println("Votre nombre est positif et pair.");
        } else if (number==0){
            System.out.println("Le nombre est zéro (et il est pair).");
        } else {
            System.out.println("Votre nombre n'est pas un entier.");
        }

    }
}