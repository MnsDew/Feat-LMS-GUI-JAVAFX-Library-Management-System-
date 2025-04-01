/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BackEnd;
import java.sql.Connection;
 


/**
 *
 * @author mnsso
 */
public interface IDatabaseConnection { // I prefer to use Strategy Pattern to be scalable with future chnages , to connect to any database easily in future. 
    void connect();
    void disconnect();
    Connection getConnection();
    
}

    

