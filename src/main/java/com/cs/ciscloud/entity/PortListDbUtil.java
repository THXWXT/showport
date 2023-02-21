/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cs.ciscloud.entity;

import java.io.IOException;
import java.sql.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tanaw
 */
public class PortListDbUtil {

    public static List<Port> getPortList() throws ClassNotFoundException, SQLException {

        ArrayList<Port> Port = new ArrayList<>();
        try {
        //load the mysql driver
        Class.forName("com.mysql.jdbc.Driver");

        //get the connection
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectcloud", "root", "");

        //Create a statement
        Statement s = connect.createStatement();
        String sql = "SELECT * FROM port";

        //Execute the statement and loop over the result set
        ResultSet rs = s.executeQuery(sql);

        while (rs.next()) {
            int port_id = rs.getInt("port_id");
            int server_id = rs.getInt("server_id");
            int user_id = rs.getInt("user_id");
            String status = rs.getString("status");
            int port_number = rs.getInt("port_number");
            
            Port.add(new Port(port_id, server_id, user_id, status, port_number));
        }
        } catch (ClassNotFoundException | SQLException e){
                    System.out.println(e.getMessage()); 
           }
        

        return Port;
    }
}
