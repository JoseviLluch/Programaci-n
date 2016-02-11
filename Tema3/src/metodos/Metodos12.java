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

public class Metodos12 {

    public static void main(String[] args) {
        String nombre;
        char idioma;
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba su nombre: ");
        nombre = scan.nextLine();
        System.out.println("Elige un idioma(a-Castellano, b-Valenciano, c-Ingles): ");
        idioma = scan.next().charAt(0);
        hola(nombre, idioma);

    }

    public static void hola(String nombre, char idioma) {
        if (idioma == 'a') {
            System.out.println("Buenos días " + nombre);
        } else if (idioma == 'b') {
            System.out.println("Bon día " + nombre);
        } else {
            System.out.println("Good morning " + nombre);

        }
    }
}
