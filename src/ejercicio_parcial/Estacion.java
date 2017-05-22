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
public class Estacion{
    private String nombreE;
    private String ubicacion;
    private String fechaIE;
    private ArrayList<Registro> registros; 

    public Estacion(String nombreE, String ubicacion, String fechaIE) {
        this.nombreE = nombreE;
        this.ubicacion = ubicacion;
        this.fechaIE = fechaIE;
        this.registros = new ArrayList<>();
    }

    public String getNombreE() {
        return nombreE;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getFechaIE() {
        return fechaIE;
    }

    public ArrayList<Registro> getRegistros() {
        return registros;
    }
    
    public void addRegistro(Registro registro){
        this.registros.add(registro);
    }
}
