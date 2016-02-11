/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

/**
 *
 * @author Xoxevi
 */
import java.util.*;

public class Execepciones1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroAdivinar = (int) (Math.random() * 100);
        numeroAdivinar++;
        int numero = 0;
        int intentos = 0;
        do {
            boolean leido;
            do {
                System.out.println("Introduzca un numero (1-100): ");
                try {
                    intentos++;
                    numero = teclado.nextInt();
                    System.out.println("El numero introducido fue: " + numero);
                    leido = true;
                } catch (InputMismatchException e) {
                    System.out.println("No ha introudico un numero entero");
                    teclado.next();
                    leido = false;
                }
            } while (leido == false);
            if (numero > numeroAdivinar) {
                System.out.println("El numero es menor.Try again");
            }
            if (numero < numeroAdivinar) {
                System.out.println("El numero es mayor. Try again");
            }
        } while (numero != numeroAdivinar);
        System.out.println("Enhorabuena, era el numero: " + numeroAdivinar);
        System.out.println("Te ha costado " + intentos + " intentos");
    }
}
