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
@Table(name = "HISTORICOACESSO")
@NamedQueries({
    @NamedQuery(name = "Historicoacesso.findAll", query = "SELECT h FROM Historicoacesso h"),
    @NamedQuery(name = "Historicoacesso.findByIdHistoricoacesso", query = "SELECT h FROM Historicoacesso h WHERE h.idHistoricoacesso = :idHistoricoacesso"),
    @NamedQuery(name = "Historicoacesso.findByData", query = "SELECT h FROM Historicoacesso h WHERE h.data = :data"),
    @NamedQuery(name = "Historicoacesso.findByHora", query = "SELECT h FROM Historicoacesso h WHERE h.hora = :hora")})
public class Historicoacesso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_HISTORICOACESSO")
    private Integer idHistoricoacesso;
    @Column(name = "DATA")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(name = "HORA")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @JoinColumn(name = "ID_TIPOACESSO", referencedColumnName = "ID_TIPOACESSO")
    @ManyToOne
    private Tipoacesso idTipoacesso;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne
    private Usuario idUsuario;

    public Historicoacesso() {
    }

    public Historicoacesso(Integer idHistoricoacesso) {
        this.idHistoricoacesso = idHistoricoacesso;
    }

    public Integer getIdHistoricoacesso() {
        return idHistoricoacesso;
    }

    public void setIdHistoricoacesso(Integer idHistoricoacesso) {
        this.idHistoricoacesso = idHistoricoacesso;
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

    public Tipoacesso getIdTipoacesso() {
        return idTipoacesso;
    }

    public void setIdTipoacesso(Tipoacesso idTipoacesso) {
        this.idTipoacesso = idTipoacesso;
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
        hash += (idHistoricoacesso != null ? idHistoricoacesso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historicoacesso)) {
            return false;
        }
        Historicoacesso other = (Historicoacesso) object;
        if ((this.idHistoricoacesso == null && other.idHistoricoacesso != null) || (this.idHistoricoacesso != null && !this.idHistoricoacesso.equals(other.idHistoricoacesso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.SGC.Historicoacesso[idHistoricoacesso=" + idHistoricoacesso + "]";
    }

}
