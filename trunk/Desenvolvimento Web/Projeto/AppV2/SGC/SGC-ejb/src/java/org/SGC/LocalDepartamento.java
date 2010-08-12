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
@Table(name = "LOCAL")
@NamedQueries({
    @NamedQuery(name = "LocalDepartamento.findAll", query = "SELECT l FROM LocalDepartamento l"),
    @NamedQuery(name = "LocalDepartamento.findByIdLocal", query = "SELECT l FROM LocalDepartamento l WHERE l.idLocal = :idLocal"),
    @NamedQuery(name = "LocalDepartamento.findByNome", query = "SELECT l FROM LocalDepartamento l WHERE l.nome = :nome")})
public class LocalDepartamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_LOCAL")
    private Integer idLocal;
    @Column(name = "NOME")
    private String nome;
    @OneToMany(mappedBy = "idLocal")
    private List<Usuario> usuarioList;
    @OneToMany(mappedBy = "idLocal")
    private List<Chamado> chamadoList;

    public LocalDepartamento() {
    }

    public LocalDepartamento(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        hash += (idLocal != null ? idLocal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LocalDepartamento)) {
            return false;
        }
        LocalDepartamento other = (LocalDepartamento) object;
        if ((this.idLocal == null && other.idLocal != null) || (this.idLocal != null && !this.idLocal.equals(other.idLocal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.SGC.LocalDepartamento[idLocal=" + idLocal + "]";
    }

}
