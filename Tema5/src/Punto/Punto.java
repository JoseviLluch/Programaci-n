/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto;

/**
 *
 * @author mati
 */
import java.math.*;

public class Punto {

    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Punto() {
        this(0, 0);
    }

    //APARTADO DISTANCIA
    public double distancia(Punto p) {
        double diffX = x - p.x;
        double diffY = y - p.y;
        return Math.sqrt(diffX * diffX + diffY * diffY);
    }

    public double distanciaOrigen(Punto p) {
        Punto origen = new Punto(0, 0);
        Punto p1 = new Punto(x, y);
        return p.distancia(origen);
    }

}
