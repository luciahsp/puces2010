package org.SGC;

import javax.ejb.Local;
import java.util.List;

/**
 *
 * @author Daniel
 */
@Local
public interface GerenciadorSBCLocal {
    //Usuários
    public List<Usuario> listarUsuarios();
    public List<Usuario> listarUsuarios(String nome);
    public Usuario recuperaUsuario(String nome);
    public Usuario recuperaUsuario(int id);
    public void insereUsuario(Usuario user);
    public void atualizaUsuario(Usuario user);

    //Chamados
    public List<Chamado> listarChamados();
    public List<Chamado> recuperaChamadoAbertos(Usuario user);
    public List<Chamado> recuperaChamadoAbertos();
    public Chamado recuperaChamadoEmAtendimento();
    public Chamado recuperaChamadoFechados();
    public Chamado recuperaChamado(int id);
    public void insereChamado(Chamado chamado);
    public List<Chamado> recuperaChamadoAbertosOperador(Usuario user);
    public List<Chamado> recuperaChamadoAbertosOperadorPendente(Usuario user);
    
    //Ação do Chamado
    public List<Chamadoacao> listarChamadoAcoes(Chamado chamado);

    //Nível de Acesso
    public List<Nivelacesso> listarNiveisDeAcesso();
    public Nivelacesso recuperaNivelAcesso(int id);
    public void insereNivelAcesso(Nivelacesso nivel);

    //Local
    public List<LocalDepartamento> listarLocais();
    public LocalDepartamento recuperaLocal(int id);
    public void insereLocal(Local local);

    //Problemas
    public List<Problema> listarProblemas();
    public Problema recuperaProblema(int id);
    public void insereProblema(Problema problema);

    //Status de Atendimento
    public List<Statusatendimento> listarStatusAtendimento();
    public Statusatendimento recuperaStatusAtendimento(int id);
    public void insereProblema(Statusatendimento statusAtendimento);

    //Unidade
    public List<Unidade> listarUnidades();
    public Unidade recuperaUnidade(int id);
    public void insereUnidade(Unidade unidade);

    //Area Responsável
    public List<Arearesponsavel> listarAreasResponsaveis();
    public Arearesponsavel recuperaAreaResponsavel(int id);
    public void insereAreaResponsavel(Arearesponsavel area);

    public void atualizaChamado(org.SGC.Chamado chamado);

    public void atualizaChamadoAcao(org.SGC.Chamadoacao chamadoacao);

    public void insereChamadoAcao(org.SGC.Chamadoacao chamadoacao);

    //Tipo de Acesso
    public List<Tipoacesso> listarTipoAcessos();
    public Tipoacesso recuperaTipoAcesso(int id);
    public void insereTipoAcesso(Tipoacesso tipo);

    //Historico de Acesso
    public List<Historicoacesso> listarHistoricoAcessos();
    public Historicoacesso recuperaHistoricoAcesso(int id);
    public List<Historicoacesso> recuperaHistoricoAcessoUsuario(Usuario user);
    public void insereHistoricoAcesso(Historicoacesso historico);

}
