
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> .:: SGC - Sistema de Gerenciamento de Chamados ::. </title>
    </head>
    <frameset rows="131,*,31" border=0 id="fraMain">
        <frame name="fraHeader" scrolling="no" noresize src="header.jsp">
        <frameset cols="250,*" id="fraPrincipal">
            <frame name="fraMenu" src="menu.jsp">
            <frame name="fraBody" src="home.jsp">
        </frameset>
        <frame name="fraFooter" scrolling="no" noresize src="footer.jsp">
        <noframes>
        <p>This page requires frames, but your browser does not support them.</p>
        </noframes>
    </frameset>
</html>
