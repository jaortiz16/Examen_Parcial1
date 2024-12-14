package ec.edu.espe.oficinas.institucion.service;

import ec.edu.espe.oficinas.institucion.model.Institucion;
import ec.edu.espe.oficinas.institucion.repository.InstitucionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstitucionService {

    private final InstitucionRepository institucionRepository;

    public InstitucionService(InstitucionRepository institucionRepository) {
        this.institucionRepository = institucionRepository;
    }

    public List<Institucion> listarTodas() {
        return this.institucionRepository.findAll();
    }

    public Optional<Institucion> obtenerPorId(Integer id) {
        return this.institucionRepository.findById(id);
    }

    public Institucion crear(Institucion institucion) {
        Optional<Institucion> institucionExistente = this.institucionRepository.findAll()
                .stream()
                .filter(i -> i.getRuc().equals(institucion.getRuc()))
                .findFirst();
        if (institucionExistente.isPresent()) {
            throw new RuntimeException("Ya existe una institución con el RUC: " + institucion.getRuc());
        }
        return this.institucionRepository.save(institucion);
    }

    public Institucion modificar(Integer id, Institucion institucion) {
        Optional<Institucion> institucionExistente = this.institucionRepository.findById(id);
        if (institucionExistente.isEmpty()) {
            throw new RuntimeException("No existe la institución con id: " + id);
        }
        institucion.setCodInstitucion(id);
        return this.institucionRepository.save(institucion);
    }

    public void eliminar(Integer id) {
        this.institucionRepository.deleteById(id);
    }
}