package ec.edu.espe.oficinas.aula.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "OFI_TIPO_AULA")
public class TipoAula implements Serializable {

    @NotNull
    @Id
    @Column(name = "COD_TIPO_AULA", length = 10, nullable = false)
    private String codTipoAula;

    @NotNull
    @Column(name = "DESCRIPCION", length = 128, nullable = false)
    private String descripcion;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION", nullable = false)
    private LocalDate fechaCreacion;

    public TipoAula() {
    }

    public TipoAula(String codTipoAula) {
        this.codTipoAula = codTipoAula;
    }

    public String getCodTipoAula() {
        return codTipoAula;
    }

    public void setCodTipoAula(String codTipoAula) {
        this.codTipoAula = codTipoAula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TipoAula tipoAula = (TipoAula) o;
        return Objects.equals(codTipoAula, tipoAula.codTipoAula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codTipoAula);
    }

    @Override
    public String toString() {
        return "TipoAula{" +
                "codTipoAula='" + codTipoAula + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}
