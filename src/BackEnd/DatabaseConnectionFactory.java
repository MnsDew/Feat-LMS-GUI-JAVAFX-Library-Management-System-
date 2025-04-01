/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

/**
 *
 * @author mnsso
 */
public class DatabaseConnectionFactory {
    
  //The factory of concrete classes
    
    public static IDatabaseConnection getConnection(String dbType){
        if(dbType == null){
            return null;
        } if (dbType.equalsIgnoreCase("MYSQL")){
            return new MySQLConnection();
        }else if(dbType.equalsIgnoreCase("POSTGRESSQL")){
            return new PostgresSQLConnection();
    
        }
        return null;
    }
    
}
