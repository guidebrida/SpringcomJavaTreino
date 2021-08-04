package praticaSpring.guilherme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import praticaSpring.guilherme.domain.Usuario;
import praticaSpring.guilherme.repositories.UsuarioRepository;

import java.text.ParseException;
import java.util.Arrays;

@Service
public class DBservice {

    @Autowired
    UsuarioRepository usuarioRepository;

    public void instantiateTestDatabase() throws ParseException {

        Usuario usuario1 = new Usuario(null, "Guilherme", "Guilherme@gmail.com");
        Usuario usuario2 = new Usuario(null, "mario", "mario@gmail.com");
        Usuario usuario3 = new Usuario(null, "João", "joao@gmail.com");


        usuarioRepository.saveAll(Arrays.asList(usuario1, usuario2, usuario3));
    }
}
