package praticaSpring.guilherme.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import praticaSpring.guilherme.domain.Postagem;
import praticaSpring.guilherme.domain.Usuario;
import praticaSpring.guilherme.services.PostagemService;

import java.util.List;

@RestController
@RequestMapping(value = "/postagem")
public class PostagemResource {


    @Autowired
    PostagemService service;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Postagem> find(@PathVariable Integer id) {
        Postagem obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }
    @GetMapping
    public ResponseEntity<List<Postagem>>findAll(){
        List<Postagem> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }


}
