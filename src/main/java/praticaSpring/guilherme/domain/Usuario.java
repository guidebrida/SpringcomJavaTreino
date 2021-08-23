package praticaSpring.guilherme.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Usuario  implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "usuario")
    private List<Postagem> Postagem = new ArrayList<>();

    @OneToMany( mappedBy = "usuario")
    private List<Comentario> Comentario = new ArrayList<>();

    public Usuario() {
    }
    public Usuario(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public List<praticaSpring.guilherme.domain.Postagem> getPostagem() {
        return Postagem;
    }

    public void setPostagem(List<praticaSpring.guilherme.domain.Postagem> postagem) {
        Postagem = postagem;
    }

    public List<praticaSpring.guilherme.domain.Comentario> getComentario() {
        return Comentario;
    }

    public void setComentario(List<praticaSpring.guilherme.domain.Comentario> comentario) {
        Comentario = comentario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
