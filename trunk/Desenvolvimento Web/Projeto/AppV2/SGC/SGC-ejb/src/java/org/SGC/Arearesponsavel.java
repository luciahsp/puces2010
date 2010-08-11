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
@Table(name = "AREARESPONSAVEL")
@NamedQueries({
    @NamedQuery(name = "Arearesponsavel.findAll", query = "SELECT a FROM Arearesponsavel a"),
    @NamedQuery(name = "Arearesponsavel.findByIdArearesponsavel", query = "SELECT a FROM Arearesponsavel a WHERE a.idArearesponsavel = :idArearesponsavel"),
    @NamedQuery(name = "Arearesponsavel.findByNome", query = "SELECT a FROM Arearesponsavel a WHERE a.nome = :nome")})
public class Arearesponsavel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_AREARESPONSAVEL")
    private Integer idArearesponsavel;
    @Column(name = "NOME")
    private String nome;
    @OneToMany(mappedBy = "idArearesponsavel")
    private List<Problema> problemaList;
    @OneToMany(mappedBy = "idArearesponsavel")
    private List<Usuario> usuarioList;
    @OneToMany(mappedBy = "idArearesponsavel")
    private List<Chamado> chamadoList;

    public Arearesponsavel() {
    }

    public Arearesponsavel(Integer idArearesponsavel) {
        this.idArearesponsavel = idArearesponsavel;
    }

    public Integer getIdArearesponsavel() {
        return idArearesponsavel;
    }

    public void setIdArearesponsavel(Integer idArearesponsavel) {
        this.idArearesponsavel = idArearesponsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Problema> getProblemaList() {
        return problemaList;
    }

    public void setProblemaList(List<Problema> problemaList) {
        this.problemaList = problemaList;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
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
        hash += (idArearesponsavel != null ? idArearesponsavel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arearesponsavel)) {
            return false;
        }
        Arearesponsavel other = (Arearesponsavel) object;
        if ((this.idArearesponsavel == null && other.idArearesponsavel != null) || (this.idArearesponsavel != null && !this.idArearesponsavel.equals(other.idArearesponsavel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.SGC.Arearesponsavel[idArearesponsavel=" + idArearesponsavel + "]";
    }

}
