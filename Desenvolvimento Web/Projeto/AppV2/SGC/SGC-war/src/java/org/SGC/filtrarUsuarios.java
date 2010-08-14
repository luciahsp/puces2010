package org.SGC;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Adriano
 */
public class filtrarUsuarios extends HttpServlet {
   
    @EJB
    private GerenciadorSBCLocal gerenciadorSBC;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String nomePesquisa = "";

        if(request.getParameter("nome") != null);
        {
            nomePesquisa = request.getParameter("nome");

            List<Usuario> lista = null;

            lista = gerenciadorSBC.listarUsuarios();
            request.setAttribute("lista", lista);
            request.setAttribute("Contador",lista.size());
            request.getRequestDispatcher("adm/consultarusuarios.jsp").forward(request, response);
        }
    }
  
}
