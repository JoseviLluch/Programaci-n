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

public class Metodos9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1;
        double num2;
        double result = 0;
        System.out.println("MEDIA ARMONICA DE DOS NUMEROS \n");
        System.out.println("Introduce numero: ");
        num1 = scan.nextDouble();
        System.out.println("Introduce el segundo: ");
        num2 = scan.nextDouble();
        result = armonica(num1, num2, result);
        System.out.println("El resultado es: " + result);
    }

    public static double armonica(double num1, double num2, double result) {
        result = (2 / ((1 / num1) + (1 / num2)));

        return result;
    }
}
