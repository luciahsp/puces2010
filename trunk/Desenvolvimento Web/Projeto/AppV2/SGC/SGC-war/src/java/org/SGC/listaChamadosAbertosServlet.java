package org.SGC;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class listaChamadosAbertosServlet extends HttpServlet {
    @EJB
    private GerenciadorSBCLocal gerenciadorSBC;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        Usuario user = (Usuario) request.getSession().getAttribute("login");
        List<Chamado>listaChamadosUsuario = gerenciadorSBC.recuperaChamadoAbertos(user);
        List<Chamado>listaChamadosPendentes = gerenciadorSBC.recuperaChamadoAbertos();

        request.setAttribute("listaUsuario", listaChamadosUsuario);
        request.setAttribute("listaTodos", listaChamadosPendentes);

        request.getRequestDispatcher("chamados/chamados.jsp").forward(request, response);
    } 

}
