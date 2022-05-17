package fr.m2i;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         * Ecrivez un programme Java qui permet de résoudre une équation du 2nd degré de la forme ax2+bx+c = 0.
         * L'utilisateur devra fournir a,b,c à partir du clavier, ensuite le programme lui donnera la solution
         * Principe du fonctionnement d'une équation du 2nd degré:
         * https://www.maths-et-tiques.fr/telech/Secondegre2ESL.pdf
         * */

        Scanner scan = new Scanner(System.in);

        int a, b, c;
        int delta;

        System.out.println("Donnez la valeur de >>> a <<< dans l'équation ax2 + bx + c : ");
        a=scan.nextInt();
        System.out.println("Donnez la valeur de >>> b <<< dans l'équation ax2 + bx + c : ");
        b=scan.nextInt();
        System.out.println("Donnez la valeur de >>> c <<< dans l'équation ax2 + bx + c : ");
        c=scan.nextInt();
        delta=(b*b)-(4*a*c);

        if(delta<0){

        }



    }
}