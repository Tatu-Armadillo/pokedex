package br.com.pokedex.configurations.connection;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionTest {
    
    public static void main(String[] args) throws SQLException{
        Connection connection = ConnectionFactory.getConnection();
        System.out.println("Successful Connection Test");
        connection.close();

    }
}
