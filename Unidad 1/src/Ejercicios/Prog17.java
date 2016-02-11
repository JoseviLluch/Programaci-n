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
public class Prog17 {

    public static void main(String args[]) {
        int dinero = 2000;
        float plazo = 0.0275f;
        float hacienda = 0.18f;
        float dinero2 = (dinero * (plazo / 2));
        float resultado = (dinero + dinero2);
        float pagohacienda = (hacienda * dinero2);
        System.out.println("El banco le da " + dinero2);
        System.out.println("Tiene " + resultado);
        System.out.println("Le tiene que pagar a hacienda " + pagohacienda);

        System.out.println("Se queda con " + (resultado - pagohacienda));
    }

}
