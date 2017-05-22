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
public class Lluvia extends Sensor{
    private int mm;

    public Lluvia(int mm, String marca, String ref, String fechaIS) {
        super(marca, ref, fechaIS);
        this.mm = mm;
    }

    public int getMm() {
        return mm;
    }
    
}
