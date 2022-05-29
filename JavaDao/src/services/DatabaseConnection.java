package services;

import constantes.Constants;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static Connection connection;
    final private static String URL= Constants.URL;
    final private static String USERNAME= Constants.USERNAME;
    final private static String PASSWORD= Constants.PASSWORD;

    // restreindre la possibilité de créer des instances (Singleton design pattern)
    private DatabaseConnection(){}

    public static Connection getInstance() throws SQLException{
        if (connection==null){
            connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }
        return connection;
    }

}
