package unidad06.ejercicios3;

/*
 * Crea un vector V numérico de 50 elementos y otro P de 20 elementos. Genera 
 * luego M(50,20) de tal forma que M(I,J) es igual a V(I) * P(J)
 */
import java.util.Random;

public class Ejercicio03 {

    public static void main(String[] args) {
        int fila;
        int col;
        int[] vectorV = new int[50];
        int[] vectorP = new int[20];
        int[][] matrizM = new int[50][20];
        Random x = new Random();
        System.out.println("El vector V de 50 elementos: ");
        for (fila = 0; fila < vectorV.length; fila++) {
            vectorV[fila] = x.nextInt(9);
            System.out.print(vectorV[fila] + " ");
        }
        System.out.println();
        System.out.println("El vector P de 20 elementos: ");
        for (fila = 0; fila < vectorP.length; fila++) {
            vectorP[fila] = x.nextInt(9);
            System.out.print(vectorP[fila] + " ");
        }
        System.out.println();
        System.out.println("La matriz M de 50x20 completa: ");
        for (fila = 0; fila < matrizM.length; fila++) {
            for (col = 0; col < matrizM[fila].length; col++) {
                matrizM[fila][col] = vectorV[fila] * vectorP[col];
                System.out.print(matrizM[fila][col] + "\t");
            }
            System.out.println();
        }
    }

}
