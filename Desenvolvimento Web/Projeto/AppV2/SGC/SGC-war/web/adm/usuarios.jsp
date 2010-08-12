<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
                    <span class="tituloBarra">Administração</span>
                </td>
                <td height="31" width="5" background="_imagens/Barra01_02.gif"><img src="_imagens/Barra01_02.gif" border="0" runat="server" id="img2"></td>
            </tr>
        </table>

        <br>
        <table width="98%" align="center" border=1 cellpadding="0" cellspacing="0" bordercolor="#ffffff" bgcolor="#ededed">

            <tr>
                <td height="30" class="textoLR_15B" valign="middle">

                    <table border="0" cellpadding="0" cellspacing="0" width="100%">
                        <tr>
                            <td width="5"></td>
                            <td  class="textoLR_15B">Administração de Usuários</td>
                            <td align="right"><a href="home.jsp" class="textoLnkMenu_12B">Voltar</a></td>
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

                    <form action="" method="post" onsubmit="">

                        <table border="0" cellpadding="0" cellspacing="0">
                            <tr>
                                <td colspan="3">&nbsp;</td>
                            </tr>
                            <tr class="textoCZA_12B" height="20px" id="tdCodigo" runat="server">
                                <td width="10px" ></td>
                                <td width="80px">Código:</td>
                                <td><input type="text" id="codigo" name="codigo" value="" class="imputBR" readonly /></td>
                            </tr>
                            <tr class="textoCZA_12B" height="20px">
                                <td width="10px" ></td>
                                <td width="80px">Login:</td>
                                <td><input type="text" id="login" name="login" value="" class="imputBR" maxlength="10"  /></td>
                            </tr>
                            <tr class="textoCZA_12B" height="20px">
                                <td width="10px" ></td>
                                <td>Nome:</td>
                                <td><input type="text" id="nome" name="nome" value="" class="imputBR" size="50" maxlength="50" /></td>
                            </tr>
                            <tr class="textoCZA_12B" height="20px">
                                <td width="10px" ></td>
                                <td>E-mail:</td>
                                <td><input type="text" id="email" name="email" value="" class="imputBR" size="50" maxlength="100" /></td>
                            </tr>
                            <tr class="textoCZA_12B" height="20px">
                                <td width="10px" ></td>
                                <td>Ramal:</td>
                                <td><input type="text" id="ramal" name="ramal" value="" class="imputBR" maxlength="5" /></td>
                            </tr>

                            <tr class="textoCZA_12B" height="20px">
                                <td width="10px" ></td>
                                <td>Senha:</td>
                                <td><input type="password" id="senha" name="senha" value="" class="imputBR" maxlength="10"  /></td>
                            </tr>

                            <tr class="textoCZA_12B" height="20px">
                                <td width="10px" ></td>
                                <td>Área Responsável:</td>
                                <td>
                                    <select name="area">
                                        <c:forEach var="lista" items="${listaArea}">
                                            <option value="${lista.idArearesponsavel}">${lista.nome}</option>
                                        </c:forEach>
                                    </select>
                                </td>
                            </tr>

                            <tr class="textoCZA_12B" height="20px">
                                <td width="10px" ></td>
                                <td>Local:</td>
                                <td><select name="local">
                                        <option>Pao de Queijo</option>
                                    </select>
                                </td>
                            </tr>

                            <tr class="textoCZA_12B" height="20px">
                                <td width="10px" ></td>
                                <td>Nível de Acesso:</td>
                                <td><select name="acesso">
                                        <option>Pao de Queijo</option>
                                    </select>
                                </td>
                            </tr>
                        </table>

                        <hr width="99%" size="0" class="Branco">

                        <table border="0" cellpadding="0" cellspacing="0" width="100%">
                            <tr class="textoCZA_11B">
                                <td align="right">
                                    <input type="reset" value="Limpar" name="limpar" class="Botao" />&nbsp;&nbsp;
                                    <input type="submit" value="Salvar" name="salvar" class="Botao" />
                                </td>
                                <td width="40">&nbsp;</td>
                            </tr>
                            <tr height="10px">
                                <td></td>
                                <td width="40"></td>
                            </tr>
                        </table>

                    </form>

                </td>
            </tr>
        </table>

    </body>
</html>