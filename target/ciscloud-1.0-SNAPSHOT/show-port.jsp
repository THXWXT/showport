<%-- 
    Document   : show-port
    Created on : Feb 21, 2023, 5:10:03 AM
    Author     : tanaw
--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>port_id</th>
                    <th>server_id</th>
                    <th>user_id</th>
                    <th>status</th>
                    <th>port_number</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="items" items="${portItem}">
                    <tr>
                        <td><c:out value="${items.port_id}" /></td>
                        
                    </tr>


                </c:forEach>
            </tbody>
        </table>


    </body>
</html>
