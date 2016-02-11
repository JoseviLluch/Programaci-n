
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
public class Ejercicio5static {

    public static void error() {
        System.out.println("\n\n\n\n\n\n\n\n\n\nERROR!");
    }

    public static void main(String[] args) {
        bombilla casa = new bombilla(true);
        bombilla habitacion = new bombilla(true);
        bombilla cocina = new bombilla(false);
        bombilla salon = new bombilla(false);
        Scanner scan = new Scanner(System.in);
        boolean error = false;

        for (boolean test = true; test == true;) {

            System.out.println("Elige: \n"
                    + "1. Encender casa.\n"
                    + "2. Apagar casa.\n"
                    + "3. Encender habitacion.\n"
                    + "4. Apagar habitacion.\n"
                    + "5. Encender cocina.\n"
                    + "6. Apagar cocina.\n"
                    + "7. Encender salon.\n"
                    + "8. Apagar salon."
                    + "\n"
                    + "0. Salir.\n");

            switch (scan.nextInt()) {
                case 1:
                    casa.setestado(true);
                    break;
                case 2:
                    casa.setestado(false);
                    break;
                case 3:
                    habitacion.setestado(true);
                    break;
                case 4:
                    habitacion.setestado(false);
                    break;
                case 5:
                    cocina.setestado(true);
                    break;
                case 6:
                    cocina.setestado(false);
                    break;
                case 7:
                    salon.setestado(true);
                    break;
                case 8:
                    salon.setestado(false);
                    break;
                default:
                    error = true;
                    break;
                case 0:
                    test = false;
                    break;
            }

            System.out.println("\n\n\n\n\n\n\n\n\n\n");

            if (casa.getestado() == false && test == true && error == false) {
                System.out.println("Todo apagado.");
            }

            if (casa.getestado() == true && test == true && error == false) {
                System.out.print("Habitacion ");
                if (habitacion.getestado() == true) {
                    System.out.println("encendida.");
                } else {
                    System.out.println("apagada.");
                }

                System.out.print("Cocina ");
                if (cocina.getestado() == true) {
                    System.out.println("encendida.");
                } else {
                    System.out.println("apagada.");
                }

                System.out.print("Salon ");
                if (salon.getestado() == true) {
                    System.out.println("encendido.");
                } else {
                    System.out.println("apagado.");
                }

            }

            if (error == true) {
                error();
                error = false;
            }

            System.out.println("\n\n\n");

        }

    }

}
