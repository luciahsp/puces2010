<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
                    <span class="tituloBarra">Ocorrências</span>
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
                            <td  class="textoLR_15B">Administração de Chamados</td>
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
                                <div class="textoAZ_12B">Dados do Chamado</div>
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
                            <tr class="textoCZA_12B" height="25px" id="tdCodigo" runat="server">
                                <td width="10px" ></td>
                                <td width="150px">Área Responsável:</td>
                                <td>

                                    <select style="width: 250px" id="Select1" class="imputBR">
                                        <c:forEach var="listaAreaResp" items="${listaAreaResp}">
                                            <option id="${listaAreaResp.idArearesponsavel}">${listaAreaResp.nome}</option>
                                        </c:forEach>
                                    </select>
                                </td>
                            </tr>
                            <tr class="textoCZA_12B" height="25px">
                                <td></td>
                                <td>Problema:</td>
                                <td>
                                    <select style="width: 250px" id="Select1" class="imputBR">
                                        <c:forEach var="listaProblemas" items="${listaProblemas}">
                                            <option id="${listaProblemas.idProblema}">${listaProblemas.descricao}</option>
                                        </c:forEach>
                                    </select>
                                </td>
                            </tr>
                            <tr class="textoCZA_12B" height="25px">
                                <td></td>
                                <td>Descrição:</td>
                                <td><textarea id="TextArea1" cols="20" rows="2" style="width: 250px; height: 50px" class="imputBR"></textarea></td>
                            </tr>
                            <tr class="textoCZA_12B" height="25px">
                                <td></td>
                                <td>Local:</td>
                                <td>
                                    <select style="width: 250px" id="Select1" class="imputBR">
                                        <c:forEach var="listaLocais" items="${listaLocais}">
                                            <option id="${listaLocais.idLocal}">${listaLocais.nome}</option>
                                        </c:forEach>
                                    </select>
                                </td>
                            </tr>
                            <c:if test="${id!=0}">
                            <tr class="textoCZA_12B" height="25px">
                                <td></td>
                                <td>Data de Abertura:</td>
                                <td><input type="text" id="" name="" value="" class="imputBR"  /></td>
                            </tr>
                            <tr class="textoCZA_12B" height="25px">
                                <td></td>
                                <td>Data de Fechamento:</td>
                                <td><input type="text" id="" name="" value="" class="imputBR"  /></td>
                            </tr>
                            </c:if>
                            <tr class="textoCZA_12B" height="25px">
                                <td></td>
                                <td>Operador:</td>
                                <td>
                                    <c:if test="${sessionScope.login != null}">
                                        ${sessionScope.login.nome}
                                    </c:if>
                                </td>
                            </tr>
                            <tr class="textoCZA_12B" height="25px">
                                <td></td>
                                <td>Status:</td>
                                <c:if test="${id==0}">
                                    <td>Aguardando atendimento</td>
                                </c:if>
                                <c:if test="${id!=0}">
                                    <td><input type="text" id="" name="" value="" class="imputBR"  /></td>
                                </c:if>
                            </tr>

                        </table>

                        <hr width="99%" size="0" class="Branco">

                        <table border="0" cellpadding="0" cellspacing="0" width="100%">
                            <tr class="textoCZA_11B">
                                <td align="right">
                                    <input type="reset" value="Limpar" name="limpar" class="Botao" />&nbsp;&nbsp;
                                    <input type="submit" value="Salvar" name="Salvar" class="Botao" />
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
