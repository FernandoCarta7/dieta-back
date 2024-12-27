package dieta_app.servicio;

import dieta_app.modelo.DietasRecetas;

import java.util.List;

public interface IDietasRecetasServicio {

    public List<DietasRecetas> listar();

    public DietasRecetas buscarPorId(Integer idDietasRecetas);

    public DietasRecetas guardar(DietasRecetas DietasRecetas);

    public void eliminarPorId(Integer idDietasRecetas);
    
}
