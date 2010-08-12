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
        throw new UnsupportedOperationException("Not supported yet.");
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
         Query q = em.createQuery("SELECT l FROM Local l");
         return q.getResultList();
    }

    public List<Nivelacesso> listarNiveisDeAcesso() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Problema> listarProblemas() {
        Query q = em.createQuery("SELECT p FROM Problema p");
         return q.getResultList();
    }

    public List<Statusatendimento> listarStatusAtendimento() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Unidade> listarUnidades() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Usuario> listarUsuarios() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Unidade recuperaAreaResponsavel(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Chamado recuperaChamado(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Chamado recuperaChamadoAbertos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Chamado recuperaChamadoEmAtendimento() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Chamado recuperaChamadoFechados() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Local recuperaLocal(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Nivelacesso recuperaNivelAcesso(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void persist(Object object) {
        em.persist(object);
    }

    public void persist1(Object object) {
        em.persist(object);
    }

}
