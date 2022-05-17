package fr.m2i;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /* TP6
         *   Ecrire un programme qui permet à l’utilisateur de saisir un entier entre 1 et 12 et qui affiche le nom du mois correspondant.
         *   Ex:
         *   Mois : 4
         *   Résult : Avril
         * */
        // gestion des erreurs a améliorer

        int numberMonth = 0;

        // instanciation tableau des mois
        HashMap<Integer, String> month = new HashMap<Integer, String>();
        String[] monthTable = {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Novembre", "Decembre"};
        // incrementation automatique des cles en fonction de mes valeurs mois
        for (int i = 0; i < monthTable.length; i++) {
            month.put(i + 1, monthTable[i]);
        }

        // exception des donnees saisies
        while (true) {
            try (Scanner scan = new Scanner(System.in);) {
                System.out.println("Veuillez saisir un chiffre entre 1 et 12 pour obtenir le mois correspondant :");
                numberMonth = scan.nextInt();
                if (numberMonth >= 1 && numberMonth <= 12) {
                    break;
                }
                System.out.println("Merci de saisir un chiffre entre 1 et 12 !");
            }catch(InputMismatchException e){
                System.out.println("Merci de saisir seulement un chiffre entre 1 et 12 !");
            }
        }
        // affichage de la reponse
        System.out.println("Le mois correspondant au nombre " + numberMonth + " est : " + month.get(numberMonth));
    }
}