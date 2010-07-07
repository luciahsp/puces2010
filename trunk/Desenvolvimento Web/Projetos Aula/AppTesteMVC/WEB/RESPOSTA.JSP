<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.util.List"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><< Aplicação Teste MVC >></title>
    </head>
    <body>
        <h1>Pesquisa de lista de sites!</h1>

        <h3>Sites indicados:</h3>

        <ul>
            <%

            List<String> lista = (List<String>)request.getAttribute("lista");

            for(String item : lista){%>
                <li><%=item %></li>
                <% }%>
        </ul>
    </body>
</html>
