package unidad06.ejercicios3;

/*
 * Tenemos dos matrices con la siguiente información.
 A(100,2) Nº de Producto Precio
 B (50,2) Nº de Producto Cantidad
 Tenemos que realizar el siguiente listado:
 Nº de Producto Cantidad Precio Importe
 xxx xx,xxx xxx.xx xx,xxx.xx
 xxx xx,xxx xxx.xx xx,xxx.xx
 TOTAL .......... xxx,xxx.xx
 Hay que localizar los productos de B en A y efectuar dicho listado.
 La matriz A no está ordenada
 */
import java.util.Random;

public class Ejercicio05 {

    public static void main(String[] args) {
        int fila;
        int filaB;
        int cantidad = 0;
        int importe = 0;
        int total = 0;
        int[][] datosA = new int[100][2];
        int[][] datosB = new int[50][2];
        Random x = new Random();
        System.out.println("Nº de Producto y Precio");
        for (fila = 0; fila < datosA.length; fila++) {
            datosA[fila][0] = fila + 1;
            datosA[fila][1] = x.nextInt(98) + 1;
            System.out.print(datosA[fila][0] + "\t" + datosA[fila][1]);
            System.out.println();
        }
        System.out.println("Nº de Producto y Cantidad");
        for (fila = 0; fila < datosB.length; fila++) {
            datosB[fila][0] = fila + 20;
            datosB[fila][1] = x.nextInt(19) + 1;
            System.out.print(datosB[fila][0] + "\t" + datosB[fila][1]);
            System.out.println();
        }
        System.out.println("Nº de Producto \t Cantidad \t Precio \t Importe Total");
        for (fila = 0; fila < datosA.length; fila++) {
            for (filaB = 0; filaB < datosB.length; filaB++) {
                if (datosA[fila][0] == datosB[filaB][0]) {
                    cantidad = datosB[filaB][1];
                    importe = datosB[filaB][1] * datosA[fila][1];
                    break;
                } else {
                    cantidad = 0;
                    importe = 0;
                }
            }
            System.out.print(datosA[fila][0] + "\t\t " + cantidad + "\t\t " + datosA[fila][1] + "\t\t " + importe);
            System.out.println();
            total = total + importe;
        }
        System.out.println("TOTAL........................................" + total);
    }

}
