package praticaSpring.guilherme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import praticaSpring.guilherme.DTO.PostagemNewDTO;
import praticaSpring.guilherme.DTO.UsuarioNewDTO;
import praticaSpring.guilherme.domain.Postagem;
import praticaSpring.guilherme.domain.Usuario;
import praticaSpring.guilherme.repositories.PostagemRepository;
import praticaSpring.guilherme.services.exceptions.DataIntegrityException;
import praticaSpring.guilherme.services.exceptions.ObjectNotFoundException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PostagemService {

    @Autowired
    PostagemRepository repo;

    @Autowired
    UsuarioService usuarioService;

    public Postagem find(Integer id) {
        Optional<Postagem> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Equipamento não encontrado! Tipo: "));
    }

    public List<Postagem> findAll() {
        return repo.findAll();
    }

    @Transactional
    public Postagem insert(Postagem postagem) {
        postagem = repo.save(postagem);
        return postagem;
    }

    public Postagem fromDTO(PostagemNewDTO objDto) {
        return fromDTO(null, objDto);
    }


    public Postagem fromDTO(Postagem postagem, PostagemNewDTO objDTO){
        Usuario usuario = usuarioService.find(objDTO.getUsuarioId());
        if (postagem == null){
            postagem = new Postagem(objDTO.getUsuarioId(), objDTO.getTitulo(),objDTO.getBody());
            postagem.setUsuario(usuario);
            objDTO.setUsuarioId(postagem.getUsuario().getId());
        }else {
            postagem.setTitulo(objDTO.getTitulo());
            postagem.setBody(objDTO.getBody());
            postagem.setInstante(objDTO.getInstante());
        }
        postagem.setInstante(LocalDateTime.now());
        repo.save(postagem);
        return postagem;

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





