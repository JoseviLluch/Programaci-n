/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

import java.util.Arrays;

/**
 *
 * @author Xoxevi
 */
public class Escepciones4 {

    public static void main(String[] args) {
        int[] impares = new int[5];
        int[] pares = new int[5];
        int[] array = pares;
        int resto = 0;
        int i = 0;
        try {
            while (true) {
                try {
                    int numero = (int) (Math.random() * 100);
                    if (numero % 2 == resto) {
                        array[i++] = numero;
                    }
                    if (i == 5) {
                        throw new Exception("" + (resto == 0 ? "pares" : "impares") + " generados");
                    }
                } catch (Exception e) {
                    System.out.println(e.toString());
                    if (resto == 0) {
                        resto = 1;
                        array = impares;
                        i = 0;
                    } else {
                        throw new Exception("Fin");
                    }
                }
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        System.out.println("Valores pares: " + Arrays.toString(pares));
        System.out.println("Valores impares: " + Arrays.toString(impares));
    }

}
