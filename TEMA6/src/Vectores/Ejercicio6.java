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

public class Ejercicio6 {

    public static void main(String[] args) {
        int[] vector = new int[10];
        for (int i = 0; i < vector.length; i++) {
            Scanner scan = new Scanner(System.in);
            vector[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < vector.length; i++) {
            if ((i + 1) % 2 == 0 && vector[i] % 2 == 0) {
                System.out.println("En el hueco par " + (i + 1) + " esta el elemento par " + vector[i]);
            }
            if ((i + 1) % 2 == 1 && vector[i] % 2 == 1) {
                System.out.println("En el hueco impar " + (i + 1) + " esta el elemento impar " + vector[i]);
            }
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 3 == 0) {
                System.out.println("En el hueco " + (i + 1) + " esta el elemento multiplo de 3 -> " + vector[i]);
            }
        }
    }
}
