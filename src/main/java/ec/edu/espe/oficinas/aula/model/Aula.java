package ec.edu.espe.oficinas.aula.model;

import ec.edu.espe.oficinas.edificio.model.EdificioBloque;
import ec.edu.espe.oficinas.edificio.model.Edificio;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "OFI_AULA")
public class Aula implements Serializable {

    @EmbeddedId
    private AulaPK pk;
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COD_EDIFICIO",referencedColumnName = "COD_EDIFICIO", nullable = false, insertable = false, updatable = false)
    private Edificio edificio;
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COD_EDIFICIO_BLOQUE", nullable = false, insertable = false, updatable = false)
    private EdificioBloque edificioBloque;
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
    private LocalDate fechaCreacion;
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "FECHA_ULT_ACTUALIZACION", nullable = false)
    private LocalDate fechaUltActualizacion;

    public Aula() {
    }

    public Aula(AulaPK pk) {
        this.pk = pk;
    }

    public AulaPK getId() {
        return pk;
    }

    public void setId(AulaPK pk) {
        this.pk = pk;
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

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaUltActualizacion() {
        return fechaUltActualizacion;
    }

    public void setFechaUltActualizacion(LocalDate fechaUltActualizacion) {
        this.fechaUltActualizacion = fechaUltActualizacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aula aula = (Aula) o;
        return Objects.equals(pk, aula.pk);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(pk);
    }

    @Override
    public String toString() {
        return "Aula{" +
                "id=" + pk +
                ", edificio=" + edificio +
                ", edificioBloque=" + edificioBloque +
                ", tipoAula=" + tipoAula +
                ", codAlterno='" + codAlterno + '\'' +
                ", capacidad=" + capacidad +
                ", piso=" + piso +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaUltActualizacion=" + fechaUltActualizacion +
                '}';
    }
}


