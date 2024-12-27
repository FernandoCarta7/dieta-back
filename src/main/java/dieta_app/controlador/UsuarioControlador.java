package dieta_app.controlador;

import dieta_app.modelo.Usuario;
import dieta_app.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dieta-app")
@CrossOrigin(value = "http://localhost:4200")
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;
/*
    @GetMapping("/usuarios")
    public List<Usuario> getNombres(){
        var listaUsuarios = usuarioServicio.listar();
        listaUsuarios.sort((a,b) -> Integer.compare(b.getId(), a.getId()));
        return listaUsuarios;
    }*/
    @GetMapping("/usuarios-pageable")
    public Page<Usuario> getUsuarios(@RequestParam(defaultValue = "0") int page,
                                    @RequestParam(defaultValue = "10") int size){

        return usuarioServicio.listar(PageRequest.of(page, size));
    }

}
