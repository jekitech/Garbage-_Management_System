/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.sql.Date;

/**
 *
 * @author kebre
 */
public class RequestModel {
    
    String username,location,description;
    Date date,collection_date;
    int status,id;

    public RequestModel() {
        
        this.username = "";
        this.location = "";
        this.description = "";
    }

    public RequestModel(int status) {
        this.status = status;
    }
    

    public RequestModel(String location, String description) {
        this.location = location;
        this.description = description;
       
        
    }
    

    public RequestModel(String username, String location, String description, Date collection_date,int status) {
        this.username = username;
        this.location = location;
        this.description = description;
        this.collection_date = collection_date;
        this.status = status;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getCollection_date() {
        return collection_date;
    }

    public void setCollection_date(Date collection_date) {
        this.collection_date = collection_date;
    }

   
    
}
