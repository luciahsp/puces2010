<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>..:: Dados Pessoa ::..</title>
    </head>
    <body>
        <h1>Pessoa</h1>
        <hr>
        <p><b>Nome:</b> ${pessoa.nome}</p>
        <p><b>Idade:</b> ${pessoa.idade}</p>
        <p><b>Empresa:</b> ${pessoa.empresa}</p>
        <ul>
            <c:forEach var="tel" items="${pessoa.telefones}">
                <li> <i>${tel.tipo}</i> - (${tel.ddd}) ${tel.numero} </li>
            </c:forEach>
        </ul>
        <hr>
        <form action="InsereTelefone" method="post">
            <input type="hidden" name="idPessoa" value="${pessoa.idPessoa}" />
            ID: <input type="text" name="idTel" value="" /><br>
            Tipo: <input type="text" name="tipo" value="" /><br>
            DDD: <input type="text" name="ddd" value="" /><br>
            NUMERO: <input type="text" name="numero" value="" /><br>
            <input type="submit" value="INSERIR" />
        </form>
        <hr>
        <i>Teste Aplicação 2</i>
    </body>
</html>
