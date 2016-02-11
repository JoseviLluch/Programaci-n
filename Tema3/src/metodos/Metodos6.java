/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author mati
 */
import java.util.Scanner;

public class Metodos6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char letra;
        double vueltas;

        System.out.println("Escribe la letra que desees imprimir: ");
        letra = scan.next().charAt(0);
        System.out.println("El numero de veces que quieres imprimirlo: ");
        vueltas = scan.nextDouble();
        imprime(letra, vueltas);
    }

    public static void imprime(char letra, double vueltas) {
        while (vueltas > 0) {
            System.out.print(letra);
            vueltas--;
        }
    }
}
