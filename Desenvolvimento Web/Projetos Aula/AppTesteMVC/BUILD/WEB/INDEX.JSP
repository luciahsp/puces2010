<%-- 
    Document   : index
    Created on : 29/05/2010, 11:21:29
    Author     : usuarios
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><< Aplicação Teste MVC >></title>
    </head>
    <body>
        <h1>Pesquisa de lista de sites!</h1>
        <form action="TesteMVCServlet">
            <h3>Lista de sites de:
            <select name="tipo">
                <option>Noticias</option>
                <option>Componentes</option>
                <option>Teste</option>
            </select>
        </h3>
        <p>
            <input type="submit" value="Resposta">
        </p>
        </form>
    </body>
</html>
