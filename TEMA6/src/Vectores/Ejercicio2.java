/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectores;

/**
 *
 * @author mati
 */
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        String[] vector = new String[10];
        for (int i = 0; i < vector.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Introduce un elemento alfanumerico ");
            vector[i] = scan.next();
        }
        for (int i = 0; i < vector.length; i++) {
            if (i % 2 == 0) {
                System.out.println("En el hueco " + (i + 1) + " esta el elemento " + vector[i]);
            }
            if (i % 2 == 1) {
                System.out.println("En el hueco " + (i + 1) + " esta el elemento " + vector[i]);
            }

        }
    }
}
