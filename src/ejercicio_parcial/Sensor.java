/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_parcial;

/**
 *
 * @author Estudiante
 */
public abstract class Sensor {
    protected String marca;
    protected String ref;
    protected String fechaIS;

    public Sensor(String marca, String ref, String fechaIS) {
        this.marca = marca;
        this.ref = ref;
        this.fechaIS = fechaIS;
    }

    public String getMarca() {
        return marca;
    }

    public String getRef() {
        return ref;
    }

    public String getFechaIS() {
        return fechaIS;
    }
    
}
