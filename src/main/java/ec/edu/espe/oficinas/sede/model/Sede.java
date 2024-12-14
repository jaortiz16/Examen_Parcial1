package ec.edu.espe.oficinas.sede.model;



import ec.edu.espe.oficinas.institucion.model.Institucion;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "OFI_SEDE")
public class Sede implements Serializable {
    @Id
    @Column(name = "COD_SEDE", length = 8, nullable = false)
    @NotNull
    private String codSede;

    // Relación MANY-TO-ONE (hijo -> padre) con INSTITUCION
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COD_INSTITUCION", nullable = false, insertable = false, updatable = false)
    private Institucion institucion;

    @Column(name = "NOMBRE", length = 128, nullable = false)
    @NotNull
    private String nombre;

    @Column(name = "DIRECCION", length = 128, nullable = false)
    @NotNull
    private String direccion;

    @Column(name = "ES_PRINCIPAL", nullable = false)
    @NotNull
    private Boolean esPrincipal;

    @Column(name = "PRESUPUESTO", precision = 18, scale = 2, nullable = false)
    @NotNull
    private Double presupuesto;

    // Constructor vacío
    public Sede() {
    }

    // Constructor completo
    public Sede(String codSede, Institucion institucion, String nombre, String direccion,
                Boolean esPrincipal, Double presupuesto) {
        this.codSede = codSede;
        this.institucion = institucion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.esPrincipal = esPrincipal;
        this.presupuesto = presupuesto;
    }

    public String getCodSede() {
        return codSede;
    }

    public void setCodSede(String codSede) {
        this.codSede = codSede;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEsPrincipal() {
        return esPrincipal;
    }

    public void setEsPrincipal(Boolean esPrincipal) {
        this.esPrincipal = esPrincipal;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sede)) return false;
        Sede sede = (Sede) o;
        return Objects.equals(codSede, sede.codSede);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codSede);
    }

    @Override
    public String toString() {
        return "Sede{" +
                "codSede='" + codSede + '\'' +
                ", institucion=" + (institucion != null ? institucion.getCodInstitucion() : null) +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", esPrincipal=" + esPrincipal +
                ", presupuesto=" + presupuesto +
                '}';
    }
}
