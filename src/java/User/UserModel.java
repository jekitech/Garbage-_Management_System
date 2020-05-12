/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author kebre
 */
public class UserModel implements Serializable{
    
    String username,fname,lname,filename,password,user_residence,phone,email,county;
    Date date;
    int id;
    
    public UserModel(){
        
        username = "";
        fname = "";
        lname = "";
       
        user_residence = "";
       
    }

    public UserModel(String username, String fname, String lname, String filename, String password, String user_residence, String phone, String email, String county) {
        this.username = username;
        this.fname = fname;
        this.lname = lname;
        this.filename = filename;
        this.password = password;
        this.user_residence = user_residence;
        this.phone = phone;
        this.email = email;
        this.county = county;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_residence() {
        return user_residence;
    }

    public void setUser_residence(String user_residence) {
        this.user_residence = user_residence;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
}
