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
public class Prog115 {

    public enum DiaSemana {

        lunes, martes, miercoles, jueves, viernes, sabado, domingo
    };

    public static void main(String[] args) {
        DiaSemana examen = DiaSemana.martes;
        DiaSemana descanso = DiaSemana.domingo;

        System.out.println(examen);
        System.out.println(descanso);
    }

}
