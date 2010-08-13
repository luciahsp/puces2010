
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> .:: SGC - Sistema de Gerenciamento de Chamados ::. </title>

        <link href="_styles/StyleMain.css" rel="stylesheet" type="text/css" />
    </head>
    <body>

        <table id="tblTitulo" runat="server" cellspacing="0" cellpadding="0" border="0" style="TABLE-LAYOUT:fixed" align="center">
            <tr>
                <td height="31" width="38"><img src="_imagens/Barra01_01.gif" border="0" runat="server" id="img1"></td>
                <td height="31" width="100%" background="_imagens/Barra01_02.gif">
                    <span class="tituloBarra">Home</span>
                </td>
                <td height="31" width="5" background="_imagens/Barra01_02.gif"><img src="_imagens/Barra01_02.gif" border="0" runat="server" id="img2"></td>
            </tr>
        </table>

        <br />

        <table border="0" cellpadding="0" cellspacing="0" width="350px" align="right">
            <tr>
                <td>

                    <table width="98%" align="center" border=1 cellpadding="0" cellspacing="0" bordercolor="#ffffff" bgcolor="#ededed">
                        <tr>
                            <td height="25" class="textoAZ_12B" valign="middle">

                                <table border="0" cellpadding="0" cellspacing="0">
                                    <tr>
                                        <td width="5"></td>
                                        <td width="100%">

                                            <table width="100%" border="0" cellpadding="0" cellspacing="0" style="cursor: pointer;">
                                                <tr>
                                                    <td width="5"></td>
                                                    <td><div class="textoLR_12B">Dados do Usuário</div></td>
                                                </tr>
                                            </table>

                                        </td>
                                    </tr>
                                </table>

                            </td>
                        </tr>
                        <tr>
                            <td>

                                <table border="0" cellpadding="0" cellspacing="0" width="100%">
                                    <tr height="10px">
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td align="center">

                                            <table border="0" cellpadding="0" cellspacing="0" align="left">
                                                <tr class="textoCZA_12B" height="20px">
                                                    <td width="10px"></td>
                                                    <td width="100px" align="left">Usuário:</td>
                                                    <td align="left"><c:if test="${sessionScope.login != null}"> ${sessionScope.login.nome} </c:if></td>
                                                </tr>                                                
                                            </table>

                                        </td>
                                    </tr>
                                    <tr height="10px">
                                        <td></td>
                                    </tr>
                                </table>

                            </td>
                        </tr>
                    </table>

                </td>
            </tr>
        </table>

    </body>
</html>
