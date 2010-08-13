package org.SGC;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class chamadoAcaoServlet extends HttpServlet {

    @EJB
    private GerenciadorSBCLocal gerenciadorSBC;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        Chamado chamado = new Chamado();

        Integer id = 0;
        if (request.getParameter("idChamado") != null)
        {
            id = Integer.parseInt(request.getParameter("idChamado"));
            if (id!=0)
                chamado = gerenciadorSBC.recuperaChamado(id);
        }

        //Lista de Status
        List<Statusatendimento> listaStatus = null;
        listaStatus = gerenciadorSBC.listarStatusAtendimento();

        //Lista de ChamadosAcoes
        List<Chamadoacao> listChamadoAcao = null;
        listChamadoAcao = gerenciadorSBC.listarChamadoAcoes(chamado);

        request.setAttribute("listaStatus", listaStatus);
        request.setAttribute("listaOcorrencias", listChamadoAcao);
        request.setAttribute("id", id);
        request.setAttribute("chamado", chamado);

        request.getRequestDispatcher("chamados/chamadoacao.jsp").forward(request, response);

    } 
}
