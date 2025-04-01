/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mnsso
 */
public class MySQLConnection implements IDatabaseConnection {
    private Connection connection;

    @Override
    public void connect() {
        try {
               
          Class.forName("com.mysql.cj.jdbc.Driver");

            // Replace with your PostgreSQL credentials
             String url = "jdbc:mysql://localhost:3306/lms";
            String user = "root";
            String password = "NoWay13579-@";
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("MSQL connected successfully.");
            
} catch (ClassNotFoundException e ){
    System.out.println("Cannot connect to the Driver of MySQL or JDBC");
             e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("MySQL faild to connect.");
            e.printStackTrace();
            
        }
    }
  

@Override
    public void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("MySQL disconnected successfully.");
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

 