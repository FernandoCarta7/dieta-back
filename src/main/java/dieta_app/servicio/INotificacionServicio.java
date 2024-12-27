package dieta_app.servicio;

import dieta_app.modelo.Notificacion;

import java.util.List;

public interface INotificacionServicio {

    public List<Notificacion> listar();

    public Notificacion buscarPorId(Integer idNotificacion);

    public Notificacion guardar(Notificacion Notificacion);

    public void eliminarPorId(Integer idNotificacion);

}
