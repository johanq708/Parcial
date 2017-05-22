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
public class Temperatura extends Sensor{
    private int grados;

    public Temperatura(int grados, String marca, String ref, String fechaIS) {
        super(marca, ref, fechaIS);
        this.grados = grados;
    }

    public int getGrados() {
        return grados;
    }
    
}
