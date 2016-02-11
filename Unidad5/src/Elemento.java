/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wanaldino
 */
public class Elemento {

    private String nombre;
    private int posicion = 0;

    public Elemento(String nombre) {
        this.nombre = nombre;
        Ejercicio3static.cantidad();
    }

    public int getposicion() {
        return this.posicion;
    }

}
