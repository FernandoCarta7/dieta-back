package dieta_app.repositorio;

import dieta_app.modelo.Receta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecetaRepositorio extends JpaRepository<Receta, Integer> {
}
