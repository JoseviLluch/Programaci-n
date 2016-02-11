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

public class Metodos8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char letra;
        int num1;
        int num2;

        System.out.println("Escribe la letra a imprimir:");
        letra = scan.next().charAt(0);
        System.out.println("Escribe un numero: ");
        num1 = scan.nextInt();

        imprime(letra, num1);

    }

    public static void imprime(char letra, int num1) {
        int numcar = 1;
        int numbln;
        numbln = (2 * num1 - 1);

        for (int i = 0; i <= num1; i++) {

            for (int j = 0; j < numbln / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numcar; j++) {
                System.out.print(letra);
            }
            for (int j = 0; j < numbln / 2; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
            numcar = numcar + 2;
            numbln = (2 * num1 - 1) - numcar;
        }

    }
}
