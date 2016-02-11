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

package fichero_alumnos;

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
    public void ponerDatos(){
        System.out.println("Introduce el número identificativo del carnet:");
        String carnet=scan.nextLine();
        System.out.println("Introduce el nombre: ");
        String nombre=scan.nextLine();
        System.out.println("Introduce apellidos:");
        String apellidos=scan.nextLine();
        System.out.println("Introduce 1ª Nota:");
        double nota_1=scan.nextDouble();
        System.out.println("Introduce 2ª Nota:");
        double nota_2=scan.nextDouble();
        System.out.println("Introduce 3ª Nota:");
        double nota_3=scan.nextDouble();
        
        Alumno alumno =new Alumno(carnet, nombre, apellidos, nota_1, nota_2, nota_3);
        lista.add(alumno);
        
    }
    //Metodo: llenar archivo.
    
    public void llenar(){
        System.out.println("SAVING FILES");
        FileOutputStream f= null;
        BufferedOutputStream b=null;
        ObjectOutputStream o=null;
        try{
            f=new FileOutputStream("alumnos.dat");
            b=new BufferedOutputStream(f);
            o= new ObjectOutputStream(f);
                    
        }catch (FileNotFoundException e){
            System.out.println("FAIL: FICHERO NOT FOUND");
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println("FAIL READING FICHERO");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("FAIL GENERATING FICHERO");
            System.out.println(e.getMessage());
        }
        System.out.println("FICHERO FOUNDED");
        System.out.println("FILES SAVED");
        try{
            o.writeObject(lista);
            o.flush();
            
        }catch (IOException e){
            System.out.println("FAIL READING FICHERO");
            System.out.println(e.getMessage());
        }
        System.out.println("SAVING FILES PART 2");
        try{
            o.close();
        }catch(IOException e){
            System.out.println("FAIL SAVING(CLOSING FILE)");
            System.out.println(e.getMessage());
        } 
        System.out.println("SAVED FILES");
    }
    //Metodo pasarLista.
    public void pasar(){
        System.out.println("LOADING FILES");
        FileInputStream f=null;
        BufferedInputStream b=null;
        ObjectInputStream o=null;
        try{
            f=new FileInputStream("alumnos.dat");
            b=new BufferedInputStream (f);
            o=new ObjectInputStream (f);
         }catch (FileNotFoundException e){
            System.out.println("FAIL: FICHERO NOT FOUND");
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println("FAIL READING FICHERO");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("FAIL GENERATING FICHERO");
            System.out.println(e.getMessage());
        }
        System.out.println("FICHERO FOUND");
        try{
            ArrayList<Alumno> lista=(ArrayList) o.readObject();
        }catch (IOException e){
            System.out.println("FAIL READING FICHERO");
            System.out.println(e.getMessage());
        }catch (ClassNotFoundException e){
            System.out.println("CLASS NOT FOUND MADAFACKA");
            System.out.println(e.getMessage ());
        }   
    }    
      //Metodo pasarFichero: 
    public void volcar(){
        DataOutputStream d=null;
        BufferedOutputStream b=null;
        FileOutputStream f=null;
        try{
            f=new FileOutputStream("alumnos5.dat");
            b=new BufferedOutputStream(f);
            d=new DataOutputStream(b);
            System.out.println("BUSCANDO ALUMNOS APROBADOS");    
            for(int i=0;i<lista.size();i++){
           double media=((lista.get(i).getNota_1()+lista.get(i).getNota_2()+lista.get(i).getNota_3())/3);
           if (media>5){
               System.out.println("ALUMNO MEDIA 5 ENCONTRADO");
               d.writeChars(lista.get(i).carnet+" "+media);
            }
       } 
            d.close();
        }catch (FileNotFoundException e){
            System.out.println("FAIL: FICHERO NOT FOUND");
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println("FAIL READING FICHERO");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("FAIL GENERATING FICHERO");
            System.out.println(e.getMessage());
        }
        
        
       
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


