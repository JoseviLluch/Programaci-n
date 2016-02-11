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

public class Metodos7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char letra;
        int num1;
        int num2;

        System.out.println("Escribe la letra a imprimir: ");
        letra = scan.next().charAt(0);
        System.out.println("Introduce un numero entero: ");
        num1 = scan.nextInt();
        System.out.println("Introduce otro numero entero: ");
        num2 = scan.nextInt();
        imprime(letra, num1, num2);
    }

    public static void imprime(char letra, int num1, int num2) {
        for (int i = 0; i < num2; i++) {
            for (int j = 0; j < num1; j++) {
                System.out.print(letra);
            }
            System.out.println();
        }
    }

}
