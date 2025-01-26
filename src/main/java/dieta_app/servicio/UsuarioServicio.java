package dieta_app.servicio;

import dieta_app.modelo.Paciente;
import dieta_app.modelo.Usuario;
import dieta_app.repositorio.PacienteRepositorio;
import dieta_app.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServicio implements IUsuarioServicio{

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    @Autowired
    PacienteRepositorio pacienteRepositorio;

    @Override
    public List<Usuario> listar() {
        return usuarioRepositorio.findAll();
    }

    @Override
    public Usuario buscarPorId(Integer idUsuario) {
        return usuarioRepositorio.findById(idUsuario).orElse(null);
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public void eliminarPorId(Integer usuarioid) {
        Paciente pacienteEliminar = pacienteRepositorio.findByusuarioid(usuarioid);
        if (pacienteEliminar != null) {
            pacienteRepositorio.deleteById(pacienteEliminar.getId());
        }

        usuarioRepositorio.deleteById(usuarioid);
    }


    public Page<Usuario> listar(Pageable pageable){

        return usuarioRepositorio.findAll(pageable).map(usuario -> new Usuario(usuario));

    }
    public Usuario getLastUser(){
        var listaUsuario = usuarioRepositorio.findAll();
        var lastUser = listaUsuario.getLast();
        return lastUser;
    }




}
