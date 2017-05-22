/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_parcial;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Ciudad {
    private String nombre;
    private ArrayList <Estacion> estaciones;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.estaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    }
    
    public void addEstacion(Estacion estacion){
        this.estaciones.add(estacion);
    }
}
