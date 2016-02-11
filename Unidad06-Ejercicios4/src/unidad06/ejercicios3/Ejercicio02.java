package unidad06.ejercicios3;

/*
 * Introduce una matriz de 7 x 5 y visualizala. A continuacion:
 * Crea una nueva matriz de 7 x 7 en donde las cinco primeras columnas sean las de la matriz origen
 * Guarda en la columna sexta la suma de las cinco anteriores
 * Guarda en la columna septima la media de las cinco primeras
 */
import java.util.Random;

public class Ejercicio02 {

    public static void main(String[] args) {
        int fila;
        int col;
        int colSeis = 0;
        int[][] datos1 = new int[7][5];
        int[][] datos2 = new int[7][7];
        Random x = new Random();
        System.out.println("La matriz de 7x5 completa: ");
        for (fila = 0; fila < datos1.length; fila++) {
            for (col = 0; col < datos1[fila].length; col++) {
                datos1[fila][col] = x.nextInt(9);
                datos2[fila][col] = datos1[fila][col];
                System.out.print(datos1[fila][col] + "\t");
            }
            System.out.println();
        }
        for (fila = 0; fila < datos2.length; fila++) {
            for (col = 0; col < datos1[fila].length; col++) {
                colSeis = colSeis + datos1[fila][col];
            }
            datos2[fila][5] = colSeis;
            datos2[fila][6] = colSeis / datos1[fila].length;
            colSeis = 0;
        }
        System.out.println();
        System.out.println("La matriz de 7x7 completa: ");
        for (fila = 0; fila < datos2.length; fila++) {
            for (col = 0; col < datos2[fila].length; col++) {
                System.out.print(datos2[fila][col] + "\t");
            }
            System.out.println();
        }
    }
}
