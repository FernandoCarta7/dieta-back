package dieta_app.repositorio;

import dieta_app.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {

}
