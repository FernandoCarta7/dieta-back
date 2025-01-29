package dieta_app.servicio;

import dieta_app.modelo.Paciente;
import dieta_app.repositorio.PacienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


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
        Paciente pacienteGuardar = new Paciente();

        pacienteGuardar.setId(paciente.getId());
        pacienteGuardar.setprimerNombre(paciente.getprimerNombre().toUpperCase());
        pacienteGuardar.setsegundoNombre(paciente.getsegundoNombre().toUpperCase());
        pacienteGuardar.setprimerApellido(paciente.getprimerApellido().toUpperCase());
        pacienteGuardar.setsegundoApellido(paciente.getsegundoApellido().toUpperCase());
        pacienteGuardar.setUsuarioid(paciente.getUsuarioid());
        pacienteGuardar.setfechaNacimiento(paciente.getfechaNacimiento());
        pacienteGuardar.setPeso(paciente.getPeso());
        pacienteGuardar.setGenero(paciente.getGenero().toUpperCase());
        pacienteGuardar.setantecedentesMedicos(paciente.getantecedentesMedicos().toLowerCase());
        pacienteGuardar.setAltura(paciente.getAltura());


        return pacienteRepositorio.save(pacienteGuardar);
    }

    @Override
    public void eliminarPorId(Integer idPaciente) {

        pacienteRepositorio.deleteById(idPaciente);
    }

    @Override
    public Paciente obtenerPorUsuarioId(int usuarioid) {
        return pacienteRepositorio.findByusuarioid(usuarioid);
    }

    public Page<Paciente> listar(Pageable pageable){
        return pacienteRepositorio.findAll(pageable).map( paciente -> new Paciente(paciente) );
    }

    public Page<Paciente> filtrarPacientesNombre(Pageable pageable, String primerNombre){
        //var listaPacientesFiltrada = pacienteRepositorio.findByPrimerNombreOrderByPrimerApellido(pageable,primerNombre).map(paciente -> new Paciente(paciente));
        Page<Paciente> listaPacientesFiltrada = null;
        listaPacientesFiltrada = pacienteRepositorio.findByPrimerNombreOrderByPrimerApellido(pageable,primerNombre).map(paciente -> new Paciente(paciente));
        return listaPacientesFiltrada;
    }


    public Page<Paciente> filtrarPacientesApellido(Pageable pageable, String apellido){
        //var listaPacientesFiltrada = pacienteRepositorio.findByPrimerNombreOrderByPrimerApellido(pageable,primerNombre).map(paciente -> new Paciente(paciente));
        Page<Paciente> listaPacientesFiltrada = null;
        listaPacientesFiltrada = pacienteRepositorio.findByPrimerApellidoOrderByPrimerNombre(pageable,apellido).map(paciente -> new Paciente(paciente));
        return listaPacientesFiltrada;
    }
}
