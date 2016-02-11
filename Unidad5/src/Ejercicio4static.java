/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wanaldino
 */
public class Ejercicio4static {

    static int id = 0;

    public static int sumaid() {
        id++;
        return id;
    }

    public static void main(String[] args) {

        item item1 = new item("uno");
        item item2 = new item("dos");
        item item3 = new item("tres");

        System.out.println("Id de " + item1.getnombre() + ": " + item1.getid());
        System.out.println("Id de " + item2.getnombre() + ": " + item2.getid());
        System.out.println("Id de " + item3.getnombre() + ": " + item3.getid());

    }
}
