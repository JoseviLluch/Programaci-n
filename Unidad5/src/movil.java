/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wanaldino
 */
public class movil {

    private double velocidad, x, y, m;

    public movil() {
        velocidad = 2.4;
        x = 2.1;
        y = 5.2;
        m = 2;
    }

    public movil(double velocidad, double x, double y, double m) {
        this.m = m;
        this.velocidad = velocidad;
        this.x = x;
        this.y = y;
    }

    public double getm() {
        return this.m;
    }

    public double getx() {
        return this.x;
    }

    public double gety() {
        return this.y;
    }

    public double getvelocidad() {
        return this.velocidad;
    }

    public void nuevas(double m, double x, double y, double v, double t) {
        System.out.print("X nueva: " + (x + Math.cos(Math.atan(m)) * v * t));
        System.out.println(", Y nueva: " + (y + Math.sin(Math.atan(m)) * v * t));
    }

}
