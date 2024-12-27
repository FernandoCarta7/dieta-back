package dieta_app.servicio;

import dieta_app.modelo.HabitosAlimenticios;

import java.util.List;

public interface IHabitosAlimenticiosServicio {

    public List<HabitosAlimenticios> listar();

    public HabitosAlimenticios buscarPorId(Integer idHabitosAlimenticios);

    public HabitosAlimenticios guardar(HabitosAlimenticios habitosAlimenticios);

    public void eliminarPorId(Integer idHabitosAlimenticios);
    
}
