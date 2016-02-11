/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wanaldino
 */
public class Ejercicio2static {

    public static void main(String[] args) {
        punto origen = new punto();
        punto punto1 = new punto(3, 4);
        punto punto2 = new punto(0, 4);
        punto punto3 = new punto(2, -1);

        System.out.println("Distancia del primer punto: " + punto.distanciaorigen(punto1.getx(), punto1.gety())
                + "\nDistancia del segundo punto: " + punto.distanciaorigen(punto2.getx(), punto2.gety())
                + "\nDistancia del tercer punto: " + punto.distanciaorigen(punto3.getx(), punto3.gety()));

    }
}
