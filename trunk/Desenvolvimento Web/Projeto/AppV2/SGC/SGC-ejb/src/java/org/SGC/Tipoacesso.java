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
@Table(name = "TIPOACESSO")
@NamedQueries({
    @NamedQuery(name = "Tipoacesso.findAll", query = "SELECT t FROM Tipoacesso t"),
    @NamedQuery(name = "Tipoacesso.findByIdTipoacesso", query = "SELECT t FROM Tipoacesso t WHERE t.idTipoacesso = :idTipoacesso"),
    @NamedQuery(name = "Tipoacesso.findByDescricao", query = "SELECT t FROM Tipoacesso t WHERE t.descricao = :descricao"),
    @NamedQuery(name = "Tipoacesso.findByNome", query = "SELECT t FROM Tipoacesso t WHERE t.nome = :nome")})
public class Tipoacesso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_TIPOACESSO")
    private Integer idTipoacesso;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "NOME")
    private String nome;
    @OneToMany(mappedBy = "idTipoacesso")
    private List<Historicoacesso> historicoacessoList;

    public Tipoacesso() {
    }

    public Tipoacesso(Integer idTipoacesso) {
        this.idTipoacesso = idTipoacesso;
    }

    public Integer getIdTipoacesso() {
        return idTipoacesso;
    }

    public void setIdTipoacesso(Integer idTipoacesso) {
        this.idTipoacesso = idTipoacesso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Historicoacesso> getHistoricoacessoList() {
        return historicoacessoList;
    }

    public void setHistoricoacessoList(List<Historicoacesso> historicoacessoList) {
        this.historicoacessoList = historicoacessoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoacesso != null ? idTipoacesso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoacesso)) {
            return false;
        }
        Tipoacesso other = (Tipoacesso) object;
        if ((this.idTipoacesso == null && other.idTipoacesso != null) || (this.idTipoacesso != null && !this.idTipoacesso.equals(other.idTipoacesso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.SGC.Tipoacesso[idTipoacesso=" + idTipoacesso + "]";
    }

}
