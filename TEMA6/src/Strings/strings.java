package Strings;

import java.util.Scanner;

public class strings {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe tu primer apellido ");
        String primerap = scan.next();
        System.out.println("Escribe tu segundo apellido ");
        String segundoap = scan.next();
        System.out.println("Hola " + primerap + " " + segundoap);
        System.out.println(primerap.toLowerCase() + segundoap.toLowerCase());
        System.out.println(primerap.toUpperCase() + segundoap.toUpperCase());
        System.out.println("Tu primer apellido tiene " + primerap.length() + " letras, y el segundo tiene " + segundoap.length());
        if (primerap.length() > 1) {
            System.out.println(primerap.charAt(0) + primerap.charAt(1));
        } else {
            System.out.println(primerap.charAt(0));
        }
        if (primerap.length() > 1) {
            System.out.println(segundoap.charAt(segundoap.length() - 2) + segundoap.length() - 1);
        }

    }

}
