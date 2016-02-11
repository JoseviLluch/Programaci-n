/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

/**
 *
 * @author Xoxevi
 */
public class Excepciones2 {

    public static void main(String[] args) {
        try {
            System.out.println("Generando numero aleatorio....");
            int entero = (int) (Math.random() * 100);
            if (entero % 2 == 0) {
                throw new Exception("Se genero el numero par: " + entero);
            } else {
                throw new Exception("Se genero el nuimero impar: " + entero);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
