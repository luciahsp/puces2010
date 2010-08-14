package org.SGC;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class atualizaChamadoAcao extends HttpServlet {

    @EJB
    private GerenciadorSBCLocal gerenciadorSBC;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        Chamado chamado = new Chamado();
        Chamadoacao chamadoacao = new Chamadoacao();

        //Carrega Chamado
        if(request.getParameter("codigo") == null ? "" != null : !request.getParameter("codigo").equals("")) {
          chamado =  gerenciadorSBC.recuperaChamado(Integer.parseInt(request.getParameter("codigo")));
        }

        Usuario usuarioResp = null;
        if (Integer.parseInt(request.getParameter("userResp")) != 0){
            usuarioResp = gerenciadorSBC.recuperaUsuario(Integer.parseInt(request.getParameter("userResp")));
        }

        Usuario usuario = gerenciadorSBC.recuperaUsuario(Integer.parseInt(request.getParameter("codigoUser")));

        //Carrega Status
        Statusatendimento statusNovo = null;
        statusNovo = gerenciadorSBC.recuperaStatusAtendimento(Integer.parseInt(request.getParameter("status")));

        //Alterando classe ChamadoAcao
        chamadoacao.setIdChamado(chamado);
        chamadoacao.setIdStatusatendimentoanterior(chamado.getIdStatusatendimentoatual());
        chamadoacao.setIdStatusatendimentoatual(statusNovo);
        chamadoacao.setDescricao(request.getParameter("descricao"));
        chamadoacao.setIdUsuario(usuario);
        chamadoacao.setData(new Date());
        chamadoacao.setHora(new Date());

        //Alterando classe CHAMADO
        chamado.setIdStatusatendimentoatual(statusNovo);

        if (Integer.parseInt(request.getParameter("userResp")) != 0){
            chamado.setIdUsuarioResponsavel(usuarioResp);
        }

        if (statusNovo.getFecharatendimento() == 1)
        {
            chamado.setDatafechamento(new Date());
            chamado.setHorafechamento(new Date());
        }
        else
        {
            chamado.setDatafechamento(null);
            chamado.setHorafechamento(null);
        }

        try {

            gerenciadorSBC.insereChamadoAcao(chamadoacao);
            gerenciadorSBC.atualizaChamado(chamado);
        } catch (Exception e) {
            request.setAttribute("erro", "Erro: " + e.toString());
        }

        response.sendRedirect("chamadoAcaoServlet?idChamado=" + chamado.getIdChamado().toString());

    }

}
