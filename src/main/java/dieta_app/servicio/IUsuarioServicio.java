package dieta_app.servicio;

import dieta_app.modelo.Usuario;

import java.util.List;

public interface IUsuarioServicio {

    public List<Usuario> listar();

    public Usuario buscarPorId(Integer idUsuario);

    public Usuario guardar(Usuario Usuario);

    public void eliminarPorId(Integer idUsuario);
    
}
