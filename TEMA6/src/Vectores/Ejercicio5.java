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
import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) {
        double[] num = new double[50];
        Scanner scan = new Scanner(System.in);
        Random rn = new Random();
        double contador = 0;

        System.out.println("Escríbeme cincuenta números");

        for (int i = 0; i < 50; i++) {
            num[i] = rn.nextInt(50000);
            if (i % 2 == 0) {
                contador = contador + num[i];
            }
        }
        System.out.println("La suma de todos los números pares introducidos es " + contador);

    }
}
