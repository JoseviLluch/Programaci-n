/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author mati
 */
import java.util.Scanner;

public class Prog120 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double dinero, interes, tiempo;

        System.out.println("Introduce dinero: ");
        dinero = scan.nextDouble();
        System.out.println("Introduce el interes (en porcentaje) ");
        interes = scan.nextDouble();
        System.out.println("En cuanto tiempo(meses)? ");
        tiempo = scan.nextDouble();

        double interes2 = (interes / 100);
        double dinero2 = ((interes2 * tiempo) / 12) * dinero;
        double dinero3 = dinero2 * 0.18;
        System.out.println("Dinero final: " + (dinero - dinero3));

    }

}
