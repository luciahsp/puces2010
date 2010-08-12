package org.SGC;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.SGC.GerenciadorSBCLocal;
import org.SGC.Usuario;
/**
 *
 * @author Adriano
 */
public class ListarUsuarios extends HttpServlet {
   
    @EJB
    private GerenciadorSBCLocal gerenciadorSBC;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        List<Usuario> lista = gerenciadorSBC.listarUsuarios();
        request.setAttribute("lista", lista);
        request.getRequestDispatcher("consultarusuarios.jsp").forward(request, response);
    } 


}
