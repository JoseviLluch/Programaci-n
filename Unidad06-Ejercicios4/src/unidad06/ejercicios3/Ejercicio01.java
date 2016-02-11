package unidad06.ejercicios3;

/*
 * Introduce una matriz de 5 filas y 7 columnas y a continuación visualiza:
  Toda la matriz
  La fila cinco completa
  el elemento de la cuarta fila tercera columna y el elemento de la quinta fila tercera 
 * columna. Intercambiarlos el contenido de estos dos elementos y visualizarlos de nuevo
  La primera columna y la cuarta. Intercambiar el contenido de estas columnas y visualizarlas 
 * de nuevo
 */
import java.util.Random;

public class Ejercicio01 {

    public static void main(String[] args) {
        int fila;
        int col;
        int[][] datos = new int[5][7];
        Random x = new Random();
        int temp;
        System.out.println("La matriz de 5x7 completa: ");
        for (fila = 0; fila < datos.length; fila++) {
            for (col = 0; col < datos[fila].length; col++) {
                datos[fila][col] = x.nextInt(9);
                System.out.print(datos[fila][col] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("La fila 5 completa: ");
        for (col = 0; col < datos[4].length; col++) {
            System.out.print(datos[4][col] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("El elemento de la cuarta fila tercera columna es: " + datos[3][2] + " ");
        System.out.println("El elemento de la cuarta quinta tercera columna es: " + datos[4][2] + " ");
        temp = datos[3][2];
        datos[3][2] = datos[4][2];
        datos[4][2] = temp;
        System.out.println("Despues de intercambiarlos");
        for (fila = 0; fila < datos.length; fila++) {
            for (col = 0; col < datos[fila].length; col++) {
                System.out.print(datos[fila][col] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Las columnas primera y cuarta:");
        for (fila = 0; fila < datos.length; fila++) {
            System.out.print(datos[fila][0] + "\t" + datos[fila][3]);
            System.out.println();
        }
        System.out.println();
        System.out.println("Las columnas primera y cuarta despues de cambiarse entre si:");
        for (fila = 0; fila < datos.length; fila++) {
            temp = datos[fila][0];
            datos[fila][0] = datos[fila][3];
            datos[fila][3] = temp;
            System.out.print(datos[fila][0] + "\t" + datos[fila][3]);
            System.out.println();
        }
    }

}
