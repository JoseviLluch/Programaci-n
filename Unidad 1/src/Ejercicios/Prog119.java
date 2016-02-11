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

public class Prog119 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double precio1, pago1, kilometro1, precio2, pago2, kilometro3;

        System.out.println("Precio 1: ");
        precio1 = scan.nextDouble();
        System.out.println("Pago1: ");
        pago1 = scan.nextDouble();
        System.out.println("Kilometros 1: ");
        kilometro1 = scan.nextDouble();
        System.out.println("Precio 2: ");
        precio2 = scan.nextDouble();
        System.out.println("Pago 2: ");
        pago2 = scan.nextDouble();
        System.out.println("Kilometros 3: ");
        kilometro3 = scan.nextDouble();
        System.out.println("EL consumo es " + (pago1 / precio1) / (kilometro3 - kilometro1) + "l/km");
        double consumo = ((pago1 / precio1) / (kilometro3 - kilometro1));
        System.out.println("A los 100 km " + (consumo * 100));

    }

}
