<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> .:: SGC - Sistema de Gerenciamento de Chamados ::. </title>

        <link href="_styles/StyleMain.css" rel="stylesheet" type="text/css" />

        <script language="javascript">
            function valida() {
                if (document.getElementById("descricao").value == "") {
                    alert("Preencha a descrição!");
                    return false;
                }
            }
        </script>

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

                    <form action="atualizaChamados" method="post" onsubmit="return valida();">

                        <table border="0" cellpadding="0" cellspacing="0">
                            <tr>
                                <td colspan="3">&nbsp;</td>
                            </tr>
                            <tr class="textoCZA_12B" height="25px" id="tdCodigo" runat="server">
                                <td width="10px" ></td>
                                <td width="150px">Área Responsável:</td>
                                <td>
                                    <input type="hidden" id="codigo" name="codigo" value="${chamado.idChamado}" class="imputBR" readonly />
                                    <select style="width: 250px" id="areaResp" name="areaResp" class="imputBR">
                                        <c:forEach var="listaAreaResp" items="${listaAreaResp}">
                                            <option <c:if test="${listaAreaResp.idArearesponsavel==chamado.idArearesponsavel.idArearesponsavel}">selected</c:if> value="${listaAreaResp.idArearesponsavel}">${listaAreaResp.nome}</option>
                                        </c:forEach>
                                    </select>
                                </td>
                            </tr>
                            <tr class="textoCZA_12B" height="25px">
                                <td></td>
                                <td>Problema:</td>
                                <td>
                                    <select style="width: 250px" id="problema" name="problema" class="imputBR">
                                        <c:forEach var="listaProblemas" items="${listaProblemas}">
                                            <option <c:if test="${listaProblemas.idProblema==chamado.idProblema.idProblema}">selected</c:if> value="${listaProblemas.idProblema}">${listaProblemas.descricao}</option>
                                        </c:forEach>
                                    </select>
                                </td>
                            </tr>
                            <tr class="textoCZA_12B" height="25px">
                                <td></td>
                                <td>Descrição:</td>
                                <td><textarea id="descricao" name="descricao" value="${chamado.descricao}" cols="20" rows="2" style="width: 250px; height: 50px" class="imputBR"></textarea></td>
                            </tr>
                            <tr class="textoCZA_12B" height="25px">
                                <td></td>
                                <td>Local:</td>
                                <td>
                                    <select style="width: 250px" id="local" name="local" class="imputBR">
                                        <c:forEach var="listaLocais" items="${listaLocais}">
                                            <option <c:if test="${listaLocais.idLocal==chamado.idLocal.idLocal}">selected</c:if> value="${listaLocais.idLocal}">${listaLocais.nome}</option>
                                        </c:forEach>
                                    </select>
                                </td>
                            </tr>
                            <c:if test="${id!=0}">
                            <tr class="textoCZA_12B" height="25px">
                                <td></td>
                                <td>Data de Abertura:</td>
                                <td><input type="text" id="dataAbertura" name="dataAbertura" value="${chamado.dataabertura} ${chamado.horaabertura}" class="imputBR"  /></td>
                            </tr>
                            <tr class="textoCZA_12B" height="25px">
                                <td></td>
                                <td>Data de Fechamento:</td>
                                <td><input type="text" id="dataFechamento" name="dataFechamento" value="${chamado.datafechamento} ${chamado.horafechamento}" class="imputBR"  /></td>
                            </tr>
                            </c:if>
                            <tr class="textoCZA_12B" height="25px">
                                <td></td>
                                <td>Operador:</td>
                                <td>
                                    <c:if test="${chamado.idUsuario == null}">
                                        <c:if test="${sessionScope.login != null}">
                                            ${sessionScope.login.nome}
                                        </c:if>
                                        <input type="hidden" id="codigoUser" name="codigoUser" value="${sessionScope.login.idUsuario}" class="imputBR" readonly />
                                    </c:if>
                                    <c:if test="${chamado.idUsuario != null}">
                                        ${chamado.idUsuario.nome}
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
                                    <td>
                                        <select style="width: 250px" id="status" name="status" class="imputBR">
                                            <c:forEach var="listaStatus" items="${listaStatus}">
                                                <option <c:if test="${listaStatus.idStatusatendimento==chamado.idStatusatendimentoatual.idStatusatendimentoatual}">selected</c:if> value="${listaStatus.idStatusatendimento}">${listaStatus.nome}</option>
                                            </c:forEach>
                                        </select>
                                    </td>
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

        <c:if test="${erro != null}">
            <script language="javascript">alert("${erro}"); </script>
        </c:if>

    </body>
</html>