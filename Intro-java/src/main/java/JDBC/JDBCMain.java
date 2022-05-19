package JDBC;

import java.sql.*;

public class JDBCMain {
    public static void main(String[] args) {

        Connection connection = null; // demande de connexion bdd
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/poe_ang_v1", "root", ""); // utilise url jdbc (driver) : pour cibler mysql : ip local (127.0.0.1) : port mysql / nom database, admin, mdp
            // établi et maintien la connexion - contien toutes les info de connexion
            System.out.println("Connexion établie");

            Statement statement = connection.createStatement();
            // requete sql - contient method executeQuery()
            ResultSet resultSet = statement.executeQuery("SELECT * FROM orders");
            while (resultSet.next()){ // tant qu'il y a quelque chose après dans ma requête
                int id=resultSet.getInt("id"); // variable id qui récupère le champ id
                String typePresta=resultSet.getString("typePresta");
                String designation=resultSet.getString("designation");
                int nombreJours= resultSet.getInt("NbDays");
                int prixUnitaire=resultSet.getInt("unitPrice");

                System.out.printf("ID : %d\nTypre de prestation : %s\nDesignation : %s\n\n", id, typePresta, designation);

            }
        } catch (SQLException e) {
            System.out.println("Erreur de connexion");
            System.out.println(e.getMessage());
        }
    }
}
