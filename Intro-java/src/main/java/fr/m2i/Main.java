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

        double a, b, c;
        double delta;
        double x1, x2;

        while (true) { // pour eviter de relancer la console pour tester code
            System.out.println("Donnez la valeur de >>> a <<< dans l'équation ax2 + bx + c : ");
            a = scan.nextInt();
            System.out.println("Donnez la valeur de >>> b <<< dans l'équation ax2 + bx + c : ");
            b = scan.nextInt();
            System.out.println("Donnez la valeur de >>> c <<< dans l'équation ax2 + bx + c : ");
            c = scan.nextInt();
            delta = (b * b) - (4 * a * c);

            if (delta == 0) {
                x1 = -(b / (2 * a));
                System.out.println("L'équation ax2 + bx + c = 0 a une solution unique : x1 = " + x1);
            } else if (delta > 0) {
                x1 = ((-b - Math.sqrt(delta)) / 2 * a);
                x2 = ((-b + Math.sqrt(delta)) / 2 * a);
                System.out.println("L'équation ax2 + bx + c = 0 a deux solutions distinctes : x1 = " + x1 + "  et  x2 = " + x2);
            } else {
                System.out.println("L'équation ax2 + bx + c = 0 n'a pas de solution réelle");
            }
        }
    }
}