package dieta_app.servicio;

import dieta_app.modelo.Receta;

import java.util.List;

public interface IRecetaServicio {

    public List<Receta> listar();

    public Receta buscarPorId(Integer idReceta);

    public Receta guardar(Receta Receta);

    public void eliminarPorId(Integer idReceta);

}
