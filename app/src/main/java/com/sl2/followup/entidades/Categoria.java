package com.sl2.followup.entidades;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "Categoria")
public class Categoria {

    @Id(autoincrement = true)
    private Long categoriaId;

    @Property(nameInDb = "NOMBRE")
    private String nombre;

    @Property(nameInDb = "DESCRIPCION")
    private String descripcion;

    @Property(nameInDb = "ESTADO")
    private Boolean estado;

    @Property(nameInDb = "CREACION")
    private Date creacion;

    @Property(nameInDb = "ACTUALIZACION")
    private Date actualizacion;

    @Generated(hash = 197843510)
    public Categoria(Long categoriaId, String nombre, String descripcion,
            Boolean estado, Date creacion, Date actualizacion) {
        this.categoriaId = categoriaId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.creacion = creacion;
        this.actualizacion = actualizacion;
    }

    @Generated(hash = 577285458)
    public Categoria() {
    }

    public Long getCategoriaId() {
        return this.categoriaId;
    }

    public void setCategoriaId(Long categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
