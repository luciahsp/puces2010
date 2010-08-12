package org.SGC;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class carregarCombosChamado extends HttpServlet {

    @EJB
    private GerenciadorSBCLocal gerenciadorSBC;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        Integer idChamado = 0;

        if (request.getParameter("idChamado") != null)
        {
            idChamado = Integer.parseInt(request.getParameter("idChamado"));
        }

        List<Arearesponsavel> listaAreaResp = gerenciadorSBC.listarAreasResponsaveis();
        List<Problema> listaProblemas = gerenciadorSBC.listarProblemas();
        List<LocalDepartamento> listaLocais = gerenciadorSBC.listarLocais();

        request.setAttribute("listaAreaResp", listaAreaResp);
        request.setAttribute("listaProblemas", listaProblemas);
        request.setAttribute("listaLocais", listaLocais);
        request.setAttribute("id", idChamado);

        request.getRequestDispatcher("chamados/novochamado.jsp").forward(request, response);
    } 

}
