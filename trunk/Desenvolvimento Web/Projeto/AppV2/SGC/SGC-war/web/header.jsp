
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> .:: SGC - Sistema de Gerenciamento de Chamados ::. </title>

        <link href="_styles/StyleMain.css" rel="stylesheet" type="text/css" />

        <script language="javascript">

            var teste = "0";

            function showHideMenu()
            {
                    var fraMain  = window.top.document.getElementById("fraMain");
                    var fraPrinc = window.top.document.getElementById("fraPrincipal");
                var imgLink  = document.getElementById("imgLink");

                    var cols = fraPrinc.getAttribute("cols");

                    if( cols == "250,*" || cols == "27,*" )
                    {
                        if (cols == "27,*")
                        teste = "1";
                            cols = "0,*";
                        }
                    else
                    {
                        if (teste == "0")
                                cols = "250,*";
                            else
                                cols = "27,*";
                        }
                    fraPrinc.cols = cols;

                    var rows = fraMain.getAttribute("rows");
                if( rows == "131,*,31" )
                {
                            rows = "55,*,31";
                            document.getElementById("trMiddle").style.display = "none";
                            imgLink.src = "_imagens/SetaLR-01.jpg";
                        }
                    else
                    {
                            rows = "131,*,31";
                            document.getElementById("trMiddle").style.display = "block";
                            imgLink.src = "_imagens/SetaLR-02.jpg";
                        }
                    fraMain.rows = rows;
            }            

        </script>

    </head>
    <body topmargin="0" leftmargin="0" marginwidth="0" marginheight="0">

        <table width="100%" border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td height="30" valign="top"><img src="_imagens/hrTitulo.gif" width="298" height="30"></td>
                <td width="100%" valign="middle" background="_imagens/Cab01_Fundo.gif"></td>
            </tr>
        </table>
        <table width="100%" border="0" cellpadding="0" cellspacing="0">

            <tr id="trMiddle">
                <td colspan="2" background="_imagens/Cab_03.gif" valign="bottom">
                    <table width="120" border="0" cellpadding="0" cellspacing="0">
                        <tr>
                            <td align="right"></td>
                        </tr>
                    </table>
                </td>
                <td width="545" height="74" align="right" valign="middle" background="_imagens/Cab_02.gif">
                </td>
            </tr>

            <tr>
                <td height="28" colspan="3" valign="top" background="_imagens/Cab_04.gif">
	            <table width="100%" border="0" align="right" cellpadding="0" cellspacing="0">
                        <tr>
                            <td height="20" align="left" valign="middle" class="textoCZA_12B">&nbsp;&nbsp;Usuário: <c:if test="${sessionScope.login != null}"> ${sessionScope.login.nome} </c:if></td>
                            <td height="20" align="left" valign="middle" class="textoCZA_12B"><% out.println("Bem vindo!");%><br></td>
                            <td width="10" valign="top"><img src="_imagens/BarraCZA_01.jpg" width="3" height="23"></td>
                            <td width="63" valign="middle">
                                <a href="javascript:showHideMenu();"><img src="_imagens/SetaLR-02.jpg" width="10" height="10" border="0" id="imgLink" alt="Recolher / Expandir Cabeçalho"></a>
                                &nbsp;<a href="#" class="textoLnkMenu_12B">Sair</a>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>

        </table>

    </body>
</html>
