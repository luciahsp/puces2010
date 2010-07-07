
package org.contadores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContadorServlet extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        if (request.getAttribute("count") == null){
            request.setAttribute("count", new Contador("Request"));
        }
        if (request.getSession().getAttribute("count") == null){
            request.getSession().setAttribute("count", new Contador("Session"));
        }
        if (getServletContext().getAttribute("count") == null){
            getServletContext().setAttribute("count", new Contador("Context"));
        }

        ((Contador)request.getAttribute("count")).Contar();
        ((Contador)request.getSession().getAttribute("count")).Contar();
        ((Contador)getServletContext().getAttribute("count")).Contar();

        request.getRequestDispatcher("count.jsp").forward(request, response);

    } 

}
