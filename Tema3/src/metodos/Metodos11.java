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

public class Metodos11 {

    public static void main(String[] args) {
        int num1;

        Scanner scan = new Scanner(System.in);

        System.out.println("CAPICUA \n");
        System.out.println("Introduce un numero de 4 digitos: ");
        num1 = scan.nextInt();
        if (capi(num1)) {
            System.out.println("\n El numero es capicua \n");
        } else {
            System.out.println("\n El numero no es capicua \n");
        }

    }

    public static boolean capi(int num1) {

        int falta = num1;
        int numInvertido = 0;
        int resto = 0;
        numInvertido = numInvertido * 10 + resto;
        while (falta != 0) {
            resto = falta % 10;
            numInvertido = numInvertido * 10 + resto;
            falta = falta / 10;
        }

        if (num1 == numInvertido) {
            return true;
        }
        return false;
    }
}
