package dieta_app.controlador;

import dieta_app.modelo.Usuario;
import dieta_app.servicio.UsuarioServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("dieta-app")
@CrossOrigin(value = "http://localhost:4200")
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    private static final Logger logger =
            LoggerFactory.getLogger(UsuarioControlador.class);
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


    @GetMapping("/pacientes-pageable")
    public Page<Usuario> getPacientesPageable(@RequestParam(defaultValue = "0") int page,
                                     @RequestParam(defaultValue = "10") int size){

        return usuarioServicio.listar(PageRequest.of(page, size));
    }


    @DeleteMapping("/usuario/delete/{id}")
    public ResponseEntity<Map<String, Boolean>> eliminarUsuario(@PathVariable int id){
        Usuario usuario = usuarioServicio.buscarPorId(id);

        if (usuario == null) {
            System.out.println("--------------------USUARIO NO ENCONTRADO--------------------");
        }
        this.usuarioServicio.eliminarPorId(id);

        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminado", Boolean.TRUE);

        return  ResponseEntity.ok(respuesta);
    }

    @PostMapping("/usuario/agregar")
    public Usuario agregarUsuario(@RequestBody Usuario usuario){
        logger.info("Usuario a agregar: " + usuario);

        return usuarioServicio.guardar(usuario);
    }


}
