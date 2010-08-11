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
@Table(name = "NIVELACESSO")
@NamedQueries({
    @NamedQuery(name = "Nivelacesso.findAll", query = "SELECT n FROM Nivelacesso n"),
    @NamedQuery(name = "Nivelacesso.findByIdNivelacesso", query = "SELECT n FROM Nivelacesso n WHERE n.idNivelacesso = :idNivelacesso"),
    @NamedQuery(name = "Nivelacesso.findByNome", query = "SELECT n FROM Nivelacesso n WHERE n.nome = :nome"),
    @NamedQuery(name = "Nivelacesso.findByPermiteeditar", query = "SELECT n FROM Nivelacesso n WHERE n.permiteeditar = :permiteeditar")})
public class Nivelacesso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_NIVELACESSO")
    private Integer idNivelacesso;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "PERMITEEDITAR")
    private Short permiteeditar;
    @OneToMany(mappedBy = "idNivelacesso")
    private List<Usuario> usuarioList;

    public Nivelacesso() {
    }

    public Nivelacesso(Integer idNivelacesso) {
        this.idNivelacesso = idNivelacesso;
    }

    public Integer getIdNivelacesso() {
        return idNivelacesso;
    }

    public void setIdNivelacesso(Integer idNivelacesso) {
        this.idNivelacesso = idNivelacesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Short getPermiteeditar() {
        return permiteeditar;
    }

    public void setPermiteeditar(Short permiteeditar) {
        this.permiteeditar = permiteeditar;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNivelacesso != null ? idNivelacesso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nivelacesso)) {
            return false;
        }
        Nivelacesso other = (Nivelacesso) object;
        if ((this.idNivelacesso == null && other.idNivelacesso != null) || (this.idNivelacesso != null && !this.idNivelacesso.equals(other.idNivelacesso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.SGC.Nivelacesso[idNivelacesso=" + idNivelacesso + "]";
    }

}
