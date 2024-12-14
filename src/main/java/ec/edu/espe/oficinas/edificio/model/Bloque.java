package ec.edu.espe.oficinas.edificio.model;


import ec.edu.espe.oficinas.edificio.model.Edificio;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "OFI_EDIFICIO_BLOQUE")
public class EdificioBloque implements Serializable {

    @Id
    @Column(name = "COD_EDIFICIO_BLOQUE", length = 8, nullable = false)
    @NotNull
    private String codEdificioBloque;

    // Relación MANY-TO-ONE con Edificio
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COD_EDIFICIO", nullable = false, insertable = false, updatable = false)
    private Edificio edificio;

    @Column(name = "NOMBRE_BLOQUE", length = 128, nullable = false)
    @NotNull
    private String nombreBloque;

    @Column(name = "DESCRIPCION", length = 500, nullable = false)
    @NotNull
    private String descripcion;

    // Constructor vacío
    public EdificioBloque() {
    }

    // Constructor completo
    public EdificioBloque(String codEdificioBloque, Edificio edificio, String nombreBloque, String descripcion) {
        this.codEdificioBloque = codEdificioBloque;
        this.edificio = edificio;
        this.nombreBloque = nombreBloque;
        this.descripcion = descripcion;
    }

    public String getCodEdificioBloque() {
        return codEdificioBloque;
    }

    public void setCodEdificioBloque(String codEdificioBloque) {
        this.codEdificioBloque = codEdificioBloque;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    public String getNombreBloque() {
        return nombreBloque;
    }

    public void setNombreBloque(String nombreBloque) {
        this.nombreBloque = nombreBloque;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EdificioBloque)) return false;
        EdificioBloque that = (EdificioBloque) o;
        return Objects.equals(codEdificioBloque, that.codEdificioBloque);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codEdificioBloque);
    }

    @Override
    public String toString() {
        return "EdificioBloque{" +
                "codEdificioBloque='" + codEdificioBloque + '\'' +
                ", edificio=" + (edificio != null ? edificio.getCodEdificio() : null) +
                ", nombreBloque='" + nombreBloque + '\'' +
                '}';
    }
}
