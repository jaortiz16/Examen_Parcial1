package ec.edu.espe.oficinas.aula.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "OFI_TIPO_AULA")
public class TipoAula implements Serializable {
    @Id
    @Column(name = "COD_TIPO_AULA")
    private String codigo;
    @NotNull
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION", nullable = false)
    private LocalDate fechaCreacion;

    public TipoAula() {
    }
    public TipoAula(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
        return Objects.equals(codigo, tipoAula.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public String toString() {
        return "TipoAula{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}
