/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.SGC;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "CHAMADOACAO")
@NamedQueries({
    @NamedQuery(name = "Chamadoacao.findAll", query = "SELECT c FROM Chamadoacao c"),
    @NamedQuery(name = "Chamadoacao.findByIdChamadoacao", query = "SELECT c FROM Chamadoacao c WHERE c.idChamadoacao = :idChamadoacao"),
    @NamedQuery(name = "Chamadoacao.findByDescricao", query = "SELECT c FROM Chamadoacao c WHERE c.descricao = :descricao"),
    @NamedQuery(name = "Chamadoacao.findByData", query = "SELECT c FROM Chamadoacao c WHERE c.data = :data"),
    @NamedQuery(name = "Chamadoacao.findByHora", query = "SELECT c FROM Chamadoacao c WHERE c.hora = :hora")})
public class Chamadoacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CHAMADOACAO")
    private Integer idChamadoacao;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "DATA")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(name = "HORA")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @JoinColumn(name = "ID_CHAMADO", referencedColumnName = "ID_CHAMADO")
    @ManyToOne
    private Chamado idChamado;
    @JoinColumn(name = "ID_STATUSATENDIMENTOATUAL", referencedColumnName = "ID_STATUSATENDIMENTO")
    @ManyToOne
    private Statusatendimento idStatusatendimentoatual;
    @JoinColumn(name = "ID_STATUSATENDIMENTOANTERIOR", referencedColumnName = "ID_STATUSATENDIMENTO")
    @ManyToOne
    private Statusatendimento idStatusatendimentoanterior;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne
    private Usuario idUsuario;

    public Chamadoacao() {
    }

    public Chamadoacao(Integer idChamadoacao) {
        this.idChamadoacao = idChamadoacao;
    }

    public Integer getIdChamadoacao() {
        return idChamadoacao;
    }

    public void setIdChamadoacao(Integer idChamadoacao) {
        this.idChamadoacao = idChamadoacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Chamado getIdChamado() {
        return idChamado;
    }

    public void setIdChamado(Chamado idChamado) {
        this.idChamado = idChamado;
    }

    public Statusatendimento getIdStatusatendimentoatual() {
        return idStatusatendimentoatual;
    }

    public void setIdStatusatendimentoatual(Statusatendimento idStatusatendimentoatual) {
        this.idStatusatendimentoatual = idStatusatendimentoatual;
    }

    public Statusatendimento getIdStatusatendimentoanterior() {
        return idStatusatendimentoanterior;
    }

    public void setIdStatusatendimentoanterior(Statusatendimento idStatusatendimentoanterior) {
        this.idStatusatendimentoanterior = idStatusatendimentoanterior;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idChamadoacao != null ? idChamadoacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chamadoacao)) {
            return false;
        }
        Chamadoacao other = (Chamadoacao) object;
        if ((this.idChamadoacao == null && other.idChamadoacao != null) || (this.idChamadoacao != null && !this.idChamadoacao.equals(other.idChamadoacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.SGC.Chamadoacao[idChamadoacao=" + idChamadoacao + "]";
    }

}
