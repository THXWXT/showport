<%-- 
    Document   : manage-vm
    Created on : Nov 26, 2022, 3:02:30 AM
    Author     : SANGSANG
--%>

<%@page import="com.cs.ciscloud.entity.UserDetails"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>CIS CLOUD - Main</title>
    <link rel="stylesheet" href="manage-vm.css" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
      crossorigin="anonymous"
    />
    <script
      src="https://kit.fontawesome.com/f1990b5319.js"
      crossorigin="anonymous"
    ></script>
  </head>
  <body>
      <%
            if (session.getAttribute("name") == null) {
                response.sendRedirect("index.jsp");
            }

        %>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
      <img src="image/logo.svg" class="img-logo" alt="" />
      <div class="title_Dashboard">
        <h2></h2>
      </div>
    </nav>

    <div class="app">
      <div class="menu-toggle">
        <div class="hamburger">
          <span></span>
        </div>
      </div>

      <aside class="sidebar" id="Sidebar">
        <div class="Profile_User">
          <div class="profile">
            <div class="profile_details">
              <img src="image/member-6 1.svg" />
              <div class="name_job">
                <div class="name"><b><%=session.getAttribute("name")%></b></div>
                                <div class="job"><%=session.getAttribute("role")%></div>
              </div>
            </div>
            <i class="fa-solid fa-ellipsis" id="setting"></i>
          </div>
        </div>

        <nav class="menu">
          <a href="./dashboard.jsp" class="menu-item">
            <img src="image/icon-dashboard.svg" />
            <b>Dashboard</b>
          </a>
          <a href="./manage-docker.jsp" class="menu-item" id="VS">
            <img src="image/icon-virtual server1.svg" />
            <b>Manage Docker</b>
          </a>
          <a href="./manage-server.jsp" class="menu-item">
            <img src="image/icon-container server.svg" />
            <b>Manage Server</b>
          </a>
          <a href="./manage-user.jsp" class="menu-item">
            <img src="image/icon-user.svg" />
            <b>Manage User</b>
          </a>
          <a href="#" class="menu-item">
            <img src="image/icon-user.svg" />
            <b>Manage VM</b>
          </a>
          <a href="./backup.jsp" class="menu-item">
            <img src="image/icon-user.svg" />
            <b>Backups</b>
          </a>

          
            <a class="menu-item" href="Logout">
                        <img src="image/icon-profile.svg" />
                        <b>Logout</b>
                    </a>
        </nav>
      </aside>

      <main class="content">
        <h1>Manage VM</h1>
        <table class="table table-secondary">
                                    <thead>
                                        <tr>
                                            <th scope="col" style="text-align: center">Port ID</th>
                                            <th scope="col" style="text-align: center">Server ID</th>
                                            <th scope="col" style="text-align: center">User ID</th>
                                            <th scope="col" style="text-align: center">Status</th>
                                            <th scope="col" style="text-align: center">Port Number</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%
                                        List<UserDetails> users = (List<UserDetails>)session.getAttribute("list");
                                        for(UserDetails user : users){    
                                        %>
                                        <tr>
                                            <td><%=user.getPort_id() %></td>
                                            <td><%=user.getServer_id() %></td>
                                            <td><%=user.getUser_id() %></td>
                                            <td><%=user.getStatus() %></td>
                                            <td><%=user.getPort_number() %></td>
                                        </tr>
                                        <% } %>
                                    </tbody>

                                </table>


      </main>
    </div>
    <script src="./bootstrap-5.0.2-dist/bootstrap-5.0.2-dist/js/bootstrap.min.js"></script>
    <script>
      const menu_toggle = document.querySelector(".menu-toggle");
      const sidebar = document.querySelector(".sidebar");
      // const Virtual = document.getElementById("VS");
      
      

      // Virtual.addEventListener("click",()=>{
      //   Virtual.classList.toggle("is-active");
      // });
      

      menu_toggle.addEventListener("click", () => {
        menu_toggle.classList.toggle("is-active");
        sidebar.classList.toggle("is-active");
      });
    </script>
  </body>
</html>

