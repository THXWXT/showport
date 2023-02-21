<%-- 
    Document   : manage-docker
    Created on : Nov 26, 2022, 2:34:50 AM
    Author     : SANGSANG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>CIS CLOUD - Backup</title>
    <link rel="stylesheet" href="manage-docker.css" />
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

      <aside class="sidebar">
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
          <a href="./manage-server.jsp" class="menu-item">
            <img src="image/icon-user.svg" />
            <b>Manage User</b>
          </a>
          <a href="./manage-vm.jsp" class="menu-item">
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
        <div class="groupbutton">
          <button type="button" class="btn btn-dark btn-lg">
            Upload image file
          </button>
          <a href="./manage-docker-image_list.jsp">
            <button type="button" class="btn btn-dark btn-lg">Image list</button></a>
          <a href="./manage-docker-container.jsp">
            <button type="button" class="btn btn-dark btn-lg">Container</button></a>
          <a href="./manage-docker-manage.jsp">
            <button type="button" class="btn btn-dark btn-lg">Manage</button>
          </a>
        </div>
        <div class="row my-4">
          <div class="col-xl-12">
            <h3>Upload Image File</h3>
            <div class="row">
              <div class="col input_area">
                
                <h5>Name</h5>
                <input type="text" class="form-control w-25" name="username" placeholder="Docker Image Name" style="height: 40px;">
                <h5><p>Upload File</p></h5>

                <div class="col-xl-12 item_card">
                  <div class="card" style="width: 458px">
                    <div class="card-body text-center">
                      <i class="fa-solid fa-cloud-arrow-up"></i>
                      <p>Select a file or drag and drop here</p>
                      <p class="crad-text">
                        upload Image file from your computer
                      </p>
                      <button type="button" class="btn btn-outline-dark">Select File</button>
                    </div>
                  </div>
                </div>
                <div class="col-xl-12 button-next my-4">
                    <a href="./manage-docker-next.jsp"><button type="button" class="btn btn-dark btn-lg" id="Next" >
                        Next
                        <i class="fa-solid fa-circle-arrow-right"></i>
                      </button></a>
                </div>
              </div>
            </div>
          </div>
        </div>

        
      </main>
    </div>
    <script src="./bootstrap-5.0.2-dist/bootstrap-5.0.2-dist/js/bootstrap.min.js"></script>
    <script>
      const menu_toggle = document.querySelector(".menu-toggle");
      const sidebar = document.querySelector(".sidebar");

      menu_toggle.addEventListener("click", () => {
        menu_toggle.classList.toggle("is-active");
        sidebar.classList.toggle("is-active");
      });

      const BTnext = document.getElementById("Next");
      BTnext.addEventListener("click",()=> {
        
      });
    </script>
  </body>
</html>

