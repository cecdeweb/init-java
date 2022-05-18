package fr.m2i;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Combien d'employés souhaitez-vous enregistrer?");
        var nombreEmployes=input.nextInt();

        Employe[] employes=new Employe[nombreEmployes];
        employes[0]=new Employe(1,"Christian","Lisangola");

        for(int i=0;i<employes.length;i++){
            System.out.print("Id : ");
            int id=input.nextInt();
            // efface memoire next
            input.nextLine();

            System.out.print("Votre nom : ");
            String nom=input.nextLine();


            System.out.print("Votre prenom : ");
            String prenom=input.nextLine();

//          Employe employe=new Employe(id,prenom,nom);
//          employes[i]=employe;

            employes[i]=new Employe(id,prenom,nom);
        }


//      Affichage de tous les employés
        System.out.println(Arrays.toString(employes));

//      Affichage de chaque employé de manière individuelle : Mauvaise pratique
        System.out.println("Employé[0] : "+employes[0]);

//      Affichage de chaque employé de manière individuelle : Bonne pratique
        for(int i=0;i<employes.length;i++){
//          System.out.println("Employé["+i+"] : "+employes[i]);
            System.out.println("Employé["+i+"] : "+employes[i].getLastName());
        }

//      Simple liste
//        String[] fruits=new String[3];
//        fruits[0]="pommes";
//        fruits[1]="bananes";
//        fruits[2]="oranges";
//
//        System.out.println(Arrays.toString(fruits));

//        Employe chris=new Employe(3,"Jean","Zozor");
//        System.out.println(chris);
    }
}