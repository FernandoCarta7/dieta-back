package dieta_app.servicio;

import dieta_app.modelo.Paciente;
import dieta_app.modelo.Usuario;

import java.util.List;

public interface IPacienteServicio {
    public List<Paciente> listar();

    public Paciente buscarPorId(Integer idPaciente);

    public Paciente guardar(Paciente Paciente, int idUsuario);

    public void eliminarPorId(Integer idPaciente);
    public Paciente obtenerPorUsuarioId(int usuarioid );
}
