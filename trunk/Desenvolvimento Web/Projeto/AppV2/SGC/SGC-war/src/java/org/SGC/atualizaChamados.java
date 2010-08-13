package org.SGC;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class atualizaChamados extends HttpServlet {

    @EJB
    private GerenciadorSBCLocal gerenciadorSBC;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        boolean alteracao = false;
        Chamado chamado = new Chamado();

        if(request.getParameter("codigo") == null ? "" != null : !request.getParameter("codigo").equals("")) {
          chamado =  gerenciadorSBC.recuperaChamado(Integer.parseInt(request.getParameter("codigo")));
          alteracao = true;
        }

        Arearesponsavel area = gerenciadorSBC.recuperaAreaResponsavel(Integer.parseInt(request.getParameter("listaAreaResp")));
        Problema problema = gerenciadorSBC.recuperaProblema(Integer.parseInt(request.getParameter("problema")));
        LocalDepartamento local = gerenciadorSBC.recuperaLocal(Integer.parseInt(request.getParameter("local")));

        if (alteracao==true){
            Statusatendimento status = gerenciadorSBC.recuperaStatusAtendimento(Integer.parseInt(request.getParameter("listaStatus")));
        }

        Usuario usuario = gerenciadorSBC.recuperaUsuario(Integer.parseInt(request.getParameter("codigoUser")));

        try {
           if(alteracao) {
               gerenciadorSBC.atualizaChamado(chamado);
           } else {
               gerenciadorSBC.insereChamado(chamado);
           }
       } catch (Exception e) {

       }


    }

}
