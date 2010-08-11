<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> .:: SGC - Sistema de Gerenciamento de Chamados ::. </title>

        <link href="../_styles/StyleMain.css" rel="stylesheet" type="text/css" />
    </head>
    <body>

        <table id="tblTitulo" runat="server" cellspacing="0" cellpadding="0" border="0" style="TABLE-LAYOUT:fixed" align="center">
            <tr>
                <td height="31" width="38"><img src="../_imagens/Barra01_01.gif" border="0" runat="server" id="img1"></td>
                <td height="31" width="100%" background="../_imagens/Barra01_02.gif">
                    <span class="tituloBarra">Ocorrências</span>
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
                            <td  class="textoLR_15B">Chamados Abertos</td>
                            <td align="right"><a href="../home.jsp" class="textoLnkMenu_12B">Voltar</a></td>
                            <td width="20">&nbsp;</td>
                        </tr>
                    </table>

                </td>
            </tr>
            
        </table>

        <!-- INICIO - Ocorrencias Pendentes Por Usuário -->
        <br>
        <table width="95%" align="center" border=1 cellpadding="0" cellspacing="0" bordercolor="#ffffff" bgcolor="#ededed">
            <tr>
                <td height="25" class="textoAZ_12B" valign="middle">
                    <table border="0" cellpadding="0" cellspacing="0">
                        <tr>
                            <td width="5"></td>
                            <td width="100%">
                                <div class="textoAZ_12B">Ocorrências pendentes para este usuário</div>
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

                                    Quantidade de itens encontrados: 2

                                </td>
                            </tr>
                            <tr class="textoCZA_12B" height="20px" id="tdCodigo" runat="server">
                                <td width="10px" ></td>
                                <td>

                                    <!-- Tabela de Resultado -->
                                    <table width="95%" border="1" align="center" cellpadding="0" cellspacing="0"  >
                                        <tr class="textoBR_12B" bgcolor="#6fa5d4">
                                            <td width="100px" height="20px">&nbsp;Nome</td>
                                            <td width="100px">&nbsp;Nome</td>
                                            <td width="100px">&nbsp;Nome</td>
                                            <td width="100px">&nbsp;Status</td>
                                            <td width="100px">&nbsp;Editar</td>
                                            <td width="100px">&nbsp;Visualizar</td>
                                        </tr>

                                        <tr class="textoCZA_12" bgcolor="#ffffff">
                                            <td>&nbsp;Bruno</td>
                                            <td>&nbsp;Bruno</td>
                                            <td>&nbsp;Bruno</td>
                                            <td>&nbsp;Aberto</td>
                                            <td width="100px">&nbsp;<a href="novochamado.jsp" class="textoLnkMenu_12B">Editar</a></td>
                                            <td width="100px">&nbsp;<a href="detalheschamado.jsp" class="textoLnkMenu_12B">Detalhes</a></td>
                                        </tr>
                                        <tr class="textoCZA_12" bgcolor="#ffffff">
                                            <td>&nbsp;Bruno</td>
                                            <td>&nbsp;Bruno</td>
                                            <td>&nbsp;Bruno</td>
                                            <td>&nbsp;Fechado</td>
                                            <td width="100px">&nbsp;<a href="novochamado.jsp" class="textoLnkMenu_12B">Editar</a></td>
                                            <td width="100px">&nbsp;<a href="detalheschamado.jsp" class="textoLnkMenu_12B">Detalhes</a></td>
                                        </tr>
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
        <!-- INICIO - Ocorrencias Pendentes Por Usuário -->

        <!-- INICIO - Ocorrencias Pendentes Por Usuário -->
        <br>
        <table width="95%" align="center" border=1 cellpadding="0" cellspacing="0" bordercolor="#ffffff" bgcolor="#ededed">
            <tr>
                <td height="25" class="textoAZ_12B" valign="middle">
                    <table border="0" cellpadding="0" cellspacing="0">
                        <tr>
                            <td width="5"></td>
                            <td width="100%">
                                <div class="textoAZ_12B">Ocorrências pendentes no sistema</div>
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

                                    Quantidade de itens encontrados: 2

                                </td>
                            </tr>
                            <tr class="textoCZA_12B" height="20px" id="tdCodigo" runat="server">
                                <td width="10px" ></td>
                                <td>

                                    <!-- Tabela de Resultado -->
                                    <table width="95%" border="1" align="center" cellpadding="0" cellspacing="0"  >
                                        <tr class="textoBR_12B" bgcolor="#6fa5d4">
                                            <td width="100px" height="20px">&nbsp;Nome</td>
                                            <td width="100px">&nbsp;Nome</td>
                                            <td width="100px">&nbsp;Nome</td>
                                            <td width="100px">&nbsp;Status</td>
                                            <td width="100px">&nbsp;Editar</td>
                                            <td width="100px">&nbsp;Visualizar</td>
                                        </tr>

                                        <tr class="textoCZA_12" bgcolor="#ffffff">
                                            <td>&nbsp;Bruno</td>
                                            <td>&nbsp;Bruno</td>
                                            <td>&nbsp;Bruno</td>
                                            <td>&nbsp;Aberto</td>
                                            <td width="100px">&nbsp;<a href="novochamado.jsp" class="textoLnkMenu_12B">Editar</a></td>
                                            <td width="100px">&nbsp;<a href="detalheschamado.jsp" class="textoLnkMenu_12B">Detalhes</a></td>
                                        </tr>
                                        <tr class="textoCZA_12" bgcolor="#ffffff">
                                            <td>&nbsp;Bruno</td>
                                            <td>&nbsp;Bruno</td>
                                            <td>&nbsp;Bruno</td>
                                            <td>&nbsp;Fechado</td>
                                            <td width="100px">&nbsp;<a href="novochamado.jsp" class="textoLnkMenu_12B">Editar</a></td>
                                            <td width="100px">&nbsp;<a href="detalheschamado.jsp" class="textoLnkMenu_12B">Detalhes</a></td>
                                        </tr>
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
        <!-- INICIO - Ocorrencias Pendentes Por Usuário -->

    </body>
</html>
