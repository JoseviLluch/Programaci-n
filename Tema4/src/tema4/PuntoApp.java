/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author mati
 */
import java.util.Scanner;

public class PuntoApp {

    public static void main(String[] args) {
        int coorX, coorY;
        Punto punto1;
        punto1 = new Punto();
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese coordenada x: ");
        coorX = teclado.nextInt();
        System.out.print("Ingrese coordenada y: ");
        coorY = teclado.nextInt();
        punto1.setCoordenadas(coorX, coorY);
        System.out.println("Hablamos del punto ( "
                + punto1.getCoordenadaX() + " , " + punto1.getCoordenadaY() + " )");

    }
}
