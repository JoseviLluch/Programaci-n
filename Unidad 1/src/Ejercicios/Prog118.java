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
import java.math.*;
import java.util.Scanner;

public class Prog118 {

    public static void main(String[] args) {

        int lado = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe la longitud del lado ");
        lado = scanner.nextInt();

        double perimetro = (lado * 3);
        double altura = ((lado / 2) * Math.sqrt(3));
        double area = ((lado * altura) / 2);

        System.out.println(lado);
        System.out.println(perimetro);
        System.out.println(altura);
        System.out.println(area);

    }

}
