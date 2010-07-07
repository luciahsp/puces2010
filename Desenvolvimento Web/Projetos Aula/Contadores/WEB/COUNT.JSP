<%-- 
    Document   : count
    Created on : 29/05/2010, 15:40:36
    Author     : usuarios
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Verifica Session</h1>

        <h1>${requestScope.count}</h1>
        <h1>${sessionScope.count}</h1>
        <h1>${applicationScope.count}</h1>

        <br>
        <p>Attribute: <%= request.getAttribute("count") %></p>
        <p>Session: <%= request.getSession().getAttribute("count") %></p>
        <p>Context: <%= getServletContext().getAttribute("count") %></p>
    </body>
</html>
