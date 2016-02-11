
public class Circulo {

    private double radio;
    private punto centro = new punto();

    public Circulo(punto centro, double radio) {
        this.radio = radio;
        this.centro = centro;
    }

    public Circulo() {
        this.centro = new punto();
        this.radio = 0;
    }

    public Circulo(double x, double y, double r) {
        this.radio = r;
        this.centro.setx(x);
        this.centro.sety(y);
    }

    public double getradio() {
        return this.radio;
    }

    public punto getcentro() {
        return this.centro;
    }

    public double distancia(double x1, double y1) {
        return Math.sqrt(Math.pow(x1 - centro.getx(), 2) + Math.pow(y1 - centro.gety(), 2));
    }

    public double calcularArea() {
        return (Math.pow(this.radio, 2) * Math.PI);
    }

    public double calcularPerimetro() {
        return 2 * 3.1415 * this.radio;
    }

}
