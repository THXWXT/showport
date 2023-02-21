/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cs.ciscloud.entity;

/**
 *
 * @author tanaw
 */
public class UserDetails {
    private String port_id;
    private String server_id;
    private String user_id;
    private String status;
    private String port_number;
    public String getPort_id(){
        return port_id;
    }
    public void setPort_id(String port_id){
        this.port_id = port_id;
    }
    
    public String getServer_id(){
        return server_id;
    }
    public void setServer_id(String server_id){
        this.server_id = server_id;
    }
    
    public String getUser_id(){
        return user_id;
    }
    public void setUser_id(String user_id){
        this.user_id = user_id;
    }
    
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    
    public String getPort_number(){
        return port_number;
    }
    public void setPort_number(String port_number){
        this.port_number = port_number;
    }
    
}
