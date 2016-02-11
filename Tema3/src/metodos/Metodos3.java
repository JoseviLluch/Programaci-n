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

public class Metodos3 {

    public static void main(String[] args) {
        double num1;
        double num2;
        double result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        num1 = scan.nextDouble();
        System.out.println("Escribe un segundo numero: ");
        num2 = scan.nextDouble();
        result = max(num1, num2, result);
        System.out.println("El mayor es: " + result);

    }

    public static double max(double num1, double num2, double result) {
        if (num1 >= num2) {
            return num1;
        } else {
            return num2;
        }

    }
}
