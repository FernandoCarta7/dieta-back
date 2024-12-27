package dieta_app.servicio;

import dieta_app.modelo.Paciente;

import java.util.List;

public interface IPacienteServicio {
    public List<Paciente> listar();

    public Paciente buscarPorId(Integer idPaciente);

    public Paciente guardar(Paciente Paciente);

    public void eliminarPorId(Integer idPaciente);
}
