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
@Table(name = "USUARIO")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario"),
    @NamedQuery(name = "Usuario.findByNome", query = "SELECT u FROM Usuario u WHERE u.nome = :nome"),
    @NamedQuery(name = "Usuario.findByRamal", query = "SELECT u FROM Usuario u WHERE u.ramal = :ramal"),
    @NamedQuery(name = "Usuario.findBySenha", query = "SELECT u FROM Usuario u WHERE u.senha = :senha"),
    @NamedQuery(name = "Usuario.findByEmail", query = "SELECT u FROM Usuario u WHERE u.email = :email")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_USUARIO")
    private Integer idUsuario;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "RAMAL")
    private String ramal;
    @Column(name = "SENHA")
    private String senha;
    @Column(name = "EMAIL")
    private String email;
    @JoinColumn(name = "ID_AREARESPONSAVEL", referencedColumnName = "ID_AREARESPONSAVEL")
    @ManyToOne
    private Arearesponsavel idArearesponsavel;
    @JoinColumn(name = "ID_LOCAL", referencedColumnName = "ID_LOCAL")
    @ManyToOne
    private LocalDepartamento idLocal;
    @JoinColumn(name = "ID_NIVELACESSO", referencedColumnName = "ID_NIVELACESSO")
    @ManyToOne
    private Nivelacesso idNivelacesso;
    @OneToMany(mappedBy = "idUsuario")
    private List<Chamadoacao> chamadoacaoList;
    @OneToMany(mappedBy = "idUsuario")
    private List<Chamado> chamadoList;
    @OneToMany(mappedBy = "idUsuario")
    private List<Chamado> chamadoListResp;


    public Usuario() {
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Arearesponsavel getIdArearesponsavel() {
        return idArearesponsavel;
    }

    public void setIdArearesponsavel(Arearesponsavel idArearesponsavel) {
        this.idArearesponsavel = idArearesponsavel;
    }

    public LocalDepartamento getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(LocalDepartamento idLocal) {
        this.idLocal = idLocal;
    }

    public Nivelacesso getIdNivelacesso() {
        return idNivelacesso;
    }

    public void setIdNivelacesso(Nivelacesso idNivelacesso) {
        this.idNivelacesso = idNivelacesso;
    }

    public List<Chamadoacao> getChamadoacaoList() {
        return chamadoacaoList;
    }

    public void setChamadoacaoList(List<Chamadoacao> chamadoacaoList) {
        this.chamadoacaoList = chamadoacaoList;
    }

    public List<Chamado> getChamadoList() {
        return chamadoList;
    }

    public void setChamadoList(List<Chamado> chamadoList) {
        this.chamadoList = chamadoList;
    }

    public List<Chamado> getChamadoListResp() {
        return chamadoListResp;
    }

    public void setChamadoListResp(List<Chamado> chamadoList) {
        this.chamadoListResp = chamadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.SGC.Usuario[idUsuario=" + idUsuario + "]";
    }

}
