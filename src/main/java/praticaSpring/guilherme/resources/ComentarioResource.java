package praticaSpring.guilherme.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import praticaSpring.guilherme.domain.Comentario;
import praticaSpring.guilherme.domain.Usuario;
import praticaSpring.guilherme.services.ComentarioService;


import java.util.List;

@RestController
@RequestMapping(value = "/comentarios")
public class ComentarioResource {

    @Autowired
    ComentarioService service;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Comentario> find(@PathVariable Integer id) {
        Comentario obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }
    @GetMapping
    public ResponseEntity<List<Comentario>>findAll(){
        List<Comentario> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

}
