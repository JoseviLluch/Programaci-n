/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones2;

/**
 *
 * @author mati
 */
public class Ej1 {

    public static void main(String[] args) {
        try {
            System.out.println("Mensaje mostrado por pantalla");
            Exception e = new Exception("Esto es un objeto Exception");
            throw e;
        } catch (Exception e1) {
            System.out.println("Excepcion capturada con mensaje: " + e1.getMessage());
        }
        System.out.println("Programa terminado");
    }

}
