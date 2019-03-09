package com.sl2.followup.entidades;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Transient;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "Usuario")
public class Usuario {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "USUARIO")
    @Index(unique = true)
    private String usuario;

    @Property(nameInDb = "CLAVE")
    private String clave;

    @NotNull
    @Property(nameInDb = "EMAIL")
    private String email;

    @Transient
    private int contadorDeUsuarios; // not persisted

    @Property(nameInDb = "ESTADO")
    private Boolean estado;

    @Property(nameInDb = "CREACION")
    private Date creacion;

    @Property(nameInDb = "ACTUALIZACION")
    private Date actualizacion;

    @Generated(hash = 1834685727)
    public Usuario(Long id, String usuario, String clave, @NotNull String email,
            Boolean estado, Date creacion, Date actualizacion) {
        this.id = id;
        this.usuario = usuario;
        this.clave = clave;
        this.email = email;
        this.estado = estado;
        this.creacion = creacion;
        this.actualizacion = actualizacion;
    }

    @Generated(hash = 562950751)
    public Usuario() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return this.clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEstado() {
        return this.estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Date getCreacion() {
        return this.creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public Date getActualizacion() {
        return this.actualizacion;
    }

    public void setActualizacion(Date actualizacion) {
        this.actualizacion = actualizacion;
    }
}
