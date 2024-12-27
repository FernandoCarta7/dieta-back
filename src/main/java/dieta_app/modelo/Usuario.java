package dieta_app.modelo;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String email;
    private String contrasena;
    private String rol;

    public Usuario() {
    }

    public Usuario(Usuario usuario) {
        String [] nombres = usuario.getNombre().split(" ");
        this.id = usuario.getId();
        this.nombre = nombres[0] + " " + nombres[2];
        this.email = usuario.getEmail();
        this.rol = usuario.getRol();;
    }
    public Usuario(int id, String nombre, String email, String contrasena, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
