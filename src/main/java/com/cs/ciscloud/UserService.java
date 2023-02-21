/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cs.ciscloud;

import java.util.List;
import java.sql.*;

import com.cs.ciscloud.entity.UserDetails;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author tanaw
 */
public class UserService {

    public List<UserDetails> getAllUsers() throws ClassNotFoundException, SQLException {
        
       
        
        List<UserDetails> users = new ArrayList<UserDetails>();
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectcloud", "root", "");
            Statement s = connect.createStatement();
            
            ResultSet rs = s.executeQuery("SELECT * FROM port");
            while(rs.next()){
                UserDetails user = new UserDetails();
                user.setPort_id(rs.getString("port_id"));
                user.setServer_id(rs.getString("server_id"));
                user.setUser_id(rs.getString("user_id"));
                user.setStatus(rs.getString("status"));
                user.setPort_number(rs.getString("port_number"));
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return users;
    }
}
