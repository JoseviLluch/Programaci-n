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

public class Metodos10 {

    public static void main(String[] args) {
        double factorial = 1;
        double num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe el numero: ");
        num = scan.nextDouble();
        factorial = factorial(num, factorial);
        System.out.println("El factorial de tu numero es: " + factorial);
    }

    public static double factorial(double num, double factorial) {
        while (num != 0) {
            factorial = factorial * num;
            num--;
        }
        return factorial;
    }

}
