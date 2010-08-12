package org.SGC;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class atualizaUsuario extends HttpServlet {
    @EJB
    private GerenciadorSBCLocal gerenciadorSBC;
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       boolean alteracao = false;
       Usuario user = new Usuario();

       if(request.getParameter("codigo") == null ? "" != null : !request.getParameter("codigo").equals("")) {
          user =  gerenciadorSBC.recuperaUsuario(Integer.parseInt(request.getParameter("codigo")));
          alteracao = true;
       }
       
       LocalDepartamento localDep = gerenciadorSBC.recuperaLocal(Integer.parseInt(request.getParameter("local")));
       Arearesponsavel area = gerenciadorSBC.recuperaAreaResponsavel(Integer.parseInt(request.getParameter("area")));
       Nivelacesso nivel = gerenciadorSBC.recuperaNivelAcesso(Integer.parseInt(request.getParameter("acesso")));

       user.setEmail(request.getParameter("email"));
       user.setIdArearesponsavel(area);
       user.setIdLocal(localDep);
       user.setIdNivelacesso(nivel);
       user.setNome(request.getParameter("nome"));
       user.setRamal(request.getParameter("ramal"));
       user.setSenha(request.getParameter("senha"));

       try {
           if(alteracao) {
               gerenciadorSBC.atualizaUsuario(user);
           } else {
               gerenciadorSBC.insereUsuario(user);
           }
       } catch (Exception e) {
           
       }
       
       response.sendRedirect("adm/consultarusuarios.jsp");
    }
}
