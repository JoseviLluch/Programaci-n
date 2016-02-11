/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;

/**
 *
 * @author mati
 */
import java.util.Random;

public class Ejercicio1 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][7];
        int aux = 0;
        Random ran = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = ran.nextInt(10);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("\n");
        System.out.println("Muestra la linea 5: ");
        for (int j = 0; j < matriz[4].length; j++) {
            System.out.print(matriz[4][j] + "\t");
        }
        System.out.println("\n");
        System.out.println("Cuarta fila tercera columna: " + matriz[3][2]);
        System.out.println("Quinta fila tercera columna: " + matriz[4][2]);
        System.out.println("\n");
        aux = matriz[3][2];
        matriz[3][2] = matriz[4][2];
        matriz[4][2] = aux;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println();
        System.out.println("Las columnas primera y cuarta:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][0] + "\t" + matriz[i][3]);
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            aux = matriz[i][0];
            matriz[i][0] = matriz[i][3];
            matriz[i][3] = aux;
        }
        System.out.println("Despues de intercambiarlas: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }

    }

}
