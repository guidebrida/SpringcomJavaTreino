package praticaSpring.guilherme.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import praticaSpring.guilherme.domain.Postagem;
import praticaSpring.guilherme.domain.Usuario;
import praticaSpring.guilherme.services.PostagemService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/postagens")
public class PostagemResource {


    @Autowired
    PostagemService service;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Postagem> find(@PathVariable Integer id) {
        Postagem obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public ResponseEntity<List<Postagem>> findAll() {
        List<Postagem> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

    @PostMapping
    public ResponseEntity<Usuario> insert(@RequestBody Postagem objDTO) {
        Postagem postagem = service.insert(objDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(postagem.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(value = "/id")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
