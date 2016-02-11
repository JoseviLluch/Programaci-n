/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author mati
 */
import java.util.*;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce cadena: ");
        String cad=scan.nextLine();
        String cad2="";
        System.out.println("Caracter que quiereas intercambiar");
        char c=scan.next().charAt(0);
        
        for(int i=0;i<cad.length();i++)
        {
            if(cad.charAt(i)!=c) cad2=cad2.concat(String.valueOf(cad.charAt(i)));
            if(cad.charAt(i)==c) cad2=cad2.concat("*");
        }
        System.out.println();
        
        System.out.println(cad2);   
            
        }
    }
    

