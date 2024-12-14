package ec.edu.espe.oficinas.aula.model;


import ec.edu.oficinas.bloque.models.EdificioBloque;
import ec.edu.oficinas.edificio.models.Edificio;
import ec.edu.oficinas.tipoaula.models.TipoAula;
import jakarta.validation.constraints.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "OFI_AULA")
public class Aula implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private AulaId id;

    // Relación MANY-TO-ONE con Edificio (usando parte de la PK compuesta)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COD_EDIFICIO", nullable = false, insertable = false, updatable = false)
    private Edificio edificio;

    // Relación MANY-TO-ONE con EdificioBloque
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COD_EDIFICIO_BLOQUE", nullable = false, insertable = false, updatable = false)
    private EdificioBloque edificioBloque;

    // Relación MANY-TO-ONE con TipoAula
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COD_TIPO_AULA", nullable = false, insertable = false, updatable = false)
    private TipoAula tipoAula;

    @NotNull
    @Column(name = "COD_ALTERNO", length = 10, nullable = false)
    private String codAlterno;

    @NotNull
    @Column(name = "CAPACIDAD", nullable = false)
    private Integer capacidad;

    @NotNull
    @Column(name = "PISO", nullable = false)
    private Integer piso;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION", nullable = false)
    private Date fechaCreacion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_ULT_ACTUALIZACION", nullable = false)
    @NotNull
    private Date fechaUltActualizacion;

    // Constructor vacío
    public Aula() {
    }

    // Constructor completo
    public Aula(AulaId id, Edificio edificio, EdificioBloque edificioBloque, TipoAula tipoAula,
                String codAlterno, Integer capacidad, Integer piso, Date fechaCreacion, Date fechaUltActualizacion) {
        this.id = id;
        this.edificio = edificio;
        this.edificioBloque = edificioBloque;
        this.tipoAula = tipoAula;
        this.codAlterno = codAlterno;
        this.capacidad = capacidad;
        this.piso = piso;
        this.fechaCreacion = fechaCreacion;
        this.fechaUltActualizacion = fechaUltActualizacion;
    }

    public AulaId getId() {
        return id;
    }

    public void setId(AulaId id) {
        this.id = id;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    public EdificioBloque getEdificioBloque() {
        return edificioBloque;
    }

    public void setEdificioBloque(EdificioBloque edificioBloque) {
        this.edificioBloque = edificioBloque;
    }

    public TipoAula getTipoAula() {
        return tipoAula;
    }

    public void setTipoAula(TipoAula tipoAula) {
        this.tipoAula = tipoAula;
    }

    public String getCodAlterno() {
        return codAlterno;
    }

    public void setCodAlterno(String codAlterno) {
        this.codAlterno = codAlterno;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaUltActualizacion() {
        return fechaUltActualizacion;
    }

    public void setFechaUltActualizacion(Date fechaUltActualizacion) {
        this.fechaUltActualizacion = fechaUltActualizacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aula)) return false;
        Aula aula = (Aula) o;
        return Objects.equals(id, aula.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Aula{" +
                "id=" + id +
                ", codAlterno='" + codAlterno + '\'' +
                ", capacidad=" + capacidad +
                ", piso=" + piso +
                '}';
    }
}
