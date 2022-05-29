package fr.m2i;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
*        Ecrire un programme Java qui déclare 3 variables, a,b,c et qui va ensuite effectuer une permutation de ces valeurs :
*        Exemple :
*        Entrez la première valeur(a) : 51
*        Entrez la deuxième valeur(b) : 876
*        Entrez la troisième valeur(c) : 235
*        Les valeurs entrées sont : a = 51, b = 876 et c = 235
*        Permutation: b <== a, c <== b, a <== c
*        Les valeurs permutées sont : a = 235, b = 51 et c = 876
***/
        Scanner scan = new Scanner(System.in);

        int a, b, c;
        int permut=0;

        System.out.println("Entrez la première valeur(a) :");
        a=scan.nextInt();
        System.out.println("Entrez la première valeur(b) :");
        b=scan.nextInt();
        System.out.println("Entrez la première valeur(c) :");
        c=scan.nextInt();

        // Permutation: b <== a, c <== b, a <== c
        //  a = 51, b = 876 et c = 235
        //  a = 235 b = 51  c = 876

        permut=a;
        a=c;
        c=b;
        b=permut;

        System.out.println("Les valeurs permutées sont : " + "a = " + a + ", b = " + b + ", c = " + c);
    }
}