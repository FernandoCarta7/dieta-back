package dieta_app.servicio;

import dieta_app.modelo.ProgresoPaciente;

import java.util.List;

public interface IProgresoPaciente {

    public List<ProgresoPaciente> listar();

    public ProgresoPaciente buscarPorId(Integer idProgresoPaciente);

    public ProgresoPaciente guardar(ProgresoPaciente ProgresoPaciente);

    public void eliminarPorId(Integer idProgresoPaciente);
    
}
