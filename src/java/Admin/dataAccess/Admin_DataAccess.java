/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.dataAccess;

import Admin.model.Admin_Model;
import Database.DbConnection;
import User.RequestModel;
import User.UserModel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kebre
 */
public class Admin_DataAccess {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public List<RequestModel> all_requests(){
        
        List<RequestModel> models = new ArrayList<>();
        String sql = "select * from requests";
        con = DbConnection.createConnection();
        
        try {
            pst = con.prepareStatement(sql);
           
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
        }
        return models;
    }
     public int update_date(Date date1,String id){
        
        String query = "update requests set collection_date=?" + " where id=?";
        con = DbConnection.createConnection();
        int s = 0 ;
        //System.out.println(model.getFilename());
        try {
            pst = con.prepareStatement(query);
            
            pst.setDate(1, date1);
            pst.setString(2, id);
            
            s = pst.executeUpdate();
        } catch (Exception e) {
            //System.out.println("error");
            e.printStackTrace();
        }
        return s;
    }
    public List<UserModel> getEmail(String username){
         
        List<UserModel> details = new ArrayList<>();
        String query = "select * from user_details where Username = ?";
        con = DbConnection.createConnection();
        System.out.println(con);
         try {
             pst = con.prepareStatement(query);
            pst.setString(1, username);
            
            rs = pst.executeQuery();
            //System.out.println(query);
            while(rs.next()){
                
                UserModel model = new UserModel();
                
                model.setEmail(rs.getString("email"));
                details.add(model);
                
            }
         } catch (Exception e) {
            // e.printStackTrace();
             System.out.println("Errpr");
         }
        return details;
     }
    public List<UserModel> getUsers(){
        
       List<UserModel> details = new ArrayList<>();
       String query = "select * from user_details";
        con = DbConnection.createConnection();
        //System.out.println(con);
         try {
             pst = con.prepareStatement(query);
            //pst.setString(1, username);
            
            rs = pst.executeQuery();
            //System.out.println(query);
            while(rs.next()){
                
                UserModel model = new UserModel();
                model.setFname(rs.getString("first_name"));
                model.setLname(rs.getString("last_name"));
                model.setUsername(rs.getString("Username"));
                model.setPhone(rs.getString("phone_number"));
                model.setUser_residence(rs.getString("location"));
                model.setCounty(rs.getString("County"));
                model.setEmail(rs.getString("email"));
                
                details.add(model);
                
            }
         } catch (Exception e) {
            // e.printStackTrace();
             System.out.println("Errpr");
         }
        return details;
    }
    public List<Admin_Model> admin_profile(String username){
        
        List<Admin_Model> profile = new ArrayList<>();
        String sql = "select * from admin where username = ?";
        
        con = DbConnection.createConnection();
        
        try {
            
            pst = con.prepareStatement(sql);
            pst.setString(1, username);
            rs = pst.executeQuery();
            
            while(rs.next()){
                
                //System.out.println("hello");
                
                Admin_Model model = new Admin_Model();
                model.setIdNo(rs.getString("id_no"));
                model.setName(rs.getString("name"));
                model.setUsername(rs.getString("username"));
                model.setPhoneNo(rs.getInt("phone"));
                model.setStaffNo(rs.getString("staff_no"));
                model.setPassword(rs.getString("password"));
                
                profile.add(model);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return profile;
    }
    public boolean register(Admin_Model model){
        
        String sql = "insert into admin(id_no,name,username,phone,staff_no,password,filename)values(?,?,?,?,?,?,?)";
        con = DbConnection.createConnection();
        boolean s = false;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, model.getIdNo());
            pst.setString(2, model.getName());
            pst.setString(3, model.getUsername());
            pst.setInt(4, model.getPhoneNo());
            pst.setString(5, model.getStaffNo());
            pst.setString(6, model.getPassword());
            pst.setString(7, model.getImage());
           
            s = pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }
    
}
