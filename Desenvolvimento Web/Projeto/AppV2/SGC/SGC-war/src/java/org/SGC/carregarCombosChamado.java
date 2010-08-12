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

        List<Arearesponsavel> listaAreaResp = gerenciadorSBC.listarAreasResponsaveis();

        request.setAttribute("listaAreaResp", listaAreaResp);

        request.getRequestDispatcher("chamados/novochamado.jsp").forward(request, response);
    } 

}
