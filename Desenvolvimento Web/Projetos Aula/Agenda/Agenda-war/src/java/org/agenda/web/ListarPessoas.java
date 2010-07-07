package org.agenda.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.agenda.GerenciadorAgendaLocal;
import org.agenda.Pessoa;

public class ListarPessoas extends HttpServlet {

    @EJB
    private GerenciadorAgendaLocal gerenciadorAgenda;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        List<Pessoa> lista = gerenciadorAgenda.listarPessoas();
        request.setAttribute("lista", lista);
        request.getRequestDispatcher("listarPessoas.jsp").forward(request, response);
    } 

}
