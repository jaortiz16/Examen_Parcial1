package ec.edu.espe.oficinas.aula.model;

import jakarta.validation.constraints.NotNull;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AulaPK implements Serializable {

    @NotNull
    @Column(name = "COD_AULA", nullable = false)
    private Integer codAula;
    @NotNull
    @Column(name = "COD_EDIFICIO", length = 8, nullable = false)
    private String codEdificio;
    @NotNull
    @Column(name = "COD_EDIFICIO_BLOQUE", length = 8, nullable = false)
    private String codEdificioBloque;
    @NotNull
    @Column(name = "COD_TIPO_AULA", length = 10, nullable = false)
    private String codTipoAula;

    public AulaPK() {
    }

    public AulaPK(Integer codAula) {
        this.codAula = codAula;
    }

    public Integer getCodAula() {
        return codAula;
    }

    public void setCodAula(Integer codAula) {
        this.codAula = codAula;
    }

    public String getCodEdificio() {
        return codEdificio;
    }

    public void setCodEdificio(String codEdificio) {
        this.codEdificio = codEdificio;
    }

    public String getCodEdificioBloque() {
        return codEdificioBloque;
    }

    public void setCodEdificioBloque(String codEdificioBloque) {
        this.codEdificioBloque = codEdificioBloque;
    }

    public String getCodTipoAula() {
        return codTipoAula;
    }

    public void setCodTipoAula(String codTipoAula) {
        this.codTipoAula = codTipoAula;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AulaPK aulaPK = (AulaPK) o;
        return Objects.equals(codAula, aulaPK.codAula) && Objects.equals(codEdificio, aulaPK.codEdificio) && Objects.equals(codEdificioBloque, aulaPK.codEdificioBloque) && Objects.equals(codTipoAula, aulaPK.codTipoAula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codAula, codEdificio, codEdificioBloque, codTipoAula);
    }

    @Override
    public String toString() {
        return "AulaPK{" +
                "codAula=" + codAula +
                ", codEdificio='" + codEdificio + '\'' +
                ", codEdificioBloque='" + codEdificioBloque + '\'' +
                ", codTipoAula='" + codTipoAula + '\'' +
                '}';
    }
}
