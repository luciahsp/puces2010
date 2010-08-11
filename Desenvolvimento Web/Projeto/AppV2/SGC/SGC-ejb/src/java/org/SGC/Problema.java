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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "PROBLEMA")
@NamedQueries({
    @NamedQuery(name = "Problema.findAll", query = "SELECT p FROM Problema p"),
    @NamedQuery(name = "Problema.findByIdProblema", query = "SELECT p FROM Problema p WHERE p.idProblema = :idProblema"),
    @NamedQuery(name = "Problema.findByDescricao", query = "SELECT p FROM Problema p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "Problema.findBySla", query = "SELECT p FROM Problema p WHERE p.sla = :sla")})
public class Problema implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PROBLEMA")
    private Integer idProblema;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "SLA")
    private Integer sla;
    @JoinColumn(name = "ID_AREARESPONSAVEL", referencedColumnName = "ID_AREARESPONSAVEL")
    @ManyToOne
    private Arearesponsavel idArearesponsavel;
    @OneToMany(mappedBy = "idProblema")
    private List<Chamado> chamadoList;

    public Problema() {
    }

    public Problema(Integer idProblema) {
        this.idProblema = idProblema;
    }

    public Integer getIdProblema() {
        return idProblema;
    }

    public void setIdProblema(Integer idProblema) {
        this.idProblema = idProblema;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getSla() {
        return sla;
    }

    public void setSla(Integer sla) {
        this.sla = sla;
    }

    public Arearesponsavel getIdArearesponsavel() {
        return idArearesponsavel;
    }

    public void setIdArearesponsavel(Arearesponsavel idArearesponsavel) {
        this.idArearesponsavel = idArearesponsavel;
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
        hash += (idProblema != null ? idProblema.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Problema)) {
            return false;
        }
        Problema other = (Problema) object;
        if ((this.idProblema == null && other.idProblema != null) || (this.idProblema != null && !this.idProblema.equals(other.idProblema))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.SGC.Problema[idProblema=" + idProblema + "]";
    }

}
