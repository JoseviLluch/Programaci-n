/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Random;

/**
 *
 * @author mati
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int[][]matriz= new int [5][7];
        int aux=0;
        Random ran= new Random ();
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[0].length;j++){
                matriz[i][j]=ran.nextInt(10);
                System.out.print(matriz[i][j]+"\t");
        }
            System.out.println("");
        }
         System.out.println();
        System.out.println("Las columnas cuarta y sexta:");
        for (int i=0; i < matriz.length; i++) {
            System.out.print(matriz[i][3]+"\t"+matriz[i][5]);
            System.out.println();
        }
        System.out.println();
        
        for (int i=0; i < matriz.length; i++) {
            aux=matriz[i][3];
            matriz[i][3]=matriz[i][5];
            matriz[i][5]=aux;
        }
        System.out.println("Despues de intercambiarlas: ");
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[3].length;j++){    
            System.out.print(matriz[i][j]+"\t");
            } 
            System.out.println("");
        }
    }
}
