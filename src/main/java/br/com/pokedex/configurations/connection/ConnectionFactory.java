package br.com.pokedex.configurations.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    public static Connection getConnection() {
        try {
            Properties prop = getProperties();
            final String path = prop.getProperty("data.url");            
            final String user = prop.getProperty("data.user");            
            final String password = prop.getProperty("data.password");        
            return DriverManager.getConnection(path, user, password);   
        } catch (SQLException | IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static Properties getProperties() throws IOException {
        Properties prop = new Properties();
        String path = "connection.properties";
        prop.load(ConnectionFactory.class.getResourceAsStream(path));
        return prop;
    }
}
