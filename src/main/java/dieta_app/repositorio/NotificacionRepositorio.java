package dieta_app.repositorio;

import dieta_app.modelo.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificacionRepositorio extends JpaRepository<Notificacion, Integer> {
}
