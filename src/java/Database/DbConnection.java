/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author kebre
 */
public class DbConnection {
    
    public static Connection createConnection(){
        
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/garbage_management";
        String username = "root";
        String password = "";
        
        try {
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (Exception e) {
                System.out.println("error");
            }
            con = DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
        }
        return con;
    }
//    public static void main(String args[]){
//        DbConnection.createConnection();
//    }
    
}
