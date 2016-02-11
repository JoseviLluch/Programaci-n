/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wanaldino
 */
public class coche {

    private String modelo, color, matricula, tipo, seguro;
    private boolean metalizado;
    private int añofabricacion;

    public coche() {
        modelo = "BMW";
        color = "Negro";
        matricula = "1234AAA";
        tipo = "Deportivo";
        seguro = "A todo riesgo";
        metalizado = true;
        añofabricacion = 1885;
    }

    public coche(String modelo, String color, String matricula, String tipo,
            String seguro, boolean metalizado, int añofabricacion) {
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.tipo = tipo;
        this.seguro = seguro;
        this.metalizado = metalizado;
        this.añofabricacion = añofabricacion;
    }

    public String getmodelo() {
        return this.modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public String getcolor() {
        return this.color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public String getmatricula() {
        return this.matricula;
    }

    public void setmatricula(String matricula) {
        this.matricula = matricula;
    }

    public String gettipo() {
        return this.tipo;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    public String getseguro() {
        return this.seguro;
    }

    public void setseguro(String seguro) {
        this.seguro = seguro;
    }

    public boolean getmetalizado() {
        return this.metalizado;
    }

    public void setseguro(boolean metalizado) {
        this.metalizado = metalizado;
    }

    public int getañofabricacion() {
        return this.añofabricacion;
    }

    public void setañofabricacion(int añofabricacion) {
        this.añofabricacion = añofabricacion;
    }

    public static void imprimeCoche(String color, String modelo) {
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
    }

}
