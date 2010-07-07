package org.agenda.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.agenda.GerenciadorAgendaLocal;
import org.agenda.Pessoa;
import org.agenda.Telefone;

public class InsereTelefone extends HttpServlet {

    @EJB
    private GerenciadorAgendaLocal gerenciadorAgenda;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        Telefone tel = new Telefone();
        tel.setNumero(request.getParameter("numero"));
        tel.setDdd(request.getParameter("ddd"));
        tel.setTipo(request.getParameter("tipo"));
        tel.setIdTelefone(Integer.parseInt(request.getParameter("idTel")));

        Integer id = Integer.parseInt((request.getParameter("idPessoa")));
        Pessoa p = gerenciadorAgenda.recuperaPessoa(id);
        tel.setPessoa(p);
        
        gerenciadorAgenda.insereTelefone(tel);

        response.sendRedirect("ExibePessoa?idPessoa"+id);
    }
}
