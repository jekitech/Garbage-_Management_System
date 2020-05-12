/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Authentication;

import Database.DbConnection;
import User.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author kebre
 */
public class Login {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public boolean auth(String username,String password, String table) throws SQLException{
        
        String query = "select * from "+table+" where Username = ? and password = ?";
        //call the connection class
        //System.out.println(query);
        con = DbConnection.createConnection();
        
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);
            
            rs = pst.executeQuery();
            if(rs.next()){
                return true;
            }else{
                return false;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return true;
    }
    public boolean register(UserModel model){
        
        String sql = "insert into user_details(Username,first_name,last_name,filename,password,County,phone_number,location,email)values(?,?,?,?,?,?,?,?,?)";
        con = DbConnection.createConnection();
        boolean s = false;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, model.getUsername());
            pst.setString(2, model.getFname());
            pst.setString(3, model.getLname());
            pst.setString(4, model.getFilename());
            pst.setString(5, model.getPassword());
            pst.setString(6, model.getCounty());
            pst.setString(7, model.getPhone());
            pst.setString(8, model.getUser_residence());
            pst.setString(9, model.getEmail());
           
            
            s = pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }
   
}
