
public class Coche {

    private Motor motor = new Motor(0);
    private String marca, modelo;
    private double precio = 0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public double getPrecio() {
        return this.precio;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public void acumulaAveria(double precio) {
        this.precio += precio;
    }

    public void setLitros(int litros) {
        this.motor.setLitros(litros);
    }

    public void setPrecio(double precio) {
        this.precio += precio;
    }

}
