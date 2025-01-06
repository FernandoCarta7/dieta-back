package dieta_app.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int usuarioid;
    private double peso;
    private double altura;
    private String primer_nombre;
    private String primer_apellido;
    private String segundo_nombre;
    private String segundo_apellido;
    private String antecedentes_medicos;
    private LocalDate fecha_nacimiento;
    private String genero;


    public  Paciente (Paciente paciente){
        this.id = paciente.getId();
        this.usuarioid = paciente.getUsuarioid();

        this.peso = paciente.getPeso();
        this.altura = paciente.getAltura();

        this.primer_apellido = paciente.primer_apellido;
        this.segundo_apellido = paciente.getSegundo_apellido();

        this.primer_nombre = paciente.getPrimer_nombre();
        this.segundo_nombre = paciente.getSegundo_nombre();

        this.antecedentes_medicos = paciente.getAntecedentes_medicos();
        this.fecha_nacimiento = paciente.getFecha_nacimiento();
        this.genero = paciente.getGenero();
    }

    public Paciente(){}




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(int usuarioid) {
        this.usuarioid = usuarioid;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getAntecedentes_medicos() {
        return antecedentes_medicos;
    }

    public void setAntecedentes_medicos(String antecedentes_medicos) {
        this.antecedentes_medicos = antecedentes_medicos;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
