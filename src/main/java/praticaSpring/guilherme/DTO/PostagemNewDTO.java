package praticaSpring.guilherme.DTO;

import java.io.Serializable;
import java.time.LocalDateTime;

public class PostagemNewDTO implements Serializable {
    private static final long serialVersionUID = 1L;


    private String titulo;
    private LocalDateTime instante;

    private String body;

    public PostagemNewDTO() {
    }

    public PostagemNewDTO(String titulo, String body) {
        this.titulo = titulo;
        this.instante = LocalDateTime.now();
        this.body = body;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getInstante() {
        return instante;
    }

    public void setInstante(LocalDateTime instante) {
        this.instante = instante;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
