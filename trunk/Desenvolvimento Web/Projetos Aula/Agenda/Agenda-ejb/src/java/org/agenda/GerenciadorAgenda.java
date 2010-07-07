package org.agenda;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class GerenciadorAgenda implements GerenciadorAgendaLocal {

    @PersistenceContext(unitName = "Agenda-ejbPU")
    private EntityManager em;
    
    public List<Pessoa> listarPessoas(){

        Query q = em.createQuery("select p from Pessoa p");
        return q.getResultList();
    }

    public Pessoa recuperaPessoa(int id){
        return em.find(Pessoa.class, id);
    }

    public void insereTelefone(Telefone tel){
        em.persist(tel);
    }
 
}
