/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panel;

import java.io.Serializable;

/**
 *
 * @author Cristian
 */
public class Cuidadores implements Serializable{
    private String nombre;
    private int idCuidador;
    private String apellidos;
    Especialidad especialidad;
    private Animales animalCuidado;

    public Cuidadores(String nombre, int idCuidador, String apellidos, Especialidad especialidad, Animales animalCuidado) {
        this.nombre = nombre;
        this.idCuidador = idCuidador;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.animalCuidado= animalCuidado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCuidador() {
        return idCuidador;
    }

    public void setIdCuidador(int idCuidador) {
        this.idCuidador = idCuidador;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Animales getAnimalCuidado() {
        return animalCuidado;
    }

    public void setAnimalCuidado(Animales animalCuidado) {
        this.animalCuidado = animalCuidado;
    }
    
    
    
    
}
