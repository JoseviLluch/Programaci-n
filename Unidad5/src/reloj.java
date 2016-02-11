/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wanaldino
 */
public class reloj {

    private int hora, minuto, segundo;

    public reloj() {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    public reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void sethora(int hora) {
        this.hora = hora;
    }

    public int gethora() {
        return this.hora;
    }

    public void setminuto(int minuto) {
        this.minuto = minuto;
    }

    public int getminuto() {
        return this.minuto;
    }

    public void setsegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getsegundo() {
        return this.segundo;
    }

    public void mostrarhora(int hora, int minuto, int segundo) {
        System.out.print("Hora: " + hora + ":" + minuto + ":" + segundo);
    }

    public void mostrarhora12(int hora, int minuto, int segundo) {
        if (hora > 12 && hora > 0) {
            hora -= 12;

            System.out.println("Hora: " + hora + ":" + minuto + ":" + segundo + " pm");

        }
        if (hora <= 12 && hora >= 0) {
            mostrarhora(hora, minuto, segundo);
            System.out.println(" am");
        }
    }

    public void ponerhora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = 0;
    }

    public void ponerhora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void ponerampm(int hora) {
        System.out.print("Hora: " + hora + ":" + minuto + ":" + segundo);
        if (hora > 12 && hora > 0) {
            System.out.println(" pm");
        }
        if (hora <= 12 && hora >= 0) {
            mostrarhora(hora, minuto, segundo);
            System.out.println(" am");
        }
    }

}
