/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wanaldino
 */
public class Ejercicio3static {

    static int cantidad = 0;

    public static void cantidad() {

        cantidad++;

    }

    public static void main(String[] args) {

        Elemento elemento1 = new Elemento("Telefono");
        Elemento elemento2 = new Elemento("Casa");
        Elemento elemento3 = new Elemento("Dado");

        System.out.println("Cantidad: " + cantidad);

    }
}
