/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wanaldino
 */
public class item {

    private String nombre;
    private int id;

    public item(String nombre) {
        this.nombre = nombre;
        this.id = Ejercicio4static.sumaid();
    }

    public String getnombre() {
        return this.nombre;
    }

    public int getid() {
        return this.id;
    }

}
