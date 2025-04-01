package BackEnd;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ 

/**
 *
 * @author mnsso
 */ 
public class PostgresSQLConnection implements IDatabaseConnection {
    private Connection connection;

    @Override
    public void connect() {
        try {
            // Replace with your PostgreSQL credentials
            String url = "jdbc:postgresql://localhost:5432/lmspostgres";
            String user = "postgres";
            String password = "135791133557799";

            connection = DriverManager.getConnection(url, user, password);
            System.out.println("PostgreSQL connected successfully.");
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("PostgreSQL disconnected successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection() {
        return connection;
    }
}

 
