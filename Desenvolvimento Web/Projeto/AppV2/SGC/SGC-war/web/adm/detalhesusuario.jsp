
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> .:: SGC - Sistema de Gerenciamento de Chamados ::. </title>

        <link href="../_styles/StyleMain.css" rel="stylesheet" type="text/css" /><title>JSP Page</title>
    </head>
    <body>

        <table id="tblTitulo" runat="server" cellspacing="0" cellpadding="0" border="0" style="TABLE-LAYOUT:fixed" align="center">
            <tr>
                <td height="31" width="38"><img src="../_imagens/Barra01_01.gif" border="0" runat="server" id="img1"></td>
                <td height="31" width="100%" background="../_imagens/Barra01_02.gif">
                    <span class="tituloBarra">Administração</span>
                </td>
                <td height="31" width="5" background="../_imagens/Barra01_02.gif"><img src="../_imagens/Barra01_02.gif" border="0" runat="server" id="img2"></td>
            </tr>
        </table>

        <br>
        <table width="98%" align="center" border=1 cellpadding="0" cellspacing="0" bordercolor="#ffffff" bgcolor="#ededed">

            <tr>
                <td height="30" class="textoLR_15B" valign="middle">

                    <table border="0" cellpadding="0" cellspacing="0" width="100%">
                        <tr>
                            <td width="5"></td>
                            <td  class="textoLR_15B">Detalhes de Usuário</td>
                            <td align="right"><a href="consultarusuarios.jsp" class="textoLnkMenu_12B">Voltar</a></td>
                            <td width="20">&nbsp;</td>
                        </tr>
                    </table>

                </td>
            </tr>

        </table>

        <br>
        <table width="95%" align="center" border=1 cellpadding="0" cellspacing="0" bordercolor="#ffffff" bgcolor="#ededed">
            <tr>
                <td height="25" class="textoAZ_12B" valign="middle">
                    <table border="0" cellpadding="0" cellspacing="0">
                        <tr>
                            <td width="5"></td>
                            <td width="100%">
                                <div class="textoAZ_12B">Dados do Usuário</div>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td>

                    <table border="0" cellpadding="0" cellspacing="0">
                        <tr>
                            <td colspan="3">&nbsp;</td>
                        </tr>
                        <tr class="textoCZA_12B" height="20px" id="tdCodigo" runat="server">
                            <td width="10px" ></td>
                            <td width="80px">Código:</td>
                            <td>blbla</td>
                        </tr>
                        <tr class="textoCZA_12B" height="20px">
                            <td width="10px" ></td>
                            <td width="80px">Login:</td>
                            <td>blbla</td>
                        </tr>
                        <tr class="textoCZA_12B" height="20px">
                            <td width="10px" ></td>
                            <td>Nome:</td>
                            <td>blbla</td>
                        </tr>
                        <tr class="textoCZA_12B" height="20px">
                            <td width="10px" ></td>
                            <td>E-mail:</td>
                            <td>blbla</td>
                        </tr>
                        <tr class="textoCZA_12B" height="20px">
                            <td width="10px" ></td>
                            <td>Status:</td>
                            <td>blbla</td>
                        </tr>
                    </table>

                    <hr width="99%" size="0" class="Branco">

                    <table border="0" cellpadding="0" cellspacing="0" width="100%">
                        <tr class="textoCZA_11B">
                            <td align="right">
                                <input type="button" value="Editar" name="Editar" class="Botao" />
                            </td>
                            <td width="40">&nbsp;</td>
                        </tr>
                        <tr height="10px">
                            <td></td>
                            <td width="40"></td>
                        </tr>
                    </table>

                </td>
            </tr>
        </table>

    </body>
</html>