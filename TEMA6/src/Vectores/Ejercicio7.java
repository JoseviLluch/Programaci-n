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
public class Ejercicio7 {

    public static void main(String[] args) {
        int[] vector = new int[50];
        boolean cero = false;
        for (int i = 0; i < vector.length; i++) {
            //Scanner scan=new Scanner(System.in);
            //System.out.println("Introduce un numero ");
            //vector[i]=scan.nextInt();
            vector[i] = (int) (Math.random() * 50);
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 0) {
                System.out.println("El primer elemento con valor 0 se encuentra en; " + (i + 1));
                i = vector.length;
                cero = true;
            }
        }
        if (cero == false) {
            System.out.println("No hay ningun elemento 0");
        }

    }
}
