
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Wanaldino
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        coche mustang = new coche();
        Scanner scan = new Scanner(System.in);

        /*        System.out.print("Color: ");
         mustang.setcolor(scan.nextLine());
        
         System.out.print("Modelo: ");
         mustang.setmodelo(scan.nextLine());
         */
        coche.imprimeCoche(mustang.getcolor(), mustang.getmodelo());

    }
}
