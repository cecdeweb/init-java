package JDBC;

import java.util.ArrayList;
import java.util.Scanner;
import static JDBC.ClientQueries.getListClients;

public class JDBCMain {
    public static void main(String[] args) {

        /** TP9
         *        Vous aurez au minimun 2 classes:
         *        Une classe qui représente le client(Client)
         *        Une classe dans laquelle vous allez mettre le requête SQL(Vous pouvez l’appeler ClientQueries)
         *        Tout autre classe qui peut sembler important
         *        Effectuer des requêtes SQL pour :
         *        Lire les données de la table clients
         *        Récupérer un client par son ID : méthode qui reçoit un ID et qui ensuite fait une requête SQL
         *        Supprimer un client par son ID : méthode qui reçoit un ID et qui ensuite fait une requête SQL de suppression
         *        Mettre à jour les données d’un client : méthode qui reçoit un objet de type Client et qui ensuite insérer dans la base de données
         **/

        var input = new Scanner(System.in);

        System.out.println("1- Afficher les clients\n 2- Entrer un client\n 3- Appeler un client par son ID " +
                "\n 4- Supprimer un client par son ID \n 5- Mettre à jour les données d'un client par son ID \n Que souhaitez-vous faire ? Tapez le numéro de votre choix :");
        var choice = input.nextInt();

        switch (choice){

            case 1:
                System.out.println("choix 1");
                System.out.println(getListClients().toString());
        }

        }
    }
