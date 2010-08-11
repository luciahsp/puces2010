/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.SGC;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "CHAMADO")
@NamedQueries({
    @NamedQuery(name = "Chamado.findAll", query = "SELECT c FROM Chamado c"),
    @NamedQuery(name = "Chamado.findByIdChamado", query = "SELECT c FROM Chamado c WHERE c.idChamado = :idChamado"),
    @NamedQuery(name = "Chamado.findByDescricao", query = "SELECT c FROM Chamado c WHERE c.descricao = :descricao"),
    @NamedQuery(name = "Chamado.findByDataabertura", query = "SELECT c FROM Chamado c WHERE c.dataabertura = :dataabertura"),
    @NamedQuery(name = "Chamado.findByHoraabertura", query = "SELECT c FROM Chamado c WHERE c.horaabertura = :horaabertura"),
    @NamedQuery(name = "Chamado.findByDatafechamento", query = "SELECT c FROM Chamado c WHERE c.datafechamento = :datafechamento"),
    @NamedQuery(name = "Chamado.findByHorafechamento", query = "SELECT c FROM Chamado c WHERE c.horafechamento = :horafechamento")})
public class Chamado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CHAMADO")
    private Integer idChamado;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "DATAABERTURA")
    @Temporal(TemporalType.DATE)
    private Date dataabertura;
    @Column(name = "HORAABERTURA")
    @Temporal(TemporalType.TIME)
    private Date horaabertura;
    @Column(name = "DATAFECHAMENTO")
    @Temporal(TemporalType.DATE)
    private Date datafechamento;
    @Column(name = "HORAFECHAMENTO")
    @Temporal(TemporalType.TIME)
    private Date horafechamento;
    @OneToMany(mappedBy = "idChamado")
    private List<Chamadoacao> chamadoacaoList;
    @JoinColumn(name = "ID_AREARESPONSAVEL", referencedColumnName = "ID_AREARESPONSAVEL")
    @ManyToOne
    private Arearesponsavel idArearesponsavel;
    @JoinColumn(name = "ID_LOCAL", referencedColumnName = "ID_LOCAL")
    @ManyToOne
    private Local idLocal;
    @JoinColumn(name = "ID_PROBLEMA", referencedColumnName = "ID_PROBLEMA")
    @ManyToOne
    private Problema idProblema;
    @JoinColumn(name = "ID_STATUSATENDIMENTOATUAL", referencedColumnName = "ID_STATUSATENDIMENTO")
    @ManyToOne
    private Statusatendimento idStatusatendimentoatual;
    @JoinColumn(name = "ID_UNIDADE", referencedColumnName = "ID_UNIDADE")
    @ManyToOne
    private Unidade idUnidade;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne
    private Usuario idUsuario;

    public Chamado() {
    }

    public Chamado(Integer idChamado) {
        this.idChamado = idChamado;
    }

    public Integer getIdChamado() {
        return idChamado;
    }

    public void setIdChamado(Integer idChamado) {
        this.idChamado = idChamado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataabertura() {
        return dataabertura;
    }

    public void setDataabertura(Date dataabertura) {
        this.dataabertura = dataabertura;
    }

    public Date getHoraabertura() {
        return horaabertura;
    }

    public void setHoraabertura(Date horaabertura) {
        this.horaabertura = horaabertura;
    }

    public Date getDatafechamento() {
        return datafechamento;
    }

    public void setDatafechamento(Date datafechamento) {
        this.datafechamento = datafechamento;
    }

    public Date getHorafechamento() {
        return horafechamento;
    }

    public void setHorafechamento(Date horafechamento) {
        this.horafechamento = horafechamento;
    }

    public List<Chamadoacao> getChamadoacaoList() {
        return chamadoacaoList;
    }

    public void setChamadoacaoList(List<Chamadoacao> chamadoacaoList) {
        this.chamadoacaoList = chamadoacaoList;
    }

    public Arearesponsavel getIdArearesponsavel() {
        return idArearesponsavel;
    }

    public void setIdArearesponsavel(Arearesponsavel idArearesponsavel) {
        this.idArearesponsavel = idArearesponsavel;
    }

    public Local getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Local idLocal) {
        this.idLocal = idLocal;
    }

    public Problema getIdProblema() {
        return idProblema;
    }

    public void setIdProblema(Problema idProblema) {
        this.idProblema = idProblema;
    }

    public Statusatendimento getIdStatusatendimentoatual() {
        return idStatusatendimentoatual;
    }

    public void setIdStatusatendimentoatual(Statusatendimento idStatusatendimentoatual) {
        this.idStatusatendimentoatual = idStatusatendimentoatual;
    }

    public Unidade getIdUnidade() {
        return idUnidade;
    }

    public void setIdUnidade(Unidade idUnidade) {
        this.idUnidade = idUnidade;
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
        hash += (idChamado != null ? idChamado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chamado)) {
            return false;
        }
        Chamado other = (Chamado) object;
        if ((this.idChamado == null && other.idChamado != null) || (this.idChamado != null && !this.idChamado.equals(other.idChamado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.SGC.Chamado[idChamado=" + idChamado + "]";
    }

}
