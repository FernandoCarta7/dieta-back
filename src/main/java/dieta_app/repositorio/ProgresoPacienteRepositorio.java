package dieta_app.repositorio;

import dieta_app.modelo.ProgresoPaciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgresoPacienteRepositorio extends JpaRepository<ProgresoPaciente, Integer> {
}
