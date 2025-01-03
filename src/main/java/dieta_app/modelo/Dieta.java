package dieta_app.modelo;

import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "dieta")
public class Dieta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int paciente_id;
    private String nombre;
    private String descripcion;
    private String periocidad;
}
