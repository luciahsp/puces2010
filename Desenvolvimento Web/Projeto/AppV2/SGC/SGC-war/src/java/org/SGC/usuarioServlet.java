package org.SGC;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class usuarioServlet extends HttpServlet {
    @EJB
    private GerenciadorSBCLocal gerenciadorSBC;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        Usuario user = new Usuario();

        //Lista da Area Responsável
        List<Arearesponsavel>listaArea = null;
        listaArea = gerenciadorSBC.listarAreasResponsaveis();

        //Lista da Area Responsável
        List<LocalDepartamento>listaLocal = null;
        listaLocal = gerenciadorSBC.listarLocais();

        //Lista Nível de Acesso
        List<Nivelacesso>listaNivel = null;
        listaNivel = gerenciadorSBC.listarNiveisDeAcesso();

        Integer id = 0;
        if(request.getParameter("idUsuario") != null) {           
             id = Integer.parseInt(request.getParameter("idUsuario"));
             user = gerenciadorSBC.recuperaUsuario(id);
        }

        request.setAttribute("listaArea", listaArea);
        request.setAttribute("listaLocal", listaLocal);
        request.setAttribute("listaNivel", listaNivel);
        request.setAttribute("usuarioEsc", user);

        request.getRequestDispatcher("adm/usuarios.jsp").forward(request, response);
    }
}
