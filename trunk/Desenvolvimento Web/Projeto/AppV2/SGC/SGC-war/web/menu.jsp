
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> .:: SGC - Sistema de Gerenciamento de Chamados ::. </title>

        <link href="_styles/StyleMain.css" rel="stylesheet" type="text/css" />

        <script language="javascript">

    	function showHideMenu()
	    {
		    if(tdMenu.style.display == 'none')
		    {
			    top.fraPrincipal.cols	 = '250,*';
			    tdMenu.style.display = 'block';
			    document.getElementById("imgButton").src='_imagens/seta_fechamenu.gif';
		    }
		    else
		    {
			    top.fraPrincipal.cols	 = '27,*';
			    tdMenu.style.display = 'none';
			    document.getElementById("imgButton").src='_imagens/seta_fechamenu2.gif';
		    }
	    }
	</script>
    </head>
    <body topmargin="0" leftmargin="0"  scroll="auto" marginwidth="0" marginheight="0">

        <table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#ededed">
            <tr>
                <td height="29" valign="bottom" background="_imagens/Barra_menu01.jpg" id="tblData" style="DISPLAY:block">
                    <div align="right">
                        <img src="_imagens/seta_fechamenu.gif" alt="Recolher/Expandir Menu" width="23" height="21" style="CURSOR:hand" id="imgButton" name="imgButton" onclick="showHideMenu();">
                    </div>
                </td>
            </tr>

            <tr>
                <td id="tdMenu" valign="top" bgcolor="#ededed">
                    
                    <table width="100%" class="accordionHeader">
                        <tr >
                            <td>Ocorrências</td>
                        </tr>
                    </table>
                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                            <td width="12" align="left" height="15px"><img src="_imagens/Seta2.jpg"></td>
                            <td width="491" align="left" height="15px">&nbsp;&nbsp;<a href="chamados/chamados.jsp" target="fraBody" class="textoLnkMenu_12B">Chamados Abertos</a></td>
                        </tr>
                        <tr>
                            <td align="left"><img src="_imagens/Seta2.jpg"></td>
                            <td align="left">&nbsp;&nbsp;<a href="chamados/novochamado.jsp" target="fraBody" class="textoLnkMenu_12B">Abrir Chamado</a></td>
                        </tr>
                        <tr>
                            <td align="left"><img src="_imagens/Seta2.jpg"></td>
                            <td align="left">&nbsp;&nbsp;<a href="chamados/consultar.jsp" target="fraBody" class="textoLnkMenu_12B">Consultar Chamados</a></td>
                        </tr>
                    </table>
                    <br>

                    <table width="100%" class="accordionHeader">
                        <tr >
                            <td>Administração</td>
                        </tr>
                    </table>
                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                            <td width="12" align="left" height="15px"><img src="_imagens/Seta2.jpg"></td>
                            <td width="491" align="left" height="15px">&nbsp;&nbsp;<a href="adm/usuarios.jsp" target="fraBody" class="textoLnkMenu_12B">Cadastrar Usuário</a></td>
                        </tr>
                        <tr>
                            <td align="left"><img src="_imagens/Seta2.jpg"></td>
                            <td align="left">&nbsp;&nbsp;<a href="adm/mural.jsp" target="fraBody" class="textoLnkMenu_12B">Consultar Usuários</a></td>
                        </tr>
                    </table>
                    <br>

                    <table width="100%" class="accordionHeader">
                        <tr >
                            <td>Histórico</td>
                        </tr>
                    </table>
                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                            <td width="12" align="left" height="15px"><img src="_imagens/Seta2.jpg"></td>
                            <td width="491" align="left" height="15px">&nbsp;&nbsp;<a href="historico/autenticacao.jsp" target="fraBody" class="textoLnkMenu_12B">Consultar Autenticações</a></td>
                        </tr>
                        <!--
                        <tr>
                            <td align="left"><img src="_imagens/Seta2.jpg"></td>
                            <td align="left">&nbsp;&nbsp;<a href="historico/atividades.jsp" target="fraBody" class="textoLnkMenu_12B">Consultar Atividades Realizadas</a></td>
                        </tr>
                        -->
                    </table>
                    <br>

                </td>
            </tr>
        </table>

    </body>
</html>
