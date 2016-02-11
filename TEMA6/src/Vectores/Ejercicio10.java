/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectores;

import java.util.Random;

/**
 *
 * @author mati
 */
public class Ejercicio10 {

    public static void main(String[] args) {

        Random aleatorio = new Random();
        int[] vector = new int[20];
        int contador = 0;

        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 20);
            System.out.println("El elemento: " + (i + 1) + " contiene el valor:" + vector[i] + "  ");
        }
        System.out.println("");

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j != i && j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    System.out.println("El valor " + vector[i] + " en el elemento: " + (i + 1) + " es igual en el elemento: " + (j + 1) + " ");
                    contador = contador++;
                    vector[j] = -1;
                }
            }
        }
        if (contador == 0) {
            System.out.println("No existen vectores iguales");
        }
    }
}
