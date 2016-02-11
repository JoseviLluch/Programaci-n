/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author mati
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Libro libro1=new Libro();
        Libro libro2=new Libro("Hayao Miyazaki","Las siete espadas",30,2);
        System.out.println("Primer libro: ");
        libro1.escribir();
        System.out.println("\nSegundo libro: ");
        libro2.escribir();
        System.out.println("\n");
        if(libro1.prestamo())
            System.out.println("Prestamo de 1 tomo");
        if(libro1.devolucion())
            System.out.println("Devolucion de 1 tomo");
        if(libro1.prestamo())
            System.out.println("Prestamo de 1 tomoo");
        if(libro2.devolucion())
            System.out.println("Devolucion de 1 tomo");
        if(libro2.prestamo())
            System.out.println("Prestamo de 1 tomo \n");
        if(libro1.getEjemplares()+libro1.getEjempalresprestados()>0){
            System.out.println("Quedan "+(libro1.getEjemplares()-libro1.getEjempalresprestados())+" tomos del libro "+libro1.getTitulo());
        }
        if(libro1.getEjemplares()-libro1.getEjempalresprestados()==0){
            System.out.println("No quedan "+libro1.getTitulo());
        }
        if(libro2.getEjemplares()-libro2.getEjempalresprestados()>0){
            System.out.println("Quedan "+(libro2.getEjemplares()-libro2.getEjempalresprestados())+" tomos del libro "+libro2.getTitulo());
        }
        if(libro2.getEjemplares()-libro2.getEjempalresprestados()==0){
            System.out.println("No quedan "+libro2.getTitulo());
        }
    }
    
}
