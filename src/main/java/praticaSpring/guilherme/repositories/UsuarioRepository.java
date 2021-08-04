package praticaSpring.guilherme.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import praticaSpring.guilherme.domain.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
