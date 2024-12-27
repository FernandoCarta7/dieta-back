package dieta_app.repositorio;

import dieta_app.modelo.Dieta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DietaRepositorio extends JpaRepository<Dieta, Integer> {
}
