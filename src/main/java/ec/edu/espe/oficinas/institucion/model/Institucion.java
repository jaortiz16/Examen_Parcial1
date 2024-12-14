package ec.edu.espe.oficinas.institucion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "OFI_INSTITUCION")
public class Institucion implements Serializable {

    @Id
    @NotNull
    @Column(name = "COD_INSTITUCION", length = 3, nullable = false)
    private Integer codInstitucion;
    @NotNull
    @Column(name = "RUC", length = 13, nullable = false)
    private String ruc;
    @NotNull
    @Column(name = "RAZON_SOCIAL", length = 250, nullable = false)
    private String razonSocial;
    @NotNull
    @Column(name = "NOMBRE_COMERCIAL", length = 250, nullable = false)
    private String nombreComercial;

    public Institucion() {
    }

    public Institucion(Integer codInstitucion) {
        this.codInstitucion = codInstitucion;
    }

    public Integer getCodInstitucion() {
        return codInstitucion;
    }

    public void setCodInstitucion(Integer codInstitucion) {
        this.codInstitucion = codInstitucion;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Institucion that = (Institucion) o;
        return Objects.equals(codInstitucion, that.codInstitucion);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codInstitucion);
    }

    @Override
    public String toString() {
        return "Institucion{" +
                "codInstitucion=" + codInstitucion +
                ", ruc='" + ruc + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", nombreComercial='" + nombreComercial + '\'' +
                '}';
    }
}
