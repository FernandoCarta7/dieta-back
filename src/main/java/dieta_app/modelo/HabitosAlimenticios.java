package dieta_app.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "habitos_alimenticios")
public class HabitosAlimenticios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int paciente_id;
    private String descripcion;
    private String imagen_url;
    private LocalDate fecha;

}
