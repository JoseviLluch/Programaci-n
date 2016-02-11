package unidad06.ejercicios3;

/*4. Generar en cuadrado Latino de orden N. (Un cuadrado Latino de orden N es una matriz 
 * cuadrada en la que la primera fila contiene los N primeros números naturales, en orden, y 
 * cada una de las siguientes filas contiene la rotación de la fila anterior un lugar a la derecha. 
 * 1 2 3 4 5
 * 5 1 2 3 4 
 * 4 5 1 2 3 
 * 3 4 5 1 2 
 * 2 3 4 5 1
 */
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Dime el tamaño de la matriz cuadrada: ");
        int numero = lector.nextInt();

        int[][] cuadradoLatino = new int[numero][numero];
        for (int fila = 0; fila < cuadradoLatino.length; fila++) {
            for (int columna = 0; columna < cuadradoLatino[fila].length; columna++) {
                if (fila == 0) {// Si es la primera fila los pongo en orden ascendente
                    cuadradoLatino[fila][columna] = columna + 1;
                } else {
                    if (columna == 0) {
                        cuadradoLatino[fila][columna] = cuadradoLatino[fila - 1][cuadradoLatino[fila].length - 1];
                    } else {
                        cuadradoLatino[fila][columna] = cuadradoLatino[fila - 1][columna - 1];
                    }

                }
                System.out.print(cuadradoLatino[fila][columna] + "\t");
            }
            System.out.println("");
        }
    }
}
