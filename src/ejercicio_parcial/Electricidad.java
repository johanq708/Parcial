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
public class Electricidad extends Sensor{
    private int ele;

    public Electricidad(int ele, String marca, String ref, String fechaIS) {
        super(marca, ref, fechaIS);
        this.ele = ele;
    }

    public int getEle() {
        return ele;
    }
    
}
