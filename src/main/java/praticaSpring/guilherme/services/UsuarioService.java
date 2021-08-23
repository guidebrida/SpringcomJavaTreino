package praticaSpring.guilherme.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import praticaSpring.guilherme.DTO.UsuarioNewDTO;
import praticaSpring.guilherme.domain.Usuario;
import praticaSpring.guilherme.repositories.UsuarioRepository;
import praticaSpring.guilherme.services.exceptions.DataIntegrityException;
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
    @Transactional
    public Usuario insert(UsuarioNewDTO objDto) {
        Usuario usu  = new Usuario();
        usu = this.fromDTO(objDto);
        return repo.save(usu);
    }
    public Usuario fromDTO(UsuarioNewDTO objDto){
        Usuario usuario = new Usuario(null, objDto.getName(), objDto.getEmail());
        return usuario;
    }

    public void delete(Integer id) {
        find(id);
        try {
            repo.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DataIntegrityException("Não e possivel excluir");
        }
    }
}




