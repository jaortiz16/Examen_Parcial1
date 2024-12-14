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
    @Column(name = "COD_INSTITUCION", length = 3, nullable = false)
    @NotNull
    private Integer codInstitucion;

    @Column(name = "RUC", length = 13, nullable = false)
    @NotNull
    private String ruc;

    @Column(name = "RAZON_SOCIAL", length = 250, nullable = false)
    @NotNull
    private String razonSocial;

    @Column(name = "NOMBRE_COMERCIAL", length = 250, nullable = false)
    @NotNull
    private String nombreComercial;

    // Constructor vacío
    public Institucion() {
    }

    // Constructor completo
    public Institucion(Integer codInstitucion, String ruc, String razonSocial, String nombreComercial) {
        this.codInstitucion = codInstitucion;
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.nombreComercial = nombreComercial;
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
        if (this == o) return true;
        if (!(o instanceof Institucion)) return false;
        Institucion that = (Institucion) o;
        return Objects.equals(codInstitucion, that.codInstitucion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codInstitucion);
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
