package ec.edu.espe.oficinas.institucion.repository;

import ec.edu.espe.oficinas.institucion.model.Institucion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstitucionRepository extends JpaRepository<Institucion, Integer> {
}