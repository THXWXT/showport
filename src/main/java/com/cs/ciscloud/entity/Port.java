/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cs.ciscloud.entity;

/**
 *
 * @author tanaw
 */
class Port {
    int port_id;
    int server_id;
    int user_id;
    String status;
    int port_number;

    public Port(int port_id, int server_id, int user_id, String status, int port_number) {
        this.port_id = port_id;
        this.server_id = server_id;
        this.user_id = user_id;
        this.status = status;
        this.port_number = port_number;
    }

    public int getPort_id() {
        return port_id;
    }

    public void setPort_id(int port_id) {
        this.port_id = port_id;
    }

    public int getServer_id() {
        return server_id;
    }

    public void setServer_id(int server_id) {
        this.server_id = server_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPort_number() {
        return port_number;
    }

    public void setPort_number(int port_number) {
        this.port_number = port_number;
    }
    
    
    
    
}
