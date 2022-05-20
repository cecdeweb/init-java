package JDBC;

import java.sql.*;
import java.util.ArrayList;

public class ClientQueries {

    public static ArrayList<Client> getListClients(){

        try (Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/poe_ang_v1", "root", "")) {
            Statement statement = connect.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT * FROM clients");
            System.out.println("Connecté à la bdd");
            var listClients = new ArrayList<Client>();
            while (resultSet.next()) {//tant qu'il y'a des infos
                Client client = new Client(
                        resultSet.getInt("id"),
                        resultSet.getString("companyName"),
                        resultSet.getString("firstName"),
                        resultSet.getString("email"),
                        resultSet.getString("phone"),
                        resultSet.getString("address"),
                        resultSet.getString("zipCode"),
                        resultSet.getString("city"),
                        resultSet.getByte("state"));

                listClients.add(client);//je récuper les infos et ajoute dans mon ArrayList
            }
            return listClients;

        }catch (SQLException e){
            System.out.println("Pas connecté à la bdd");
            System.err.format("SQL state: %s\n%s", e.getSQLState(), e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }return null;
    }
}
