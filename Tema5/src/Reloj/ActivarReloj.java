/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reloj;

/**
 *
 * @author mati
 */
public class ActivarReloj {

    public static void main(String[] args) {
        Reloj reloj = new Reloj();
        System.out.println(reloj.dameHora());
        reloj.ponHora(15, 52);
        System.out.println(reloj.dameHora());
    }

}
