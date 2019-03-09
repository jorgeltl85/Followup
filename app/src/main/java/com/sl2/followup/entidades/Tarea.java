package com.sl2.followup.entidades;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.OrderBy;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToMany;
import org.greenrobot.greendao.annotation.Transient;
import org.greenrobot.greendao.converter.PropertyConverter;

import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;

@Entity(nameInDb = "Tarea")
public class Tarea {

    @Id(autoincrement = true)
    private Long tareaId;

    @NotNull
    @Property(nameInDb = "NOMBRE")
    private String nombre;

    @Property(nameInDb = "DESCRIPCION")
    private String descripcion;

    @Property(nameInDb = "ESTADO")
    private Boolean estado;

    @Property(nameInDb = "INICIO")
    private Date inicio;

    @Property(nameInDb = "FIN")
    private Date fin;

    @Property(nameInDb = "PERIODICIDAD")
    private Integer periodicidad;

    //private time  hora;

    @Property(nameInDb = "RECORDATORIO")
    private Date recordatorio;

    @Property(nameInDb = "CREACION")
    private Date creacion;

    @Property(nameInDb = "ACTUALIZACION")
    private Date actualizacion;

    @ToMany(referencedJoinProperty = "detalleId")
    @OrderBy("fechaDetalle ASC")

    private List<Detalle> listaDetalles;

    @Transient
    private int contadorDeSeguimiento; // not persisted

    //http://greenrobot.org/greendao/documentation/custom-types/

    @Convert(converter = PeriodoConverter.class, columnType = Integer.class)
    private Periodo periodo;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 1145870873)
    private transient TareaDao myDao;

    @Generated(hash = 2040051926)
    public Tarea(Long tareaId, @NotNull String nombre, String descripcion, Boolean estado,
            Date inicio, Date fin, Integer periodicidad, Date recordatorio, Date creacion,
            Date actualizacion, Periodo periodo) {
        this.tareaId = tareaId;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.inicio = inicio;
        this.fin = fin;
        this.periodicidad = periodicidad;
        this.recordatorio = recordatorio;
        this.creacion = creacion;
        this.actualizacion = actualizacion;
        this.periodo = periodo;
    }

    @Generated(hash = 381120976)
    public Tarea() {
    }

    public Long getTareaId() {
        return this.tareaId;
    }

    public void setTareaId(Long tareaId) {
        this.tareaId = tareaId;
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

    public Date getInicio() {
        return this.inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return this.fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public Integer getPeriodicidad() {
        return this.periodicidad;
    }

    public void setPeriodicidad(Integer periodicidad) {
        this.periodicidad = periodicidad;
    }

    public Date getRecordatorio() {
        return this.recordatorio;
    }

    public void setRecordatorio(Date recordatorio) {
        this.recordatorio = recordatorio;
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

    public Periodo getPeriodo() {
        return this.periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 1394667993)
    public List<Detalle> getListaDetalles() {
        if (listaDetalles == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            DetalleDao targetDao = daoSession.getDetalleDao();
            List<Detalle> listaDetallesNew = targetDao._queryTarea_ListaDetalles(tareaId);
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
    @Generated(hash = 1782534244)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getTareaDao() : null;
    }

    public enum Periodo {
        DIARIO(0), SEMANAL(1), FIN_SEMANA(2),ENTRE_SEMANA(3);

        final int id;

        Periodo(int id) {
            this.id = id;
        }
    }

    public static class PeriodoConverter implements PropertyConverter<Periodo, Integer> {
        @Override
        public Periodo convertToEntityProperty(Integer databaseValue) {
            if (databaseValue == null) {
                return null;
            }
            for (Periodo role : Periodo.values()) {
                if (role.id == databaseValue) {
                    return role;
                }
            }
            return Periodo.DIARIO;
        }

        @Override
        public Integer convertToDatabaseValue(Periodo entityProperty) {
            return entityProperty == null ? null : entityProperty.id;
        }
    }

}
