/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wanaldino
 */
public class asignatura {

    private String nombre, curso;
    private int codigo;

    public asignatura() {
        nombre = "Matematicas";
        codigo = 1017;
        curso = "1";
    }

    public String getnombre() {
        return this.nombre;
    }

    public String getcurso() {
        return this.curso;
    }

    public int getcodigo() {
        return this.codigo;
    }

    public static void imprimeasignatura(String nombre, int codigo, String curso) {
        System.out.println("Nombre: " + nombre
                + "\nCodigo: " + codigo
                + "\nCurso: " + curso);
    }

}
