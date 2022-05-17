package fr.m2i;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String mdp = "motDepasse8!";
        String email = "email@email.fr";
        String mdpSaisi = "";
        String emailSaisi = "";

        for (int i = 1; i <=5 ; i++) {

            int cpt = 5-i;

            System.out.println("Saisir votre email :");
            emailSaisi=scan.nextLine();
            System.out.println("Saisir votre mot de passe :");
            mdpSaisi=scan.nextLine();

            if (!mdp.equals(mdpSaisi) || !email.equals(emailSaisi)){
                if(cpt==0){
                        System.out.println("Vous avez saisi des mauvais identifiants 5 fois, votre compte est bloqué");
                        break;
                }
            System.out.println("Identifiants incorrect - plus que " + cpt + " essai(s)");
            }else{
                System.out.println("Bienvenu dans votre espace client");
                break;
            }

        }


    }
}