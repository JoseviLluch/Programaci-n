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

public class Prog117 {

    public static void main(String[] args) {

        int segundos = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe una cantidad de segundos ");
        segundos = scanner.nextInt();

        int minutos = (segundos / 60);
        int horas = (segundos / 3600);
        int dias = (segundos / 86400);

        System.out.println(segundos);
        System.out.println(minutos);
        System.out.println(horas);
        System.out.println(dias);
    }

}
