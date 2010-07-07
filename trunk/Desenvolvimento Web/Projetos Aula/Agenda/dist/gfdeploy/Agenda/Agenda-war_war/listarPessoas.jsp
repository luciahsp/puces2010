<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>..:: Agenda ::..</title>
    </head>
    <body>
        <h1>Contatos</h1>
        <hr>
        <table border="1">
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>Idade</th>
                    <th>Empresa</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="pessoa" items="${lista}">
                <tr>
                    <td>${pessoa.nome}</td>
                    <td>${pessoa.idade}</td>
                    <td>${pessoa.empresa}</td>
                    <td><a href="ExibePessoa?idPessoa=${pessoa.idPessoa}">Exibir</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <hr>
        <i>Teste Aplicação 1</i>

    </body>
</html>
