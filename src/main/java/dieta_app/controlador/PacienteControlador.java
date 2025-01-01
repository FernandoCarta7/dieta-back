package dieta_app.controlador;

import dieta_app.modelo.Paciente;
import dieta_app.servicio.PacienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("dieta-app")
@CrossOrigin(value = "http://localhost:4200")
public class PacienteControlador {

    @Autowired
    private PacienteServicio pacienteServicio;

    private static final Logger logger =
            LoggerFactory.getLogger(PacienteControlador.class);
/*
    @GetMapping("/pacientes")
    public Page<Paciente> getPacientes(@RequestParam(defaultValue = "0") int page,
                                       @RequestParam(defaultValue = "10") int size){

        return pacienteServicio.listar(PageRequest.of(page, size));
    }*/

    @GetMapping("/pacientes")
    public List<Paciente> getPacientes(){
        

        return pacienteServicio.listar();
    }

    @PostMapping("/paciente/agregar-paciente/{idUsuario}")
    public Paciente agregarPaciente(@RequestBody Paciente paciente, @PathVariable int idUsuario){
        logger.info("Agregando paciente");

        return pacienteServicio.guardar(paciente, idUsuario);
    }

}
