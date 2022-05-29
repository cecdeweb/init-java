package fr.m2i;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        int i = 0;

        ArrayList<Users> users=new ArrayList<>();
        users.add(new Users(UUID.randomUUID().toString(), "Lafont", "Cécile", "dslgjlg@sdgh.fr", "lkehklest"));
        users.add(new Users(UUID.randomUUID().toString(), "shqh", "dqfjhqdnn", "ykyufh,x@sdgh.fr", "ugsjljkrkls"));
        users.add(new Users(UUID.randomUUID().toString(), "rdwfhd", "dhhhnsf", "uimggjl@dsg.fr", "sffhnffn"));
        users.add(new Users(UUID.randomUUID().toString(), "kkjgfjsj", "jsjyfdgj", "dslgfjlg@sdgh.fr", "lkehsklest"));
        users.add(new Users(UUID.randomUUID().toString(), "ultletlu", "sjsjypsj", "dslgjklg@sdgh.fr", "lkeehklest"));

        Scanner input = new Scanner(System.in);

        System.out.println("- Souhaitez-vous créer un compte ? -\nTapez oui ou non");
        String response = input.nextLine();

        if (response.equals("oui") || response.equals("O") || response.equals("o")){
            String id = UUID.randomUUID().toString();

            System.out.println("Nom : ");
            String lastname = input.nextLine();

            System.out.println("Prénom : ");
            String firstname = input.nextLine();

            System.out.println("Email : ");
            String email=input.nextLine();
            while (!Validation.isEmail(email)){
                System.out.println("Ceci n'est pas un email");
                email = input.nextLine();
            }

            System.out.println("Mdp : ");
            String mdp = input.nextLine();
            while (!Validation.isLength(mdp)){
                System.out.println("Votre email doit contenir entre 8 et 20 caractères");
                mdp = input.nextLine();
            }
            if (users.add(new Users(id, lastname, firstname, email, mdp))){
                System.out.println("Votre compte compte a bien été créé !");
            }
        }

        while (i<=2){
            i++;
            System.out.println("- Vous connecter - \nIdentifiant : ");
            String email = input.nextLine();

            System.out.println("Mot de passe : ");
            String mdp=input.nextLine();

            if (Validation.checkUser(users, email, mdp)){
                break;
            }
        }
        if (i==3){
            System.out.println("Trop de saisies erronées");
        }
    }
}