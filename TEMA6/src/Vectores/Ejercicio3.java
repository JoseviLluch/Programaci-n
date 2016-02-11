/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectores;

import java.util.Scanner;

/**
 *
 * @author mati
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int vector[] = new int[20];
        for (int i = 0; i < vector.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Introduce un numero ");
            //vector[i]=scan.nextInt();
            vector[i] = (int) (Math.random() * 20);
        }
        for (int i = 0; i < vector.length; i++) {

            System.out.print(" Numero: " + vector[i]);
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
    }
}
