/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto;

/**
 *
 * @author mati
 */
public class distanciaALoRIGEN {

    public static void main(String[] args) {
        Punto origen = new Punto(0, 0);
        Punto p = new Punto(4, 3);
        System.out.println("Distancia de p al origen " + p.distancia(origen));
    }
}
