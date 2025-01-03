package dieta_app.modelo;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String contrasena;
    private String rol;

    public Usuario(Usuario usuario){
        this.id = usuario.getId();
        this.email = usuario.getEmail();
        this.rol = usuario.getRol();
        this.contrasena = null;
    }

    /*public Usuario(int id, String email, String contrasena, String rol) {
        this.id = id;
        this.email = email;
        this.contrasena = contrasena;
        this.rol = rol;
    }*/

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
