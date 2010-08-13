package org.SGC;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class GerenciadorSBC implements GerenciadorSBCLocal {
    @PersistenceContext(unitName = "SGC-ejbPU")
    private EntityManager em;
    
    public void insereAreaResponsavel(Arearesponsavel area) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void insereChamado(Chamado chamado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void insereChamadoAcao(Chamado chamado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void insereLocal(Local local) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void insereNivelAcesso(Nivelacesso nivel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void insereProblema(Problema problema) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void insereProblema(Statusatendimento statusAtendimento) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void insereUnidade(Unidade unidade) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void insereUsuario(Usuario user) {
        em.persist(user);
    }

    public void atualizaUsuario(Usuario user) {
        em.merge(user);
    }

    public List<Arearesponsavel> listarAreasResponsaveis() {
         Query q = em.createQuery("SELECT a FROM Arearesponsavel a");
         return q.getResultList();
    }

    public List<Chamadoacao> listarChamadoAcoes(Chamado chamado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Chamado> listarChamados() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<LocalDepartamento> listarLocais() {
         Query q = em.createQuery("SELECT l FROM LocalDepartamento l");
         return q.getResultList();
    }

    public List<Nivelacesso> listarNiveisDeAcesso() {
         Query q = em.createQuery("SELECT n FROM Nivelacesso n");
         return q.getResultList();
    }

    public List<Problema> listarProblemas() {
        Query q = em.createQuery("SELECT p FROM Problema p");
         return q.getResultList();
    }

    public List<Statusatendimento> listarStatusAtendimento() {
        Query q = em.createQuery("SELECT s FROM Statusatendimento s");
         return q.getResultList();
    }

    public List<Unidade> listarUnidades() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Usuario> listarUsuarios() {
         Query q = em.createQuery("SELECT u FROM Usuario u");
         return q.getResultList();
    }

    public Arearesponsavel recuperaAreaResponsavel(int id) {
        Arearesponsavel a = new Arearesponsavel();
        a = (Arearesponsavel) em.createNamedQuery("Arearesponsavel.findByIdArearesponsavel").setParameter("idArearesponsavel", id).getSingleResult();
        return a;
    }

    public Chamado recuperaChamado(int id) {
        Chamado c = new Chamado();
        c = (Chamado)em.createNamedQuery("Chamado.findByIdChamado").setParameter("idChamado", id).getSingleResult();
        return c;
    }

    public List<Chamado> recuperaChamadoAbertos() {
         Query q = em.createQuery("SELECT c FROM Chamado c WHERE DataFechamento IS null");
         return q.getResultList();
    }

    public List<Chamado> recuperaChamadoAbertos(Usuario user) {
         Query q = em.createQuery("SELECT c FROM Chamado c WHERE DataFechamento IS null AND ID_Usuario = " + user.getIdUsuario());
         return q.getResultList();
    }   


    public Chamado recuperaChamadoEmAtendimento() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Chamado recuperaChamadoFechados() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public LocalDepartamento recuperaLocal(int id) {
        LocalDepartamento l = new LocalDepartamento();
        l = (LocalDepartamento) em.createNamedQuery("LocalDepartamento.findByIdLocal").setParameter("idLocal", id).getSingleResult();
        return l;
    }

    public Nivelacesso recuperaNivelAcesso(int id) {
        Nivelacesso n = new Nivelacesso();
        n = (Nivelacesso) em.createNamedQuery("Nivelacesso.findByIdNivelacesso").setParameter("idNivelacesso", id).getSingleResult();
        return n;
    }

    public Local recuperaProblema(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Statusatendimento recuperaStatusAtendimento(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Unidade recuperaUnidade(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Usuario recuperaUsuario(String nome) {
        Usuario u = new Usuario();
        u = (Usuario) em.createNamedQuery("Usuario.findByNome").setParameter("nome", nome).getSingleResult();
        return u;
    }

    public Usuario recuperaUsuario(int id) {
        Usuario u = new Usuario();
        u = (Usuario) em.createNamedQuery("Usuario.findByIdUsuario").setParameter("idUsuario", id).getSingleResult();
        return u;
    }
}
