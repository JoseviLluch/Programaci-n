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

public class Metodos4y5 {

    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        int maximo = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        num1 = scan.nextInt();
        System.out.println("Escribe un segundo numero: ");
        num2 = scan.nextInt();
        System.out.println("Escribe un tercero: ");
        num3 = scan.nextInt();
        System.out.println("Introduce un cuarto: ");
        num4 = scan.nextInt();
        maximo = max(num1, num2, num3, num4, maximo);

        System.out.println("El mayor es: " + maximo);

    }

    public static int max(int num1, int num2, int num3, int num4, int maximo) {
        maximo = num1;
        if (maximo < num2) {
            maximo = num2;
        }
        if (maximo < num3) {
            maximo = num3;
        }
        if (maximo < num4) {
            maximo = num4;
        }
        return maximo;
    }

}
