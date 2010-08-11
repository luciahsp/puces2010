<%-- 
    Document   : index
    Created on : 09/08/2010, 23:17:18
    Author     : Daniel
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema Gerenciador de Chamados</title>
    </head>
    <body>
        <h1>Menu Principal</h1>
        <c:if test="${sessionScope.login == null}">
            <jsp:forward page="login.jsp" />
        </c:if>
    </body>
</html>
