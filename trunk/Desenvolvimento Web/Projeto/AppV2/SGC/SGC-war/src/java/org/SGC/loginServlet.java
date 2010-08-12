package org.SGC;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginServlet extends HttpServlet {
    @EJB
    private GerenciadorSBCLocal gerenciadorSBC;
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String loginUsuario = request.getParameter("usuario");
        String senhaUsuario = request.getParameter("senha");

        //Buscar o usuário
        Usuario usuario = null;

        try {
            usuario = gerenciadorSBC.recuperaUsuario(loginUsuario);
        }
        catch (Exception e) {
            request.setAttribute("erro", "Login ou senha inválidos !");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }

        //Comparar a senha
        if(usuario.getSenha() == null ? senhaUsuario == null : usuario.getSenha().equals(senhaUsuario)) {
             //Se a senha for válida, continuar, caso contrário exibir mensagem
            request.getSession().setAttribute("login", usuario);
            request.getRequestDispatcher("main.jsp").forward(request, response);
        } else {
            request.setAttribute("erro", "Login ou senha inválidos !");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
