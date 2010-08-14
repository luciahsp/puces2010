/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.SGC;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bruno
 */
public class chamadoConsulta extends HttpServlet {

    @EJB
    private GerenciadorSBCLocal gerenciadorSBC;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        //Lista de Status
        List<Statusatendimento> listaStatus = null;
        listaStatus = gerenciadorSBC.listarStatusAtendimento();

        request.setAttribute("listaStatus", listaStatus);

        request.getRequestDispatcher("chamados/consultar.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String descricao = "";
        Integer idStatus = 0;

        descricao = request.getParameter("descricao");
        idStatus = Integer.parseInt(request.getParameter("status"));

        response.sendRedirect("chamadoLista?idStatus=" + idStatus.toString() + "&descricao=" + descricao);
    }


}
