package ec.edu.espe.oficinas.edificio.model;


import ec.edu.espe.oficinas.sede.model.Sede;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.*;

@Entity
@Table(name = "OFI_EDIFICIO")
public class Edificio implements Serializable {
    @Id
    @Column(name = "COD_EDIFICIO", length = 8, nullable = false)
    @NotNull
    private String codEdificio;

    // Relación MANY-TO-ONE con Sede
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COD_SEDE", nullable = false, insertable = false, updatable = false)
    private Sede sede;

    @Column(name = "NOMBRE", length = 128, nullable = false)
    @NotNull
    private String nombre;

    @Column(name = "COD_ALTERNO", length = 16, nullable = false)
    @NotNull
    private String codAlterno;

    @Column(name = "DESCRIPCION", length = 500, nullable = false)
    @NotNull
    private String descripcion;

    @Column(name = "COMENTARIO", length = 1000, nullable = false)
    @NotNull
    private String comentario;

    @Column(name = "DIRECCION", length = 256, nullable = false)
    @NotNull
    private String direccion;

    @Column(name = "MANEJA_BLOQUES", nullable = false)
    @NotNull
    private Boolean manejaBloques;

    @Column(name = "POSEE_AULAS", nullable = false)
    @NotNull
    private Boolean poseeAulas;

    @Column(name = "PISOS", nullable = false)
    @NotNull
    private Integer pisos;

    // Constructor vacío
    public Edificio() {
    }

    // Constructor completo
    public Edificio(String codEdificio, Sede sede, String nombre, String codAlterno, String descripcion,
                    String comentario, String direccion, Boolean manejaBloques, Boolean poseeAulas, Integer pisos) {
        this.codEdificio = codEdificio;
        this.sede = sede;
        this.nombre = nombre;
        this.codAlterno = codAlterno;
        this.descripcion = descripcion;
        this.comentario = comentario;
        this.direccion = direccion;
        this.manejaBloques = manejaBloques;
        this.poseeAulas = poseeAulas;
        this.pisos = pisos;
    }

    public String getCodEdificio() {
        return codEdificio;
    }

    public void setCodEdificio(String codEdificio) {
        this.codEdificio = codEdificio;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodAlterno() {
        return codAlterno;
    }

    public void setCodAlterno(String codAlterno) {
        this.codAlterno = codAlterno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getManejaBloques() {
        return manejaBloques;
    }

    public void setManejaBloques(Boolean manejaBloques) {
        this.manejaBloques = manejaBloques;
    }

    public Boolean getPoseeAulas() {
        return poseeAulas;
    }

    public void setPoseeAulas(Boolean poseeAulas) {
        this.poseeAulas = poseeAulas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Edificio)) return false;
        Edificio edificio = (Edificio) o;
        return Objects.equals(codEdificio, edificio.codEdificio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codEdificio);
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "codEdificio='" + codEdificio + '\'' +
                ", sede=" + (sede != null ? sede.getCodSede() : null) +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
