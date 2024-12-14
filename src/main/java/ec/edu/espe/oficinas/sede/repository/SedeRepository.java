package ec.edu.espe.oficinas.sede.repository;

import ec.edu.espe.oficinas.sede.model.Sede;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SedeRepository extends JpaRepository<Sede, String> {
}