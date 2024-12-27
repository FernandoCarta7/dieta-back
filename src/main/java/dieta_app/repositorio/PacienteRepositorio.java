package dieta_app.repositorio;

import dieta_app.modelo.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepositorio extends JpaRepository<Paciente, Integer> {

    Paciente findByusuarioid ( int usuarioid );

}
