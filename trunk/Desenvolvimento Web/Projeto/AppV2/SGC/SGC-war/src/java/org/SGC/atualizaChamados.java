package org.SGC;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
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

        Arearesponsavel area = gerenciadorSBC.recuperaAreaResponsavel(Integer.parseInt(request.getParameter("areaResp")));
        Problema problema = gerenciadorSBC.recuperaProblema(Integer.parseInt(request.getParameter("problema")));
        LocalDepartamento local = gerenciadorSBC.recuperaLocal(Integer.parseInt(request.getParameter("local")));

        Statusatendimento status = new Statusatendimento(1);
        if (alteracao==true){
            status = gerenciadorSBC.recuperaStatusAtendimento(Integer.parseInt(request.getParameter("status")));
        }

        Usuario usuarioResp = null;
        if (Integer.parseInt(request.getParameter("userResp")) != 0){
            usuarioResp = gerenciadorSBC.recuperaUsuario(Integer.parseInt(request.getParameter("userResp")));
        }

        Usuario usuario = gerenciadorSBC.recuperaUsuario(Integer.parseInt(request.getParameter("codigoUser")));

        chamado.setIdUsuario(usuario);
        chamado.setIdArearesponsavel(area);
        chamado.setIdProblema(problema);
        chamado.setIdLocal(local);
        chamado.setIdStatusatendimentoatual(status);
        chamado.setDescricao(request.getParameter("descricao"));
        chamado.setDataabertura(new Date());
        chamado.setHoraabertura(new Date());

        if (Integer.parseInt(request.getParameter("userResp")) != 0){
            chamado.setIdUsuarioResponsavel(usuarioResp);
        }

        try {
           if(alteracao) {
               gerenciadorSBC.atualizaChamado(chamado);
           } else {
               gerenciadorSBC.insereChamado(chamado);
           }
       } catch (Exception e) {
           request.setAttribute("erro", "Erro: " + e.toString());
       }

       response.sendRedirect("chamadoAcaoServlet?idChamado=" + chamado.getIdChamado().toString());


    }

}
