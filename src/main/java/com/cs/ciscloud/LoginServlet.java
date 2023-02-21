/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.cs.ciscloud;

import com.cs.ciscloud.entity.UserDetails;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;
import java.util.List;

/**
 *
 * @author tanaw
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        
       
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        HttpSession session = req.getSession();
        RequestDispatcher dispatcher = null;
        Connection connect = null; 
        //database
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectcloud", "root", "");
            Statement s = connect.createStatement();
            String sql = "SELECT * FROM user where username='"+username+"' and password= '"+password+"'";
            ResultSet rs = s.executeQuery(sql);
            
            if(rs.next()){
            UserService service = new UserService();
            List<UserDetails> list = service.getAllUsers();
            session.setAttribute("name", rs.getString("username"));
            session.setAttribute("role", rs.getString("role"));
            
            session.setAttribute("list",list);
            
            dispatcher = req.getRequestDispatcher("dashboard.jsp");
            
            }else{
                System.out.println("wrong username or password");
                req.setAttribute("status", "failed");
                dispatcher = req.getRequestDispatcher("index.jsp");
            }
            dispatcher.forward(req, res);
            
        } catch (IOException | ClassNotFoundException | SQLException e){
                    System.out.println(e.getMessage()); 
           }
//        finally{
//            try {
//                connect.close();
//            } catch (SQLException ex) {
//                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }

    }


}
