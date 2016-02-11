/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author mati
 */
public class Ccuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoDeInteres;

    public Ccuenta(String nombre, String cuenta, Double saldo, Double tipoDeInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoDeInteres = tipoDeInteres;
    }

    public Ccuenta() {
        this.nombre = "Perico";
        this.cuenta = "0215-4589-2345";
        this.saldo = 1000;
        this.tipoDeInteres = 6;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public Double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoDeInteres
     */
    public Double getTipoDeInteres() {
        return tipoDeInteres;
    }

    /**
     * @param tipoDeInteres the tipoDeInteres to set
     */
    public void setTipoDeInteres(Double tipoDeInteres) {
        this.tipoDeInteres = tipoDeInteres;
    }

    public void reintegro(Ccuenta cuenta, double cantidad) {
        if (cuenta.getSaldo() < cantidad) {
            throw new IndexOutOfBoundsException("No hay tanto dinero en tu cuenta.");
        } else {
            cuenta.setSaldo(cuenta.getSaldo() - cantidad);
        }

    }

    public void ingreso(Ccuenta cuenta, double cantidad) {
        if (cantidad < 0) {
            throw new IndexOutOfBoundsException("No puedes ingresar un valor negativo. Para sacar dinero accede a ingresos.");
        } else {
            cuenta.setSaldo(cuenta.getSaldo() + cantidad);
        }
    }

}

}
