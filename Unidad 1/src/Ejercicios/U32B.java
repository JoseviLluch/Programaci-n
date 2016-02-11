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
public class U32B {

    public static void main(String[] args) {
        int pares = 0;
        int impares = 0;
        int multiplos = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            if (i % 5 == 0) {
                multiplos++;
            }

        }
        System.out.println("Hay " + pares + " pares");
        System.out.println("Hay " + impares + " impares");
        System.out.println("Hay " + multiplos + " multiplos");

    }

}
