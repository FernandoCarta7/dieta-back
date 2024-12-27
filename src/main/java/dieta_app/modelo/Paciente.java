package dieta_app.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int usuarioid;
    private double peso;
    private double altura;
    private String antecedentes_medicos;
    private LocalDate fecha_nacimiento;
    private String genero;

    public Paciente() {
    }

    public Paciente(int id, int usuarioid, double peso, double altura, String antecedentes_medicos, LocalDate fecha_nacimiento, String genero) {
        this.id = id;
        this.usuarioid = usuarioid;
        this.peso = peso;
        this.altura = altura;
        this.antecedentes_medicos = antecedentes_medicos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.genero = genero;
    }

    public Paciente(Paciente paciente) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getusuarioid() {
        return usuarioid;
    }

    public void setusuarioid(int usuarioid) {
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
