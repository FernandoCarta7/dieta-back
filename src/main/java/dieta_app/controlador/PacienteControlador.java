package dieta_app.controlador;

import dieta_app.modelo.Paciente;
import dieta_app.modelo.Usuario;
import dieta_app.servicio.PacienteServicio;
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
public class PacienteControlador {

    @Autowired
    private PacienteServicio pacienteServicio;
    @Autowired
    private UsuarioServicio usuarioServicio;

    private static final Logger logger =
            LoggerFactory.getLogger(PacienteControlador.class);

    @GetMapping("/pacientes-pageable")
    public Page<Paciente> getPacientes(@RequestParam(defaultValue = "0") int page,
                                       @RequestParam(defaultValue = "10") int size){

        return pacienteServicio.listar(PageRequest.of(page, size));
    }

    @GetMapping("/pacientes")
    public List<Paciente> getPacientes(){
        

        return pacienteServicio.listar();
    }

    @PostMapping("/paciente/agregar-paciente/{idUsuario}")
    public Paciente agregarPaciente(@RequestBody Paciente paciente, @PathVariable int idUsuario){
        logger.info("Agregando paciente");
        paciente.setUsuarioid( idUsuario );
        return pacienteServicio.guardar(paciente);
    }

    @DeleteMapping("/paciente/delete/{id}")
    public ResponseEntity<Map<String, Boolean>> eliminarPaciente(@PathVariable int id){
        Paciente paciente = new Paciente();
        Usuario usuario = new Usuario();
        Map<String, Boolean> respuesta = new HashMap<>();
        paciente = pacienteServicio.buscarPorId(id);

        if (paciente!=null){
            pacienteServicio.eliminarPorId(id);
            usuarioServicio.eliminarPorId(paciente.getUsuarioid());

            respuesta.put("eliminado", Boolean.TRUE);
        }else {
            respuesta.put("No eliminado", Boolean.FALSE);
        }
        return ResponseEntity.ok(respuesta);

    }

    @PutMapping("/paciente/editar/{id}")
    public ResponseEntity<Paciente> actualizarPaciente(@PathVariable int id, @RequestBody Paciente pacienteRecibido){
        Paciente paciente = new Paciente();
        paciente = pacienteServicio.buscarPorId(id);

        if (paciente != null){
            paciente.setAltura(pacienteRecibido.getAltura());
            paciente.setGenero(pacienteRecibido.getGenero());

            paciente.setPeso(pacienteRecibido.getPeso());
            paciente.setFecha_nacimiento(pacienteRecibido.getFecha_nacimiento());

            paciente.setAntecedentes_medicos(pacienteRecibido.getAntecedentes_medicos());

            //APELLIDOS
            paciente.setPrimer_apellido(pacienteRecibido.getPrimer_apellido());
            paciente.setSegundo_apellido(paciente.getSegundo_apellido());
            //NOMBRES
            paciente.setPrimer_nombre(pacienteRecibido.getPrimer_nombre());
            paciente.setSegundo_nombre(pacienteRecibido.getSegundo_nombre());

            paciente.setUsuarioid(paciente.getUsuarioid());

            return ResponseEntity.ok(paciente);
        }else {
            return ResponseEntity.ofNullable(paciente);
        }
    }
    @PutMapping("/editar/paciente/{usuarioid}")
    public ResponseEntity<Paciente> actualizarPaciente(@RequestBody Paciente pacienteRecibido, @PathVariable int usuarioid){
        Paciente paciente = new Paciente();
        paciente = pacienteServicio.obtenerPorUsuarioId(usuarioid);

        if (paciente != null){
            paciente.setAltura(pacienteRecibido.getAltura());
            paciente.setGenero(pacienteRecibido.getGenero());

            paciente.setPeso(pacienteRecibido.getPeso());
            paciente.setFecha_nacimiento(pacienteRecibido.getFecha_nacimiento());

            paciente.setAntecedentes_medicos(pacienteRecibido.getAntecedentes_medicos());

            //APELLIDOS
            paciente.setPrimer_apellido(pacienteRecibido.getPrimer_apellido());
            paciente.setSegundo_apellido(paciente.getSegundo_apellido());
            //NOMBRES
            paciente.setPrimer_nombre(pacienteRecibido.getPrimer_nombre());
            paciente.setSegundo_nombre(pacienteRecibido.getSegundo_nombre());

            paciente.setUsuarioid(paciente.getUsuarioid());

            return ResponseEntity.ok(paciente);
        }else {
            return ResponseEntity.ofNullable(paciente);
        }
    }

    @GetMapping("/paciente/obtenerPacienteIdUsuario/{id_usuario}")
    public Paciente getPacientePorUsuario ( @PathVariable int id_usuario ){
        Paciente paciente = new Paciente();

        paciente = pacienteServicio.obtenerPorUsuarioId(id_usuario);

        return paciente;
    }
}
