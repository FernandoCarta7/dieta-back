package dieta_app.repositorio;

import dieta_app.modelo.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitaRepositorio extends JpaRepository<Cita, Integer> {
}
