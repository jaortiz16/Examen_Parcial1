package ec.edu.espe.oficinas.edificio.repository;

import ec.edu.espe.oficinas.edificio.model.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EdificioRepository extends JpaRepository<Edificio, String> {
}