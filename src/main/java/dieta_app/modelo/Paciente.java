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
    private String primerNombre;
    private String primerApellido;
    private String segundoNombre;
    private String segundoApellido;
    private String antecedentesMedicos;
    private LocalDate fechaNacimiento;
    private String genero;


    public  Paciente (Paciente paciente){
        this.id = paciente.getId();
        this.usuarioid = paciente.getUsuarioid();

        this.peso = paciente.getPeso();
        this.altura = paciente.getAltura();

        this.primerApellido = paciente.primerApellido;
        this.segundoApellido = paciente.getsegundoApellido();

        this.primerNombre = paciente.getprimerNombre();
        this.segundoNombre = paciente.getsegundoNombre();

        this.antecedentesMedicos = paciente.getantecedentesMedicos();
        this.fechaNacimiento = paciente.getfechaNacimiento();
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

    public String getprimerNombre() {
        return primerNombre;
    }

    public void setprimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getprimerApellido() {
        return primerApellido;
    }

    public void setprimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getsegundoNombre() {
        return segundoNombre;
    }

    public void setsegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getsegundoApellido() {
        return segundoApellido;
    }

    public void setsegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getantecedentesMedicos() {
        return antecedentesMedicos;
    }

    public void setantecedentesMedicos(String antecedentesMedicos) {
        this.antecedentesMedicos = antecedentesMedicos;
    }

    public LocalDate getfechaNacimiento() {
        return fechaNacimiento;
    }

    public void setfechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
