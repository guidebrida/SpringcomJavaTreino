package praticaSpring.guilherme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import praticaSpring.guilherme.domain.Comentario;
import praticaSpring.guilherme.domain.Usuario;
import praticaSpring.guilherme.repositories.ComentarioRepository;
import praticaSpring.guilherme.services.exceptions.ObjectNotFoundException;

import java.util.List;
import java.util.Optional;


@Service
public class ComentarioService {


    @Autowired
    ComentarioRepository repo;

    public Comentario find(Integer id) {
        Optional<Comentario> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Equipamento não encontrado! Tipo: "));
    }

    public List<Comentario> findAll() {
        return repo.findAll();
    }

}
