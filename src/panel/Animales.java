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
public class Animales implements Serializable{
    private String especie;
    private String subespecie;
    private float peso;
    private String name;

    public Animales(String especie, String subespecie, float peso, String name) {
        this.especie = especie;
        this.subespecie = subespecie;
        this.peso = peso;
        this.name = name;
    }

    
    
    
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSubespecie() {
        return subespecie;
    }

    public void setSubespecie(String subespecie) {
        this.subespecie = subespecie;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
