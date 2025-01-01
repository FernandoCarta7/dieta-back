package dieta_app.repositorio;

import dieta_app.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
    @Query("SELECT u FROM Usuario u ORDER BY u.id DESC")
    List<Usuario> findTopByOrderByIdDesc();
}
