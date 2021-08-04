package praticaSpring.guilherme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import praticaSpring.guilherme.domain.Postagem;
import praticaSpring.guilherme.domain.Usuario;
import praticaSpring.guilherme.repositories.PostagemRepository;
import praticaSpring.guilherme.repositories.UsuarioRepository;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.Arrays;

@Service
public class DBservice {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PostagemRepository postagemRepository;

    public void instantiateTestDatabase() throws ParseException {

        Usuario usuario1 = new Usuario(null, "Guilherme", "Guilherme@gmail.com");
        Usuario usuario2 = new Usuario(null, "mario", "mario@gmail.com");
        Usuario usuario3 = new Usuario(null, "João", "joao@gmail.com");

        Postagem postagem1 = new Postagem(null,"porta", "title");
        Postagem postagem2 = new Postagem(null, "pneu", "titatata");


        usuarioRepository.saveAll(Arrays.asList(usuario1, usuario2, usuario3));
        postagemRepository.saveAll(Arrays.asList(postagem1, postagem2));
    }
}
