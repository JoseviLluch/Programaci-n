/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wanaldino
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        punto punto1 = new punto(0, 0);
        punto punto2 = new punto(5, 3);
        punto punto3 = new punto(2, -1);
        punto punto4 = new punto((punto2.getx() + punto3.getx()) / 2, (punto2.gety() + punto3.gety()) / 2);

        punto punto5 = new punto(4, 3);

        System.out.println("Distancia: " + punto.distanciaorigen(punto5.getx(), punto5.gety()));

    }
}
