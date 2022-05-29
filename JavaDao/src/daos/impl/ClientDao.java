package daos.impl;

import daos.interfaces.IClientDao;
import models.Client;
import services.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ClientDao implements IClientDao {
    @Override
    public ArrayList<Client> getAll() {

        ArrayList<Client> clients=new ArrayList<>();

        try {
            Connection connection=DatabaseConnection.getInstance();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT * FROM clients");
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String companyName=resultSet.getString("companyName");
                String firstName=resultSet.getString("firstName");
                String lastName=resultSet.getString("lastName");
                String email=resultSet.getString("email");
                String phone=resultSet.getString("phone");
                String address=resultSet.getString("address");
                String zipCode=resultSet.getString("zipCode");
                String city=resultSet.getString("city");
                String country=resultSet.getString("country");
                int state=resultSet.getInt("state");

                clients.add(new Client(id, companyName, firstName, lastName, email, phone, address, zipCode, city, country, state));

            }
        }catch (SQLException e){
            System.out.println("une erreur est survenue lors de la récupération des données");
        }
        return clients;
    }

    @Override
    public Client getById(int id) {
/*

        ArrayList<Client> clients=new ArrayList<>();

        try {
            Connection connection=DatabaseConnection.getInstance();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT * FROM clients WHERE id = ?");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String companyName = resultSet.getString("companyName");
                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                String address = resultSet.getString("address");
                String zipCode = resultSet.getString("zipCode");
                String city = resultSet.getString("city");
                String country = resultSet.getString("country");
                int state = resultSet.getInt("state");

                clients.add(new Client(id, companyName, firstName, lastName, email, phone, address, zipCode, city, country, state));
            }

            }catch (SQLException e){
                System.err.format("SQL State : %s\n%s", e.getSQLState(),e.getMessage());
            }catch (Exception e){
                e.printStackTrace();
            }
*/
        return null;
    }

    @Override
    public void save(Client client) {

    }

    @Override
    public void update(Client client) {

    }

    @Override
    public void delete(int id) {

    }
    // quand class implemente interface elle est obligée de fournir une methode



}
