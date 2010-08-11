/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.SGC;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "STATUSATENDIMENTO")
@NamedQueries({
    @NamedQuery(name = "Statusatendimento.findAll", query = "SELECT s FROM Statusatendimento s"),
    @NamedQuery(name = "Statusatendimento.findByIdStatusatendimento", query = "SELECT s FROM Statusatendimento s WHERE s.idStatusatendimento = :idStatusatendimento"),
    @NamedQuery(name = "Statusatendimento.findByNome", query = "SELECT s FROM Statusatendimento s WHERE s.nome = :nome"),
    @NamedQuery(name = "Statusatendimento.findByFecharatendimento", query = "SELECT s FROM Statusatendimento s WHERE s.fecharatendimento = :fecharatendimento")})
public class Statusatendimento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_STATUSATENDIMENTO")
    private Integer idStatusatendimento;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "FECHARATENDIMENTO")
    private Short fecharatendimento;
    @OneToMany(mappedBy = "idStatusatendimentoatual")
    private List<Chamadoacao> chamadoacaoList;
    @OneToMany(mappedBy = "idStatusatendimentoanterior")
    private List<Chamadoacao> chamadoacaoList1;
    @OneToMany(mappedBy = "idStatusatendimentoatual")
    private List<Chamado> chamadoList;

    public Statusatendimento() {
    }

    public Statusatendimento(Integer idStatusatendimento) {
        this.idStatusatendimento = idStatusatendimento;
    }

    public Integer getIdStatusatendimento() {
        return idStatusatendimento;
    }

    public void setIdStatusatendimento(Integer idStatusatendimento) {
        this.idStatusatendimento = idStatusatendimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Short getFecharatendimento() {
        return fecharatendimento;
    }

    public void setFecharatendimento(Short fecharatendimento) {
        this.fecharatendimento = fecharatendimento;
    }

    public List<Chamadoacao> getChamadoacaoList() {
        return chamadoacaoList;
    }

    public void setChamadoacaoList(List<Chamadoacao> chamadoacaoList) {
        this.chamadoacaoList = chamadoacaoList;
    }

    public List<Chamadoacao> getChamadoacaoList1() {
        return chamadoacaoList1;
    }

    public void setChamadoacaoList1(List<Chamadoacao> chamadoacaoList1) {
        this.chamadoacaoList1 = chamadoacaoList1;
    }

    public List<Chamado> getChamadoList() {
        return chamadoList;
    }

    public void setChamadoList(List<Chamado> chamadoList) {
        this.chamadoList = chamadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idStatusatendimento != null ? idStatusatendimento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Statusatendimento)) {
            return false;
        }
        Statusatendimento other = (Statusatendimento) object;
        if ((this.idStatusatendimento == null && other.idStatusatendimento != null) || (this.idStatusatendimento != null && !this.idStatusatendimento.equals(other.idStatusatendimento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.SGC.Statusatendimento[idStatusatendimento=" + idStatusatendimento + "]";
    }

}
