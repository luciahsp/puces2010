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
                            <td  class="textoLR_15B">Consultar Chamados</td>
                            <td align="right"><a href="home.jsp" class="textoLnkMenu_12B">Voltar</a></td>
                            <td width="20">&nbsp;</td>
                        </tr>
                    </table>

                </td>
            </tr>

        </table>

        <!-- INICIO - Critérios de Pesquisa -->
        <br>
        <table width="95%" align="center" border=1 cellpadding="0" cellspacing="0" bordercolor="#ffffff" bgcolor="#ededed">
            <tr>
                <td height="25" class="textoAZ_12B" valign="middle">
                    <table border="0" cellpadding="0" cellspacing="0">
                        <tr>
                            <td width="5"></td>
                            <td width="100%">
                                <div class="textoAZ_12B">Critérios para Pesquisa</div>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td>

                    <form action="chamadoConsulta" method="post" onsubmit="">

                        <table border="0" cellpadding="0" cellspacing="0">
                            <tr>
                                <td colspan="3">&nbsp;</td>
                            </tr>
                            <tr class="textoCZA_12B" height="25px" id="tdCodigo" runat="server">
                                <td width="10px" ></td>
                                <td width="150px">Descrição:</td>
                                <td>
                                    <input type="text" id="descricao" name="descricao" class="imputBR" size="50" maxlength="50" />
                                </td>
                            </tr>
                            <tr class="textoCZA_12B" height="25px">
                                <td></td>
                                <td>Status:</td>
                                <td>
                                    <select style="width: 250px" id="status" name="status" class="imputBR">
                                        <option value="0"> -- Selecione -- </option>
                                        <c:forEach var="listaStatus" items="${listaStatus}">
                                            <option value="${listaStatus.idStatusatendimento}">${listaStatus.nome}</option>
                                        </c:forEach>
                                    </select>
                                </td>
                            </tr>

                        </table>

                        <hr width="99%" size="0" class="Branco">

                        <table border="0" cellpadding="0" cellspacing="0" width="100%">
                            <tr class="textoCZA_11B">
                                <td align="right">
                                    <input type="reset" value="Limpar" name="limpar" class="Botao" />&nbsp;&nbsp;
                                    <input type="submit" value="Consultar" name="Consultar" class="Botao" />
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
        <!-- FIM - Critérios de Pesquisa -->

        <c:if test="${totalUsuario != null}">

        <!-- INICIO - Resultado Pesquisa -->
        <br>
        <table width="95%" align="center" border=1 cellpadding="0" cellspacing="0" bordercolor="#ffffff" bgcolor="#ededed">
            <tr>
                <td height="25" class="textoAZ_12B" valign="middle">
                    <table border="0" cellpadding="0" cellspacing="0">
                        <tr>
                            <td width="5"></td>
                            <td width="100%">
                                <div class="textoAZ_12B">Resultado da Pesquisa</div>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td>

                    <table border="0" cellpadding="0" cellspacing="0">
                            <tr>
                                <td colspan="2">&nbsp;</td>
                            </tr>
                            <tr class="textoCZA_12B" height="20px" id="tdCodigo" runat="server">
                                <td width="10px" ></td>
                                <td>

                                    Quantidade de itens encontrados: ${totalUsuario}

                                </td>
                            </tr>
                            <tr class="textoCZA_12B" height="20px" id="tdCodigo" runat="server">
                                <td width="10px" ></td>
                                <td>

                                    <!-- Tabela de Resultado -->
                                    <table width="95%" border="1" align="center" cellpadding="0" cellspacing="0"  >
                                        <tr class="textoBR_12B" bgcolor="#6fa5d4">
                                            <td width="100px" height="20px">Nome</td>
                                            <td width="100px">Departamento</td>
                                            <td width="100px">Área Responsável</td>
                                            <td width="100px">Usuário Responsável pelo Chamado</td>
                                            <td width="100px">Problema</td>
                                            <td width="100px">Descrição</td>
                                            <td width="100px">Data Abertura</td>
                                            <td width="100px">Status</td>
                                            <td width="100px">Editar</td>
                                        </tr>

                                        <c:forEach var="lista" items="${listaChamados}">
                                             <tr class="textoCZA_12" bgcolor="#ffffff">
                                                <td>${lista.idUsuario.nome}</td>
                                                <td>${lista.idLocal.nome}</td>
                                                <td>${lista.idArearesponsavel.nome}</td>
                                                <td>${lista.idUsuarioResponsavel.nome}</td>
                                                <td>${lista.idProblema.descricao}</td>
                                                <td>${lista.descricao}</td>
                                                <td><f:formatDate pattern="dd/MM/yyyy" value="${lista.dataabertura}" /></td>
                                                <td>${lista.idStatusatendimentoatual.nome}</td>
                                                <td width="100px">&nbsp;<a href="chamadoAcaoServlet?idChamado=${lista.idChamado}" class="textoLnkMenu_12B">Editar</a></td>
                                            </tr>
                                        </c:forEach>

                                        </table>


                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">&nbsp;</td>
                            </tr>
                    </table>

                </td>
            </tr>
        </table>
        <!-- FIM - Resultado Pesquisa -->
        </c:if>

    </body>
</html>
