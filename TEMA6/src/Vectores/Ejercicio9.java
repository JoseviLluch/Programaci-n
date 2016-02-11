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
//import java.util.Scanner;
public class Ejercicio9 {

    public static void main(String[] args) {
        int[] vector = new int[20];
        int mayor = 0;
        int indicemayor = 0;
        for (int i = 0; i < vector.length; i++) {
            //Scanner scan=new Scanner(System.in);
            //System.out.println("Introduce un numero ");
            //vector[i]=scan.nextInt();
            vector[i] = (int) (Math.random() * 20);
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > mayor) {
                mayor = vector[i];
                indicemayor = i;
            }
        }
        System.out.println("El mayor valor es ; " + mayor + " situado en el elemento " + (indicemayor + 1));
    }
}
