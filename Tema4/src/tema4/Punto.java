/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author mati
 */
public class Punto {

    private int x, y;

    public void setCoordenadas(int a, int b) {
        x = a;
        y = b;
    }

    public void setCoordenadaX(int a) {
        x = a;
    }

    public void setCoordenadaY(int a) {
        y = a;
    }

    public int getCoordenadaX() {
        return x;
    }

    public int getCoordenadaY() {
        return y;
    }

}
