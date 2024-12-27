package dieta_app.servicio;

import dieta_app.modelo.Paciente;
import dieta_app.repositorio.PacienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;


import java.util.List;

@Service
public class  PacienteServicio implements IPacienteServicio{

    @Autowired
    private PacienteRepositorio pacienteRepositorio;


    @Override
    public List<Paciente> listar() {
        return pacienteRepositorio.findAll();
    }

    @Override
    public Paciente buscarPorId(Integer idPaciente) {
        return pacienteRepositorio.findById(idPaciente).orElse(null);
    }

    @Override
    public Paciente guardar(Paciente paciente) {
        return pacienteRepositorio.save(paciente);
    }

    @Override
    public void eliminarPorId(Integer idPaciente) {
        pacienteRepositorio.deleteById(idPaciente);
    }
}
