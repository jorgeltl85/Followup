package com.sl2.followup.entidades;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.OrderBy;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToMany;
import org.greenrobot.greendao.annotation.Transient;

import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;

@Entity(nameInDb = "Seguimiento")
public class Seguimiento {

    @Id(autoincrement = true)
    private Long seguimientoId;

    @Property(nameInDb = "DESCRIPCION")
    private String descripcion;

    @Property(nameInDb = "ESTADO")
    private Boolean estado;

    @Property(nameInDb = "CREACION")
    private Date creacion;

    @Property(nameInDb = "ACTUALIZACION")
    private Date actualizacion;

    @ToMany(referencedJoinProperty = "detalleId")
    @OrderBy("fechaDetalle ASC")

    private List<Detalle> listaDetalles;

    @Transient
    private int contadorDeSeguimiento; // not persisted

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 401710848)
    private transient SeguimientoDao myDao;

    @Generated(hash = 258626007)
    public Seguimiento(Long seguimientoId, String descripcion, Boolean estado,
            Date creacion, Date actualizacion) {
        this.seguimientoId = seguimientoId;
        this.descripcion = descripcion;
        this.estado = estado;
        this.creacion = creacion;
        this.actualizacion = actualizacion;
    }

    @Generated(hash = 1603426513)
    public Seguimiento() {
    }

    public Long getSeguimientoId() {
        return this.seguimientoId;
    }

    public void setSeguimientoId(Long seguimientoId) {
        this.seguimientoId = seguimientoId;
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

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 885064946)
    public List<Detalle> getListaDetalles() {
        if (listaDetalles == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            DetalleDao targetDao = daoSession.getDetalleDao();
            List<Detalle> listaDetallesNew = targetDao
                    ._querySeguimiento_ListaDetalles(seguimientoId);
            synchronized (this) {
                if (listaDetalles == null) {
                    listaDetalles = listaDetallesNew;
                }
            }
        }
        return listaDetalles;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 1569435624)
    public synchronized void resetListaDetalles() {
        listaDetalles = null;
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 644773718)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getSeguimientoDao() : null;
    }

}
