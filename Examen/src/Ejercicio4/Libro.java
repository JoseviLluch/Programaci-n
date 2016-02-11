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
public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int ejempalresprestados;
    public Libro(){
        this.autor="Laura Gallego Garcia";
        this.titulo="Cronicas de la torre";
        this.ejemplares=25;
        this.ejempalresprestados=0;
    }
    public Libro(String autor, String titulo, int ejemplares, int ejemplaresprestados){
        this.autor=autor;
        this.titulo=titulo;
        this.ejemplares=ejemplares;
        this.ejempalresprestados=ejemplaresprestados;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @param ejemplares the ejemplares to set
     */
    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    /**
     * @param ejempalresprestados the ejempalresprestados to set
     */
    public void setEjempalresprestados(int ejempalresprestados) {
        this.ejempalresprestados = ejempalresprestados;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @return the ejemplares
     */
    public int getEjemplares() {
        return ejemplares;
    }

    /**
     * @return the ejempalresprestados
     */
    public int getEjempalresprestados() {
        return ejempalresprestados;
    }
    public boolean prestamo(){
        if(this.ejempalresprestados<this.ejemplares){
            this.ejempalresprestados++;
            return true;
        }
        return false;
    }
    public boolean devolucion(){
        if(this.ejempalresprestados>0){
            this.ejempalresprestados--;
            return true;
        }
        return false;
    }
    public void escribir(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Numero de ejemplares: "+this.ejemplares);
        System.out.println("Ejemplares prestados: "+this.ejempalresprestados);
        System.out.println("Quedan "+(this.ejemplares-this.ejempalresprestados)+" tomos");
    }
    
    
}
