/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Gafufos.entidades;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author andre
 */
@Entity
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u")
    , @NamedQuery(name = "Usuarios.findByIdUsuario", query = "SELECT u FROM Usuarios u WHERE u.idUsuario = :idUsuario")
    , @NamedQuery(name = "Usuarios.findByPersona", query = "SELECT u FROM Usuarios u WHERE u.persona = :persona")
    , @NamedQuery(name = "Usuarios.findByPrivilegios", query = "SELECT u FROM Usuarios u WHERE u.privilegios = :privilegios")
    , @NamedQuery(name = "Usuarios.findByPassword", query = "SELECT u FROM Usuarios u WHERE u.password = :password")
    , @NamedQuery(name = "Usuarios.findByFechaDesde", query = "SELECT u FROM Usuarios u WHERE u.fechaDesde = :fechaDesde")
    , @NamedQuery(name = "Usuarios.findByFechaHasta", query = "SELECT u FROM Usuarios u WHERE u.fechaHasta = :fechaHasta")
    , @NamedQuery(name = "Usuarios.findByEstado", query = "SELECT u FROM Usuarios u WHERE u.estado = :estado")
    , @NamedQuery(name = "Usuarios.findBySesion", query = "SELECT u FROM Usuarios u WHERE u.sesion = :sesion")
    , @NamedQuery(name = "Usuarios.findByIDSesion", query = "SELECT u FROM Usuarios u WHERE u.iDSesion = :iDSesion")
    , @NamedQuery(name = "Usuarios.findByMail", query = "SELECT u FROM Usuarios u WHERE u.mail = :mail")
    , @NamedQuery(name = "Usuarios.findByUsuarioModifica", query = "SELECT u FROM Usuarios u WHERE u.usuarioModifica = :usuarioModifica")
    , @NamedQuery(name = "Usuarios.findByFecha", query = "SELECT u FROM Usuarios u WHERE u.fecha = :fecha")})
public class Usuarios  extends AbstractEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "Id_Usuario")
    private String idUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Persona")
    private int persona;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Privilegios")
    private int privilegios;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_Desde")
    @Temporal(TemporalType.DATE)
    private Date fechaDesde;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_Hasta")
    @Temporal(TemporalType.DATE)
    private Date fechaHasta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Estado")
    private int estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Sesion")
    private boolean sesion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 140)
    @Column(name = "ID_Sesion")
    private String iDSesion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 140)
    @Column(name = "Mail")
    private String mail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Usuario_Modifica")
    private int usuarioModifica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "Tema", referencedColumnName = "Id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Theme tema;

    public Usuarios() {
    }

    public Usuarios(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuarios(String idUsuario, int persona, int privilegios, String password, Date fechaDesde, Date fechaHasta, int estado, boolean sesion, String iDSesion, String mail, int usuarioModifica, Date fecha) {
        this.idUsuario = idUsuario;
        this.persona = persona;
        this.privilegios = privilegios;
        this.password = password;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.estado = estado;
        this.sesion = sesion;
        this.iDSesion = iDSesion;
        this.mail = mail;
        this.usuarioModifica = usuarioModifica;
        this.fecha = fecha;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

    public int getPrivilegios() {
        return privilegios;
    }

    public void setPrivilegios(int privilegios) {
        this.privilegios = privilegios;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public boolean getSesion() {
        return sesion;
    }

    public void setSesion(boolean sesion) {
        this.sesion = sesion;
    }

    public String getIDSesion() {
        return iDSesion;
    }

    public void setIDSesion(String iDSesion) {
        this.iDSesion = iDSesion;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(int usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Theme getTema() {
        return tema;
    }

    public void setTema(Theme tema) {
        this.tema = tema;
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
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Gafufos.entidades.Usuarios[ idUsuario=" + idUsuario + " ]";
    }
    
       @Override
    public int getPrimaryKey() {
        //This method is not needed for this class
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        //This method is not needed for this class
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setUser() {
        //Todo assign the real user.
        usuarioModifica = 1;
    }

    @Override
    public void setDate(Date date) {
        fecha = date;
    }
    
}
