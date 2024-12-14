package ec.edu.espe.oficinas.edificio.service;

import ec.edu.espe.oficinas.aula.model.Aula;
import ec.edu.espe.oficinas.aula.repository.AulaRepository;
import ec.edu.espe.oficinas.edificio.model.Edificio;
import ec.edu.espe.oficinas.edificio.repository.EdificioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EdificioService {

    private final EdificioRepository edificioRepository;
    private final AulaRepository aulaRepository;

    public EdificioService(EdificioRepository edificioRepository, AulaRepository aulaRepository) {
        this.edificioRepository = edificioRepository;
        this.aulaRepository = aulaRepository;
    }

    public Integer obtenerCapacidadTotalEdificio(String codSede, String codEdificio) {
        Optional<Edificio> edificio = this.edificioRepository.findById(codEdificio);
        if (edificio.isEmpty()) {
            throw new RuntimeException("No existe el edificio con código: " + codEdificio);
        }

        if (!edificio.get().getSede().getCodSede().equals(codSede)) {
            throw new RuntimeException("El edificio no pertenece a la sede indicada");
        }

        return this.aulaRepository.findAll()
                .stream()
                .filter(aula -> aula.getId().getCodEdificio().equals(codEdificio))
                .mapToInt(Aula::getCapacidad)
                .sum();
    }
}