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

public class Ejercicio1 {

    public static void main(String[] args) {
        int num[] = new int[10];
        rellenarVector(num);
        mostrarVector(num);
    }

    public static void rellenarVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Introduce un numero ");
            vector[i] = scan.nextInt();

        }
    }

    public static void mostrarVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("En el hueco " + (i + 1) + " esta el numero " + vector[i]);
        }
    }
}
