/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.cs.ciscloud;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author tanaw
 */

public class NewServlet extends HttpServlet {

    ServletConfig conf;
    
    public void init(ServletConfig conf){
        
    this.conf=conf;
    System.out.println("creating object.....");
    }
    
    
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException
    {
    System.out.println("Servicing....");
    }
    
    public void destroy()
    {
    System.out.println("going to destroy servlet object");
    }
    
    public ServletConfig getServletConfig(){
        return this.conf;
    }
    
    public String getServletInfo()
    {
        return "this servlet is created by Thanawat";
    }
    

}
