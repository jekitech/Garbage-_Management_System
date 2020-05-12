/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Database.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kebre
 */
public class User_DataAccess {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public boolean make_request(RequestModel model){
        
        String sql = "insert into requests(username,location,Date,Description,collection_date,status)values(?,?,?,?,?,?)";
        con = DbConnection.createConnection();
        //System.out.println(con);
        boolean s = false;
        try {
            
            pst = con.prepareStatement(sql);
            pst.setString(1, model.getUsername());
            pst.setString(2, model.getLocation());
            pst.setDate(3, model.getDate());
            pst.setString(4, model.description);
            pst.setDate(5, model.getCollection_date());
            pst.setInt(6, model.getStatus());
            
            s = pst.execute();
            s = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }
    public String User_residence (String username){
        
//        List<UserModel> location = new ArrayList<>();
        String sql = "select * from user_details where Username=?";
        con = DbConnection.createConnection();
        String location = "";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, username);
            rs = pst.executeQuery();
            
            while(rs.next()){
//                UserModel model = new UserModel();
//                model.setUser_residence(rs.getString("location"));
//                location.add(model);
                location = rs.getString("location");
            }
        } 
        catch (Exception e) {
        }
        return location;
    }
    public List<RequestModel> all_requests(String name){
        
        List<RequestModel> models = new ArrayList<>();
        String sql = "select * from requests where username=?";
        con = DbConnection.createConnection();
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, name);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                RequestModel model = new RequestModel();
                model.setUsername(rs.getString("username"));
                model.setLocation(rs.getString("location"));
                model.setDate(rs.getDate("Date"));
                model.setDescription(rs.getString("Description"));
                model.setCollection_date(rs.getDate("collection_date"));
                model.setStatus(rs.getInt("status"));
                model.setId(rs.getInt("id"));
                models.add(model);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return models;
    }
    public List<UserModel> user_profile(String username){
        
        List<UserModel> details = new ArrayList<>();
        String query = "select * from user_details where Username = ?";
        con = DbConnection.createConnection();
        
        try {
            pst = con.prepareStatement(query);
            pst.setString(1, username);
            
            rs = pst.executeQuery();
            //System.out.println(query);
            while(rs.next()){
                
                UserModel model = new UserModel();
                model.setFname(rs.getString("first_name"));
                model.setLname(rs.getString("last_name"));
                model.setUsername(rs.getString("Username"));
                model.setFilename(rs.getString("filename"));
                model.setPhone(rs.getString("phone_number"));
                model.setUser_residence(rs.getString("location"));
                model.setCounty(rs.getString("County"));
                model.setEmail(rs.getString("email"));
                model.setPassword(rs.getString("password"));
                model.setId(rs.getInt("id"));
                details.add(model);
                
            }
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return details;
    }
    //update profile
    public int update_profile(UserModel model,String id){
        
        String query = "update user_details set Username=?,first_name=?,last_name=?,filename=?,password=?,County=?,phone_number=?,location=?,email=?" + " where id=?";
        con = DbConnection.createConnection();
        int s = 0 ;
        System.out.println(model.getFilename());
        try {
            pst = con.prepareStatement(query);
            
            pst.setString(1, model.getUsername());
            pst.setString(2, model.getFname());
            pst.setString(3, model.getLname());
            pst.setString(4, model.getFilename());
            pst.setString(5, model.getPassword());
            pst.setString(6, model.getCounty());
            pst.setString(7, model.getPhone());
            pst.setString(8, model.getUser_residence());
            pst.setString(9, model.getEmail());
            pst.setInt(10, Integer.parseInt(id));
            
            s = pst.executeUpdate();
        } catch (Exception e) {
            //System.out.println("error");
            e.printStackTrace();
        }
        return s;
    }
    public List<RequestModel> edit_requests(String id){
        
        List<RequestModel> models = new ArrayList<>();
        String sql = "select * from requests where id=?";
        con = DbConnection.createConnection();
        
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, id);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                RequestModel model = new RequestModel();
                model.setLocation(rs.getString("location"));
                model.setDescription(rs.getString("Description"));
                model.setId(rs.getInt("id"));
                models.add(model);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return models;
    }
     public int update_request(RequestModel model,int id){
        
        String query = "update requests set location=?,Description=?" + " where id=?";
        con = DbConnection.createConnection();
        int s = 0 ;
        //System.out.println(model.getFilename());
        try {
            pst = con.prepareStatement(query);
            
            pst.setString(1, model.getLocation());
            pst.setString(2, model.getDescription());
            pst.setInt(3, id);
            
            s = pst.executeUpdate();
        } catch (Exception e) {
            //System.out.println("error");
            e.printStackTrace();
        }
        return s;
    }
     public int del(String id){
         
         String query = "delete from requests where id=?";
         con = DbConnection.createConnection();
         
         int result = 0;
         try {
             pst = con.prepareStatement(query);
             pst.setString(1, id);
             
             result = pst.executeUpdate();
             
         } catch (Exception e) {
             e.printStackTrace();
         }
         return result;
     }
     public int updateStatus(RequestModel model,String id){
         String query = "update requests set status=?" + " where id=?";
         con = DbConnection.createConnection();
         
         int result = 0;
         try {
             pst = con.prepareStatement(query);
             pst.setInt(1, model.getStatus());
             pst.setString(2, id);
             
             result = pst.executeUpdate();
         } catch (Exception e) {
             e.printStackTrace();
         }
         return result;
     }
    
}
