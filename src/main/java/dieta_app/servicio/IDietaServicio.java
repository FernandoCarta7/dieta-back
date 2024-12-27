package dieta_app.servicio;

import dieta_app.modelo.Dieta;

import java.util.List;

public interface IDietaServicio {
    public List<Dieta> listar();

    public Dieta buscarPorId(Integer idDieta);

    public Dieta guardar(Dieta Dieta);

    public void eliminarPorId(Integer idDieta);
}
