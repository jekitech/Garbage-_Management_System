/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.model;

import java.io.Serializable;

/**
 *
 * @author kebre
 */
public class Admin_Model implements Serializable{
    
    String idNo,name,username,staffNo,password,filename;

    int phoneNo;

    public Admin_Model() {
    }

   public Admin_Model(String idNo, String name, String username, String staffNo, String password, String filename, int phoneNo) {
        this.idNo = idNo;
        this.name = name;
        this.username = username;
        this.staffNo = staffNo;
        this.password = password;
        this.filename = filename;
        this.phoneNo = phoneNo;
    }
    public String getImage() {
        return filename;
    }

    public void setImage(String filename) {
        this.filename = filename;
    }
    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    
    
}
