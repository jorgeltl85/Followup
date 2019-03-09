package com.sl2.followup.entidades;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Transient;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "Persona")
public class Persona {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "NOMBRE")
    @Index(unique = true)
    private String nombre;

    @Property(nameInDb = "DIRECCION")
    private String direccion;

    @Property(nameInDb = "ESTADO")
    private Boolean estado;

    @Property(nameInDb = "CREACION")
    private Date creacion;

    @Property(nameInDb = "ACTUALIZACION")
    private Date actualizacion;

    @Generated(hash = 1140510870)
    public Persona(Long id, String nombre, String direccion, Boolean estado,
            Date creacion, Date actualizacion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estado = estado;
        this.creacion = creacion;
        this.actualizacion = actualizacion;
    }

    @Generated(hash = 1270265349)
    public Persona() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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