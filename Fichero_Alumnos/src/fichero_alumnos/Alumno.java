/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*1.- Realizar un ejercicio de ficheros.
Crear una clase Alumno con los siguientes datos:
- carnet
- nombre
- apellidos
- nota 1
- nota 2
- nota 3
- Método: ponerDatos(). Que lee los datos del teclado y los pone en un objeto que guardará en un
ArrayList.
- Método: llenarArchivo(). Que guarda los objetos que hay en el ArrayList en un fichero
alumnos.dat
- Método: pasarALista(). Que pasa los datos del archivo alumnos.dat a un ArrayList.
- Método: pasarFichero5(). Que guarda el carnet y la nota media de aquellos alumnos que su nota
media es mayor que 5 en un fichero alumnos5.dat.
- Método: visualizarFichero5(). Visualiza los datos del fichero alumnos5.dat
- Método: main(). Hacer un programa con el siguiente menú:
1.- Introducir datos.
2.- Buscar (por nombre, visualizar todos los objetos que tengan el mismo nombre).
3.- Modificar.
4.- Borrar (Buscar por carnet y borrar).
5.- Guardar aprobados (en fichero alumnos5.dat)
6.- Visualizar aprobados.
7.- Guardar en alumnos.dat.
8.- Salir

/**
 *
 * @author mati
 */


package fichero_alumnos;
import java.util.*;
import java.io.*;
import java.nio.file.FileSystems;
public class Alumno {
    private String carnet;
    private String nombre;
    private String apellidos;
    private double nota_1;
    private double nota_2;
    private double nota_3; 
    ArrayList<Alumno> lista =new ArrayList();
    Scanner scan= new Scanner(System.in);
    FileOutputStream f= null;
    public Alumno(String carnet, String nombre, String apellidos, double nota_1, double nota_2, double nota_3) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
        this.nota_3 = nota_3;
    }

    public Alumno() {
        this.carnet="carnet";
        this.nombre="nombre";
        this.apellidos="apellidos";
        this.nota_1=0;
        this.nota_2=0;
        this.nota_3=0;
    }
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getNota_1() {
        return nota_1;
    }

    public void setNota_1(double nota_1) {
        this.nota_1 = nota_1;
    }

    public double getNota_2() {
        return nota_2;
    }

    public void setNota_2(double nota_2) {
        this.nota_2 = nota_2;
    }

    public double getNota_3() {
        return nota_3;
    }

    public void setNota_3(double nota_3) {
        this.nota_3 = nota_3;
    }

}


