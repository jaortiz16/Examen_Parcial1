package ec.edu.espe.oficinas.aula.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@Embeddable
public class AulaPK implements Serializable {
    @NotNull
    @Column(name = "COD_AULA")
    private Integer codigo;
    @NotNull
    @Column(name = "COD_EDIFICIO")
    private String codigoEdificio;
    @NotNull
}
