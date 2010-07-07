<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.:: Contatos ::.</title>
    </head>
    <body>
        <h1>Lista de Contatos</h1>

        <table border="1">
            <thead>
                <tr>
                    <th><b>Nome</b></th>
                    <th><b>Telefone</b></th>
                    <th><b>Fax</b></th>
                    <th><b>E-Mail</b></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="contato" items="${lista}">
                <tr>
                    <td>${contato.nome}</td>
                    <td>${contato.telefone}</td>
                    <td>${contato.fax}</td>
                    <td>${contato.email}</td>
                </tr>
                </c:forEach>
            </tbody>
        </table>

    </body>
</html>
