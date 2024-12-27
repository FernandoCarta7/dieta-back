package dieta_app.servicio;

import dieta_app.modelo.Cita;

import java.util.List;

public interface ICitaServicio {

    public List<Cita> listarCitas();

    public Cita buscarCitaPorId(Integer idCita);

    public Cita guardarCita(Cita cita);

    public void eliminarCitaPorId(Integer idCita);
    
    
}
