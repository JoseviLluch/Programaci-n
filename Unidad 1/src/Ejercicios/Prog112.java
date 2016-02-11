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
import java.math.*;

public class Prog112 {

    public static void main(String[] args) {
        double PI = java.lang.Math.PI;
        double diametro = 15.5;
        double altura = 42.4;
        double area = (PI * diametro * altura + 2 * PI * (Math.pow(diametro / 2, 2)));
        double volumen = (PI * (Math.pow(diametro / 2, 2)) * altura);
        System.out.println("El area del cilindro es " + area);
        System.out.println("El volumen es " + volumen);
    }
}
