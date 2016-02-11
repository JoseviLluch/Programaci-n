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
public class Excepciones3 {

    public static void main(String[] args) {
        int[] impares = new int[5];
        try {
            int intentos = 0, i = 0;
            while (true) {
                int numero = (int) (Math.random() * 100);
                intentos++;
                if (numero % 2 != 0) {
                    impares[i++] = numero;
                }
                if (i == 5) {
                    throw new Exception("Se generaron los 5 numeros impares en " + intentos + " intentos");
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Los impares generados son: " + Arrays.toString(impares));
        }

    }

}
