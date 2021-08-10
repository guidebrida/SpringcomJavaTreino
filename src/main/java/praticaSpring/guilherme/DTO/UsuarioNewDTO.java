package praticaSpring.guilherme.DTO;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class UsuarioNewDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String email;

    public UsuarioNewDTO() {
    }

    public UsuarioNewDTO(String name, String email) {
        this.name = name;
        this.email = email;
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
}
