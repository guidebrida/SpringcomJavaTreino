package praticaSpring.guilherme.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import praticaSpring.guilherme.domain.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Integer> {
}
