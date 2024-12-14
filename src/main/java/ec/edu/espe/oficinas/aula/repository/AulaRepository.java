package ec.edu.espe.oficinas.aula.repository;

import ec.edu.espe.oficinas.aula.model.Aula;
import ec.edu.espe.oficinas.aula.model.AulaPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AulaRepository extends JpaRepository<Aula, AulaPK> {
}