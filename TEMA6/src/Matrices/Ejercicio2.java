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

public class Ejercicio2 {

    public static void main(String[] args) {
        int[][] matriz = new int[7][5];
        int colSeis = 0;
        Random ran = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = ran.nextInt(10);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");

        int[][] matrizfalsa = new int[7][7];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                colSeis = colSeis + matriz[i][j];
            }
            matrizfalsa[i][5] = colSeis;
            matrizfalsa[i][6] = colSeis / matriz[i].length;
            colSeis = 0;
        }
        for (int i = 0; i < matrizfalsa.length; i++) {
            for (int j = 0; j < matrizfalsa[0].length; j++) {
                System.out.print(matrizfalsa[i][j] + "\t");
            }
            System.out.println("");
        }

    }

}
