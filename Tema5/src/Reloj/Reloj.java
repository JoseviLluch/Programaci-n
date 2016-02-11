/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reloj;

/**
 *
 * @author mati
 */
enum TipoHorario {

    H24, H12
};

enum TurnoHorario {

    AM, PM
};

public class Reloj {

    private int hora, minutos, segundos;

    public void compruebaHora(int hora, int minutos, int segundos)
            throws Exception {
        if (hora < 0 || hora > 23) {
            throw new Exception("Error en hora");
        }
        if (minutos < 0 || minutos > 59) {
            throw new Exception("Error en minutos");
        }
        if (segundos < 0 || segundos > 59) {
            throw new Exception("Error en segundos");
        }
    }

    public Reloj() {
        hora = minutos = segundos = 0;
    }

    public Reloj(int hora, int minutos, int segudnos) throws Exception {
        compruebaHora(hora, minutos, segundos);
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Reloj(int hora, int minutos) throws Exception {
        this(hora, minutos, 0);
    }

    String dameHora() {
        return hora + ":" + minutos + ":" + segundos;
    }

    String dameHora(TipoHorario tipo) {
        String res;
        if (tipo == TipoHorario.H12 && hora >= 12) {
            res = "" + (hora - 12);
        } else {
            res = "" + hora;
        }
        res += ":" + minutos + ":" + segundos + ((hora < 12) ? "am" : "pm");
        return res;
    }

    void ponHora(int hora, int minutos) {

        this.hora = hora;
        this.minutos = minutos;
    }

    void ponHora(int hora, int minutos, int segundos) throws Exception {
        compruebaHora(hora, minutos, segundos);
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    void ponHora(int hora, int minutos, int segundos, TurnoHorario t) throws Exception {
        compruebaHora(hora, minutos, segundos);
        if (hora > 11) {
            throw new Exception("Hora incorrecta en horario de 12 horas");
        }
        if (t == TurnoHorario.PM) {
            hora += 12;
        }
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
}
