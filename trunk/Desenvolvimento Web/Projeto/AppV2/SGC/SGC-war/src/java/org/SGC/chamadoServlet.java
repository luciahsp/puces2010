package org.SGC;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class chamadoServlet extends HttpServlet {
   
    @EJB
    private GerenciadorSBCLocal gerenciadorSBC;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        Chamado chamado = new Chamado();

        //Lista da Area Responsável
        List<Arearesponsavel> listaArea = null;
        listaArea = gerenciadorSBC.listarAreasResponsaveis();

        //Lista de Problemas
        List<Problema> listaProblemas = null;
        listaProblemas = gerenciadorSBC.listarProblemas();

        //Lista de Locais
        List<LocalDepartamento> listaLocais = null;
        listaLocais = gerenciadorSBC.listarLocais();

        //Lista de Status
        List<Statusatendimento> listaStatus = null;
        listaStatus = gerenciadorSBC.listarStatusAtendimento();

        Integer id = 0;
        if (request.getParameter("idChamado") != null)
        {
            id = Integer.parseInt(request.getParameter("idChamado"));
            if (id!=0)
                chamado = gerenciadorSBC.recuperaChamado(id);
        }

        request.setAttribute("listaAreaResp", listaArea);
        request.setAttribute("listaProblemas", listaProblemas);
        request.setAttribute("listaLocais", listaLocais);
        request.setAttribute("listaStatus", listaStatus);
        request.setAttribute("id", id);
        request.setAttribute("chamado", chamado);

        request.getRequestDispatcher("chamados/novochamado.jsp").forward(request, response);
    }

}
