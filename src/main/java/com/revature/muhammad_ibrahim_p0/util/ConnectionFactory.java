package com.revature.muhammad_ibrahim_p0.util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Connection;

public class ConnectionFactory {

    private static ConnectionFactory connectionFactory;
   private Properties properties = new Properties();


    static {
        try{
            Class.forName("org.postgresql.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }


   private ConnectionFactory() {
        try {
            properties.load(new FileReader("src/main/resources/application.properties"));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }


    // lazy singleton implementation
    public static ConnectionFactory getInstance() {
        if (connectionFactory == null) {
            connectionFactory = new ConnectionFactory();
        }
        return connectionFactory;
    }

    public Connection getConnection() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(
                    properties.getProperty("host-url"),
                    properties.getProperty("username"),
                    properties.getProperty("password"));
        }catch (SQLException E){

        }
        return conn;
    }
}
