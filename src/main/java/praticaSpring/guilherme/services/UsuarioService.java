package praticaSpring.guilherme.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import praticaSpring.guilherme.domain.Usuario;
import praticaSpring.guilherme.repositories.UsuarioRepository;
import praticaSpring.guilherme.services.exceptions.ObjectNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {


    @Autowired
    UsuarioRepository repo;

    public Usuario find(Integer id) {
        Optional<Usuario> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Equipamento não encontrado! Tipo: "));
    }

    public List<Usuario> findAll() {
        return repo.findAll();
    }
    public Usuario insert(Usuario obj) {
        obj.setId(null);
        return repo.save(obj);
    }



}


