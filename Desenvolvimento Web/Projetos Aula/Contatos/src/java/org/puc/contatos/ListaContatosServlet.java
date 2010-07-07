package org.puc.contatos;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListaContatosServlet extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        DAO dao = new DAOFactory().criarDAO();

        List<Contato> lista;

        try {
            lista = dao.listContatos();

            request.setAttribute("lista", lista);
            request.getRequestDispatcher("listaContatos.jsp").forward(request, response);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        
    } 

    

}
