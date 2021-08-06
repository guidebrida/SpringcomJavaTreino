package praticaSpring.guilherme.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import praticaSpring.guilherme.domain.Usuario;
import praticaSpring.guilherme.services.UsuarioService;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

    @Autowired
    UsuarioService service;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Usuario> find(@PathVariable Integer id) {
        Usuario obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }
    @GetMapping
    public ResponseEntity<List<Usuario>>findAll(){
        List<Usuario> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }


}
