/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
import java.util.*;

public class SUma {

    public static void main(String args[]) {
        int num1;
        int num2;
        int suma;

        Scanner lector = new Scanner(System.in);
        System.out.println("Introducir dos numeros");

        num1 = lector.nextInt();

        num2 = lector.nextInt();

        suma = num1 + num2;
        System.out.println("El resultado de la suma es " + suma);

    }

}
