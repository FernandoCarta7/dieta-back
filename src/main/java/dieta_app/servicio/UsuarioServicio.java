package dieta_app.servicio;

import dieta_app.modelo.Usuario;
import dieta_app.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio implements IUsuarioServicio{

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

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
    public void eliminarPorId(Integer idUsuario) {
        usuarioRepositorio.deleteById(idUsuario);
    }

    public Page<Usuario> listar(Pageable pageable){

        return usuarioRepositorio.findAll(pageable).map(usuario -> new Usuario(usuario));



        /*var lista2 = usuarioRepositorio.findAll();
        Page page = new PageImpl(lista2);
        page.map(usuario -> new Usuario());
        return page;*/
    }

}
