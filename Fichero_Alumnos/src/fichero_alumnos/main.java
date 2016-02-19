/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichero_alumnos;

import java.util.*;
import java.io.*;
import java.nio.file.FileSystems;

/**
 *
 * @author mati
 */
public class main {
        static Scanner scan= new Scanner(System.in);
        static ArrayList<Alumno> lista =new ArrayList();
    //- Método: main(). Hacer un programa con el siguiente menú:
//1.- Introducir datos.
//2.- Buscar (por nombre, visualizar todos los objetos que tengan el mismo nombre).
//3.- Modificar.
//4.- Borrar (Buscar por carnet y borrar).
//5.- Guardar aprobados (en fichero alumnos5.dat)
//6.- Visualizar aprobados.
//7.- Guardar en alumnos.dat.
//8.- Salir
        

    public static void ponerDatos() {
        System.out.println("Introduce el número identificativo del carnet:");
        String carnet = scan.nextLine();
        System.out.println("Introduce el nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Introduce apellidos:");
        String apellidos = scan.nextLine();
        System.out.println("Introduce 1ª Nota:");
        double nota_1 = scan.nextDouble();
        System.out.println("Introduce 2ª Nota:");
        double nota_2 = scan.nextDouble();
        System.out.println("Introduce 3ª Nota:");
        double nota_3 = scan.nextDouble();
        
        Alumno alumno = new Alumno(carnet, nombre, apellidos, nota_1, nota_2, nota_3);
        lista.add(alumno);

    }
    //Metodo: llenar archivo.

    public static void llenar() {
        System.out.println("SAVING FILES");
        FileOutputStream f = null;
        BufferedOutputStream b = null;
        ObjectOutputStream o = null;
        try {
            f = new FileOutputStream("alumnos.dat");
            b = new BufferedOutputStream(f);
            o = new ObjectOutputStream(f);

        } catch (FileNotFoundException e) {
            System.out.println("FAIL: FICHERO NOT FOUND");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("FAIL READING FICHERO");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("FAIL GENERATING FICHERO");
            System.out.println(e.getMessage());
        }
        System.out.println("FICHERO FOUNDED");
        System.out.println("FILES SAVED");
        try {
            o.writeObject(lista);
            o.flush();

        } catch (IOException e) {
            System.out.println("FAIL READING FICHERO");
            System.out.println(e.getMessage());
        }
        System.out.println("SAVING FILES PART 2");
        try {
            o.close();
        } catch (IOException e) {
            System.out.println("FAIL SAVING(CLOSING FILE)");
            System.out.println(e.getMessage());
        }
        System.out.println("SAVED FILES");
    }

    //Metodo pasarLista.

    public static void pasar() {
        System.out.println("LOADING FILES");
        FileInputStream f = null;
        BufferedInputStream b = null;
        ObjectInputStream o = null;
        try {
            f = new FileInputStream("alumnos.dat");
            b = new BufferedInputStream(f);
            o = new ObjectInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("FAIL: FICHERO NOT FOUND");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("FAIL READING FICHERO");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("FAIL GENERATING FICHERO");
            System.out.println(e.getMessage());
        }
        System.out.println("FICHERO FOUND");
        try {
            ArrayList<Alumno> lista = (ArrayList) o.readObject();
        } catch (IOException e) {
            System.out.println("FAIL READING FICHERO");
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("CLASS NOT FOUND MADAFACKA");
            System.out.println(e.getMessage());
        }
    }

    //Metodo pasarFichero: 

    public static void volcar() {
        DataOutputStream d = null;
        BufferedOutputStream b = null;
        FileOutputStream f = null;
        try {
            f = new FileOutputStream("alumnos5.dat");
            b = new BufferedOutputStream(f);
            d = new DataOutputStream(b);
            System.out.println("BUSCANDO ALUMNOS APROBADOS");
            for (int i = 0; i < lista.size(); i++) {
                double media = ((lista.get(i).getNota_1() + lista.get(i).getNota_2() + lista.get(i).getNota_3()) / 3);
                if (media > 5) {
                    System.out.println("ALUMNO MEDIA 5 ENCONTRADO");
                    d.writeChars(lista.get(i).getCarnet() + " " + media);
                }
            }
            d.close();
        } catch (FileNotFoundException e) {
            System.out.println("FAIL: FICHERO NOT FOUND");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("FAIL READING FICHERO");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("FAIL GENERATING FICHERO");
            System.out.println(e.getMessage());
        }
    }

