package dieta_app.repositorio;

import dieta_app.modelo.Paciente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepositorio extends JpaRepository<Paciente, Integer> {

    Paciente findByusuarioid ( int usuarioid );
    Page<Paciente> findByPrimerNombreAndPrimerApellido(Pageable pageable, String primerNombre, String primerApellido);
    Page<Paciente> findByPrimerNombreOrderByPrimerApellido(Pageable pageable, String primerNombre);

}
