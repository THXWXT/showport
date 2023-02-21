/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.cs.ciscloud.entity;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ToShowPortList extends HttpServlet {

    
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        try {
            //get the data from the database(model)
            List<Port> portItem = PortListDbUtil.getPortList();
            req.setAttribute("portItem", portItem);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } 
       
       // redirect to a different page(View)
       RequestDispatcher dispatcher = req.getRequestDispatcher("show-port.jsp");
       dispatcher.forward(req, res);
        
        }
    }

    


