<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title> .:: SGC - Sistema de Gerenciamento de Chamados ::. </title>

        <link href="_styles/StyleLogin.css" rel="stylesheet" type="text/css" />

        <script language="javascript">
            function valida() {
                if (document.getElementById("usuario").value == "") {
                    alert("Preencha o login do usuário !");
                    return false;
                }
                if (document.getElementById("senha").value == "") {
                    alert("Preencha a senha !");
                    return false;
                }
            }
        </script>
    </head>
    <body class="Main">

        <div id="mainLogin">

            <div id="FormLogin">

                <form action="loginServlet" method="post" onsubmit="return valida();">
                    <p style="width:100%; float:left; margin:2px; margin-top:40px; text-align:center; padding-left:30px;">
                        <div class="LoginLabel">Usuário: </div>
                        <input type="text" id="usuario" name="usuario" value="" class="LoginEdit"  maxlength="15" />
                    </p>

                    <p style="width:100%; float:left; margin:2px; text-align:center; padding-left:30px;">
                        <div class="LoginLabel">Senha: </div>
                        <input type="password" id="senha" name="senha"  value="" class="LoginEdit"  maxlength="15" />
                    </p>

                    <p style="width:100%; float:left; margin-top:20px; text-align:left; padding-left:60px;">
                        <input type="submit" value="Entrar" name="logar" class="Botao" />
                        <input type="reset" value="Limpar" name="limpar" class="Botao" />
                    </p>
                </form>

                <c:if test="${erro != null}">
                    <script language="javascript">alert("${erro}"); </script>
                </c:if>

            </div>

        </div>
    </body>
</html>
