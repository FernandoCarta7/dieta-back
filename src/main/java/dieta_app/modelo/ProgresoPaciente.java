package dieta_app.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "progreso_paciente")
public class ProgresoPaciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int paciente_id;
    private LocalDate fecha;
    private double peso;
    private double imc;

}
