<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="page-enter" content="blendtrans(duration=1.0, transition=8)" />
        <title> .:: SGC - Sistema de Gerenciamento de Chamados ::. </title>

        <link href="_styles/StyleLogin.css" rel="stylesheet" type="text/css" />

    </head>
    <body class="Main">

        <div id="mainLogin">

            <div id="FormLogin">

                <form action="">
                    <p style="width:100%; float:left; margin:2px; margin-top:40px; text-align:center; padding-left:30px;">
                        <div class="LoginLabel">Usuário: </div>
                        <input type="text" name="usuario" value="" class="LoginEdit" >
                    </p>

                    <p style="width:100%; float:left; margin:2px; text-align:center; padding-left:30px;">
                        <div class="LoginLabel">Senha: </div>
                        <input type="password" name="senha"  value="" class="LoginEdit" >
                    </p>

                    <p style="width:100%; float:left; margin-top:20px; text-align:left; padding-left:60px;">
                        <input type="submit" value="Entrar" class="Botao">
                        <input type="reset" value="Limpar" class="Botao">
                    </p>
                </form>

            </div>

        </div>
    </body>
</html>
