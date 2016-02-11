/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectores;

/**
 *
 * @author mati
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        int[] vector = new int[20];
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            //Scanner scan=new Scanner(System.in);
            //System.out.println("Introduce un numero ");
            //vector[i]=scan.nextInt();
            vector[i] = (int) (Math.random() * 20);
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > 10) {
                System.out.println("Los elementos mayor que 10 son ; " + vector[i] + " situado en el hueco " + (i + 1));
                contador++;
            }
        }
        System.out.println("Hay " + contador + " elementos mayores que 10");
    }
}
