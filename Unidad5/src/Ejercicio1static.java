/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wanaldino
 */
public class Ejercicio1static {

    public static void main(String[] args) {

        aparatoelectrico bombilla = new aparatoelectrico("bombilla", 100);
        aparatoelectrico radiador = new aparatoelectrico("radiador", 2000);
        aparatoelectrico plancha = new aparatoelectrico("plancha", 1200);

        System.out.println("Concumo de la bombilla: " + bombilla.getpotencia());
        System.out.println("Consumo del radiador: " + radiador.getpotencia());
        System.out.println("Consumo de la plancha: " + plancha.getpotencia());

        System.out.println("Consumo de la bombilla y plancha: " + (bombilla.getpotencia() + plancha.getpotencia()));
        System.out.println("Consumo de la bombilla y radiador: " + (bombilla.getpotencia() + radiador.getpotencia()));

    }
}
