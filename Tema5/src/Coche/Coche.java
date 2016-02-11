/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coche;

/**
 *
 * @author mati
 */
enum tipoCoche {

    MINI, UTILITARIO, FAMILIAR, DEPORTIVO
};

enum modalidadSeguro {

    A_TERCEROS, A_TODO_RIESGO
};

public class Coche {

    private String modelo;
    private String color;
    private String matricula;
    private boolean esMetalizado;
    private int anoFabricacion;
    private tipoCoche tipo;
    private modalidadSeguro seguro;

    public void imprimeCoche() {
        System.out.println("El coche " + getModelo()
                + " es de color " + getColor());
    }

    public Coche() {//CONSTRUCTOR
        modelo = "Mercedes";
        color = "rojo";
        matricula = "C-1111-AA";
        esMetalizado = true;
        anoFabricacion = 2015;

    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the esMetalizado
     */
    public boolean isEsMetalizado() {
        return esMetalizado;
    }

    /**
     * @param esMetalizado the esMetalizado to set
     */
    public void setEsMetalizado(boolean esMetalizado) {
        this.esMetalizado = esMetalizado;
    }

    /**
     * @return the anoFabricacion
     */
    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    /**
     * @param anoFabricacion the anoFabricacion to set
     */
    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    /**
     * @return the tipo
     */
    public tipoCoche getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(tipoCoche tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the seguro
     */
    public modalidadSeguro getSeguro() {
        return seguro;
    }

    /**
     * @param seguro the seguro to set
     */
    public void setSeguro(modalidadSeguro seguro) {
        this.seguro = seguro;
    }
}
