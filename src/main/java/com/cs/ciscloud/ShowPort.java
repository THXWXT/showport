/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.cs.ciscloud;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 *
 * @author tanaw
 */
public class ShowPort extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        RequestDispatcher dispatcher = null;
        Connection connect = null;
        String username = req.getParameter("server_id");
        //database
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectcloud", "root", "");
            Statement s = connect.createStatement();
            String sql = "select server_id,user_id,status,port_number from port where server_id is not null and status != 'empty';";
            ResultSet portUse = s.executeQuery(sql);
            
            if(portUse.next()){
            System.out.println("show port");
            
            dispatcher = req.getRequestDispatcher("dashboard.jsp");
            
            }else{
                System.out.println("wrong");
                
                
            }
            dispatcher.forward(req, res);
            
        } catch (IOException | ClassNotFoundException | SQLException e){
                    System.out.println(e.getMessage()); 
           }
    }

    

}
