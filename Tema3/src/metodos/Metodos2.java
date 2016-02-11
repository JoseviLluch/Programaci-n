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
import java.math.*;

public class Metodos2 {

    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        double radio;
        double resultadoA;
        double resultadoL;
        double pi = java.lang.Math.PI;

        System.out.println("Escribe el radio de la circunferencia: ");
        radio = r.nextDouble();
        resultadoA = area(radio);

        System.out.println("EL área es: " + resultadoA);
        resultadoL = longitud(radio);
        System.out.println("La longitud es: " + resultadoL);
    }

    public static double area(double radio) {
        double resultadoA;
        double pi = java.lang.Math.PI;

        resultadoA = (pi * java.lang.Math.pow(radio, 2));
        return resultadoA;

    }

    public static double longitud(double radio) {
        double resultadoL;
        double pi = java.lang.Math.PI;

        resultadoL = (2 * pi * radio);
        return resultadoL;
    }
}
