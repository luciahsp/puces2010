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

public class chamadoLista extends HttpServlet {

    @EJB
    private GerenciadorSBCLocal gerenciadorSBC;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        Integer idStatus = 0;
        if (request.getParameter("idStatus") != null)
        {
            idStatus = Integer.parseInt(request.getParameter("idStatus"));
        }

        String descricao = "";
        if (request.getParameter("descricao") != null)
        {
            descricao = request.getParameter("descricao");
        }

        //Lista de Chamados
        List<Chamado> listaChamados = null;
        //listaChamados = gerenciadorSBC.listarChamados();
        listaChamados = gerenciadorSBC.listarChamadosConsulta(idStatus, descricao);

        //Lista de Status
        List<Statusatendimento> listaStatus = null;
        listaStatus = gerenciadorSBC.listarStatusAtendimento();

        request.setAttribute("listaChamados", listaChamados);
        request.setAttribute("totalUsuario", listaChamados.size());
        request.setAttribute("listaStatus", listaStatus);
        request.setAttribute("desc", descricao);
        request.setAttribute("idSt", idStatus);

        request.getRequestDispatcher("chamados/consultar.jsp").forward(request, response);

    }

}
