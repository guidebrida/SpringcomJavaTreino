package praticaSpring.guilherme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import praticaSpring.guilherme.domain.Postagem;
import praticaSpring.guilherme.domain.Usuario;
import praticaSpring.guilherme.repositories.PostagemRepository;
import praticaSpring.guilherme.services.exceptions.ObjectNotFoundException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PostagemService {

    @Autowired
    PostagemRepository repo;

    public Postagem find(Integer id) {
        Optional<Postagem> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Equipamento não encontrado! Tipo: "));
    }

    public List<Postagem> findAll() {
        return repo.findAll();
    }
    public Postagem insert(Postagem obj) {
        obj.setId(null);
        obj.setInstante(LocalDateTime.now());
        return repo.save(obj);
    }
}


