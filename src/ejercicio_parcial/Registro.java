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
public class Registro {
    private String fecha;
    private Lluvia lluvias;
    private Temperatura termo;
    private Electricidad electrico;

    public Registro(String fecha, Lluvia lluvias, Temperatura termo, Electricidad electrico) {
        this.fecha = fecha;
        this.lluvias = lluvias;
        this.termo = termo;
        this.electrico = electrico;
    }
    
}
