/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wanaldino
 */
public class aparatoelectrico {

    private String nombre;
    private double potencia;

    public aparatoelectrico(String nombre, double potencia) {
        this.nombre = nombre;
        this.potencia = potencia;
    }

    public double getpotencia() {
        return this.potencia;
    }

}
