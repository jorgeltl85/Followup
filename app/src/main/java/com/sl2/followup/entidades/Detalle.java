package com.sl2.followup.entidades;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Transient;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.NotNull;

@Entity(nameInDb = "Detalle")
public class Detalle {

    @Id(autoincrement = true)
    private Long detalleId;

    @Property(nameInDb = "DESCRIPCION")
    private String descripcion;

    @Property(nameInDb = "ESTADO")
    private Boolean estado;

    @Property(nameInDb = "CREACION")
    private Date creacion;

    @Property(nameInDb = "ACTUALIZACION")
    private Date actualizacion;

    private Date fechaDetalle;

    private long seguimientoId;

    @ToOne(joinProperty = "seguimientoId")
    private Seguimiento seguimiento;

    @Transient
    private int contadorDeDetalles; // not persisted

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 2140098230)
    private transient DetalleDao myDao;

    @Generated(hash = 31865706)
    public Detalle(Long detalleId, String descripcion, Boolean estado,
            Date creacion, Date actualizacion, Date fechaDetalle,
            long seguimientoId) {
        this.detalleId = detalleId;
        this.descripcion = descripcion;
        this.estado = estado;
        this.creacion = creacion;
        this.actualizacion = actualizacion;
        this.fechaDetalle = fechaDetalle;
        this.seguimientoId = seguimientoId;
    }

    @Generated(hash = 1198213439)
    public Detalle() {
    }

    public Long getDetalleId() {
        return this.detalleId;
    }

    public void setDetalleId(Long detalleId) {
        this.detalleId = detalleId;
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

    public Date getFechaDetalle() {
        return this.fechaDetalle;
    }

    public void setFechaDetalle(Date fechaDetalle) {
        this.fechaDetalle = fechaDetalle;
    }

    public long getSeguimientoId() {
        return this.seguimientoId;
    }

    public void setSeguimientoId(long seguimientoId) {
        this.seguimientoId = seguimientoId;
    }

    @Generated(hash = 173668044)
    private transient Long seguimiento__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 918151546)
    public Seguimiento getSeguimiento() {
        long __key = this.seguimientoId;
        if (seguimiento__resolvedKey == null
                || !seguimiento__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            SeguimientoDao targetDao = daoSession.getSeguimientoDao();
            Seguimiento seguimientoNew = targetDao.load(__key);
            synchronized (this) {
                seguimiento = seguimientoNew;
                seguimiento__resolvedKey = __key;
            }
        }
        return seguimiento;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1265621775)
    public void setSeguimiento(@NotNull Seguimiento seguimiento) {
        if (seguimiento == null) {
            throw new DaoException(
                    "To-one property 'seguimientoId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.seguimiento = seguimiento;
            seguimientoId = seguimiento.getSeguimientoId();
            seguimiento__resolvedKey = seguimientoId;
        }
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
    @Generated(hash = 1716740084)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getDetalleDao() : null;
    }


}


