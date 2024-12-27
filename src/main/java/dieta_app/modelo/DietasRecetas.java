package dieta_app.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dietas_recetas")
public class DietasRecetas {

    private int id;
    private int dieta_id;
    private int receta_id;
    private int porciones_recomendadas;
}
