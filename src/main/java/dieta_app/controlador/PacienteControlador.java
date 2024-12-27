package dieta_app.controlador;

import dieta_app.modelo.Paciente;
import dieta_app.modelo.Usuario;
import dieta_app.servicio.PacienteServicio;
import dieta_app.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("dieta-app")
@CrossOrigin(value = "http://localhost:4200")
public class PacienteControlador {

    @Autowired
    private PacienteServicio pacienteServicio;
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


/*
    @PostMapping("/guardar-pacientes")
    public Paciente agregarPacientes(){


        this.usuaroServicio.eliminarTODO();

        List<String> nombresMasculino = Arrays.asList(
                "Juan", "Jose", "Carlos", "Luis", "Miguel", "Pedro", "Jorge", "Ricardo",
                "Francisco", "Daniel", "Andres", "Fernando", "Eduardo", "Santiago", "Alejandro",
                "Roberto", "Manuel", "Diego", "Adrian", "Antonio", "angel", "Rafael",
                "David", "Victor", "Cristian", "Martin", "Ivan", "Alberto", "Pablo",
                "Tomas", "Hector", "Javier", "Gabriel", "Ramon", "Felipe", "Ruben",
                "Nicolas", "Emilio", "Jaime", "alvaro", "Hugo", "Rodrigo", "Sebastian",
                "Guillermo", "Bruno", "Mario", "Samuel", "Enrique", "Mateo", "Simon"
        );
        List<String> nombresFemeninos = Arrays.asList(
                "Maria", "Ana", "Laura", "Carmen", "Isabella", "Sofia", "Lucia", "Gabriela",
                "Marta", "Patricia", "Elena", "Jessica", "Carla", "Claudia", "Fernanda",
                "Andrea", "Silvia", "Sara", "Raquel", "Paola", "Veronica", "Teresa",
                "Lourdes", "Victoria", "Adriana", "Natalia", "Rebeca", "Beatriz", "Vanessa",
                "Lorena", "angela", "Evelyn", "Diana", "Renata", "Florencia", "Alma",
                "Mariana", "Veronica", "Monica", "Ximena", "Jimena", "Juliana", "Rosa",
                "Santiago", "Elsa", "Ines", "Nora", "Vera", "Gina", "Lidia", "Marcela"
        );
        List<String> apellidos = Arrays.asList(
                "Gonzalez", "Rodriguez", "Lopez", "Martinez", "Hernandez", "Perez",
                "Sanchez", "Ramirez", "Torres", "Gomez", "Diaz", "Vazquez", "alvarez",
                "Morales", "Jimenez", "Mendoza", "Ruiz", "Castro", "Rios", "Gutierrez",
                "Chavez", "Serrano", "Fernandez", "Vega", "Jimenez", "Paredes", "Moreno",
                "Muñoz", "Villarreal", "Salazar", "Ramirez", "Reyes", "Flores", "Navarro",
                "Ortega", "Santos", "Cabrera", "Carrillo", "Marquez", "Suarez", "Jimenez",
                "Silva", "Rangel", "Cordoba", "Luna", "Zapata", "Lima", "Cordoba", "Estrada"
        );
        List<String> extensionesCorreos = Arrays.asList(
                "@gmail.com", "@yahoo.com", "@hotmail.com", "@outlook.com", "@aol.com"
        );
        List<String> condicionesMedicas = new ArrayList<>();

        condicionesMedicas.add("Diabetes");
        condicionesMedicas.add("Hipertensión (presión arterial alta)");
        condicionesMedicas.add("Asma");
        condicionesMedicas.add("Artritis");
        condicionesMedicas.add("Enfermedad coronaria");
        condicionesMedicas.add("Depresión");
        condicionesMedicas.add("Hipotiroidismo");
        condicionesMedicas.add("Enfermedad pulmonar obstructiva crónica (EPOC)");



        String nombre = "", apellido = "", email = "", contrasena = "", rol = "";
        double peso, altura;

        String antecedentes_medicos = "", genero = "";
        LocalDate fecha_nacimiento;

        Usuario usuario;



        Paciente paciente;
        PacienteServicio pacienteServicio;


        int year = 0, month = 0 , day = 0;

        List<Paciente> pacienteList = new ArrayList<>();
        List<Usuario> usuarios = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 345; i++) {
            nombre = "";
            apellido = "";


            int aleatorio = random.nextInt(0,nombresMasculino.size());
            nombre = nombresMasculino.get(aleatorio);

            aleatorio = random.nextInt(0,apellidos.size());
            apellido = apellidos.get(aleatorio);

            //System.out.println("Nombre: " + nombre + " Apellido: " + apellido);

            aleatorio = random.nextInt(0,extensionesCorreos.size());
            email = nombre + apellido + random.nextInt(1111 + 99999) + extensionesCorreos.get(aleatorio);
            //System.out.println("Email: " + email);

            aleatorio = random.nextInt(0,apellidos.size());
            apellido = apellido + " " + apellidos.get(aleatorio);
            nombre = nombre + " " + nombresMasculino.get(aleatorio) + " " + apellido;
            rol = "PACIENTE";
            genero = "MASCULINO";

            usuario = new Usuario(nombre.toUpperCase(),email.toUpperCase(),"123456789",rol.toUpperCase());
            usuarios.add(usuario);
        }
        for (int i = 0; i < 371; i++) {
            nombre = "";
            apellido = "";
            random = new Random();

            int aleatorio = random.nextInt(0,nombresFemeninos.size());
            nombre = nombresFemeninos.get(aleatorio);

            aleatorio = random.nextInt(0,apellidos.size());
            apellido = apellidos.get(aleatorio);

            //System.out.println("Nombre: " + nombre + " Apellido: " + apellido);

            aleatorio = random.nextInt(0,extensionesCorreos.size());
            email = nombre + apellido + random.nextInt(1111,9999) + extensionesCorreos.get(aleatorio);
            //System.out.println("Email: " + email);

            aleatorio = random.nextInt(0,apellidos.size());
            apellido = apellido + " " + apellidos.get(aleatorio);
            nombre = nombre + " " + nombresFemeninos.get(aleatorio) + " " + apellido;
            rol = "PACIENTE";
            genero = "FEMENINO";

            usuario = new Usuario(nombre.toUpperCase(),email.toUpperCase(),"123456789",rol.toUpperCase());
            usuarios.add(usuario);
        }

        for (int i = 0; i < usuarios.size(); i++) {
            usuaroServicio.guardar(usuarios.get(i));
        }
        usuarios = new ArrayList<>();
        usuarios = usuaroServicio.listar();

        for (int i = 0; i < usuarios.size(); i++) {



            peso = random.nextDouble( 50, 175 );
            altura = random.nextDouble(150, 210);
            if (random.nextInt(0,100) % 7 == 0) {

                antecedentes_medicos = condicionesMedicas.get(random.nextInt(0, condicionesMedicas.size()));
            }else {
                antecedentes_medicos = "No tiene";
            }
            year = random.nextInt(1955, 2000);
            month = random.nextInt(1,12);
            day = random.nextInt(1,28);
            fecha_nacimiento = LocalDate.of(year,month,day);
            if (i > 345){
                genero = "FEMENINO";
            }else {
                genero = "MASCULINO";
            }
            paciente = new Paciente(usuarios.get(i).getId(),peso,altura,antecedentes_medicos,fecha_nacimiento,genero);
            this.pacienteServicio.guardar(paciente);


            pacienteList.add(paciente);



        }









        return null;
    }
*/

}