    //Metodo visualizar fichero

    public static void leerFichero5() {
       for (int i=0; i<lista.size();i++){
           double media=(lista.get(i).getNota_1()+lista.get(i).getNota_2()+lista.get(i).getNota_3())/3;
           if(media>5){
               System.out.println("DNI: "+lista.get(i).getCarnet()+ "/tMedia: "+media);
         
           }
       }
    }

    public static void buscar() {
        System.out.println("Introduce el nombre a buscar");
        String nombre = scan.nextLine();
        System.out.println("SEARCHING ALUMNO");
        int contador = 0;

        for (int i = 0; i < lista.size(); i++) {
            
            if(nombre.equalsIgnoreCase(lista.get(i).getNombre())){
            System.out.println("Nºcarnet: " + lista.get(i).getCarnet());
            System.out.println("Nombre: " + lista.get(i).getNombre());
            System.out.println("Apellidos: " + lista.get(i).getApellidos());
            System.out.println("Nota 1: " +lista.get(i).getNota_1());
            System.out.println("Nota 2: "+ lista.get(i).getNota_2());
            System.out.println("Nota 3: "+ lista.get(i).getNota_3());
            System.out.println("----------------------");
        }
        }
    }

    public static void modificar() {

        scan.nextLine();

        System.out.print("\n\n1. Cambiar nombre y apellido."
                + "\n2. Cambiar nº de carnet."
                + "\n3. Cambiar notas."
                + "\n\nOpcion: ");
        int sel = scan.nextInt();

        System.out.print("Nº de carnet: ");
        String pene = scan.nextLine();
        scan.nextLine();

        switch (sel) {

            case 1:

                System.out.print("Nombre del alumno: ");
                String nombre = scan.nextLine();
                System.out.print("Apellido del alumno: ");
                String apellido = scan.nextLine();
                for (int i = 0; i < lista.size(); i++) {
                    if (pene== lista.get(i).getCarnet()) {
                        lista.get(i).setNombre(nombre);
                        lista.get(i).setApellidos(apellido);
                    }
                }

                for (int i = 0; i < lista.size(); i++) {
                    if (pene == lista.get(i).getCarnet()) {
                        lista.get(i).setNombre(nombre);
                        lista.get(i).setApellidos(apellido);
                    }
                }
                break;

            case 2:

                System.out.print("Nº de carnet del alumno: ");
                String carnet = scan.nextLine();
                for (int i = 0; i < lista.size(); i++) {
                    if (pene == lista.get(i).getCarnet()) {
                        lista.get(i).setCarnet(carnet);
                    }
                }

                for (int i = 0; i < lista.size(); i++) {
                    if (pene == lista.get(i).getCarnet()) {
                        lista.get(i).setCarnet(carnet);
                    }
                }
                break;

            case 3:

                System.out.print("Nota 1: ");
                double nota1 = scan.nextDouble();
                scan.nextLine();
                System.out.print("Nota 2: ");
                double nota2 = scan.nextDouble();
                scan.nextLine();
                System.out.print("Nota 3: ");
                double nota3 = scan.nextDouble();
                scan.nextLine();

                for (int i = 0; i < lista.size(); i++) {
                    if (pene == lista.get(i).getCarnet()) {
                        lista.get(i).setNota_1(nota1);
                        lista.get(i).setNota_2(nota2);
                        lista.get(i).setNota_3(nota3);
                    }
                }

                for (int i = 0; i < lista.size(); i++) {
                    if (pene == lista.get(i).getCarnet()) {
                        lista.get(i).setNota_1(nota1);
                        lista.get(i).setNota_2(nota2);
                        lista.get(i).setNota_3(nota3);
                    }
                }

                break;

            default:

                System.out.println("Opcion incorrecta.");
                break;

        }
}
}