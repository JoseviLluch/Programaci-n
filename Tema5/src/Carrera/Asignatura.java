/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carrera;

/**
 *
 * @author mati
 */
public class Asignatura {

    private String nombre;
    private int código;
    private int curso;

    Asignatura() {
        nombre = "Matemáticas";
        código = 1017;
        curso = 1;

    }

    public String dameNombre() {
        return nombre;
    }

    public int dameCódigo() {
        return código;
    }

    public int dameCurso() {
        return curso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
}

class EjercicioAsignatura {

    public static void main(String[] args) {
        Asignatura a = new Asignatura();
        System.out.println("Asignatura " + a.dameNombre()
                + " código " + a.dameCódigo()
                + " del curso " + a.dameCurso());
    }
}
