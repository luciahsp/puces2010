package org.apptestemvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TesteMVCServlet extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        //Parametro enviado no request
        String tipo = request.getParameter("tipo");

        //Chama a class do Model
        ModelListaSites model = new ModelListaSites();
        List<String> lista = model.getSites(tipo);

        //Disponibiliza as informações para a View
        request.setAttribute("lista", lista);

        //Repassa o controle para a página JSP [View]
        request.getRequestDispatcher("resposta.jsp").forward(request, response);
    } 

}
