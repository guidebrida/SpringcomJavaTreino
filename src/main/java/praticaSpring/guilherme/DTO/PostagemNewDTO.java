package praticaSpring.guilherme.DTO;

import java.io.Serializable;
import java.time.LocalDateTime;

public class PostagemNewDTO implements Serializable {
    private static final long serialVersionUID = 1L;


    private String titulo;
    private LocalDateTime instante;
    private Integer usuarioId;
    private String body;

    public PostagemNewDTO() {
    }

    public PostagemNewDTO(String titulo,Integer usuarioId, String body) {
        this.titulo = titulo;
        this.usuarioId = usuarioId;
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

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
