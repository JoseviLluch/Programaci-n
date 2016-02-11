
public class Triangulo {

    private punto punto1 = new punto();
    private punto punto2 = new punto();
    private punto punto3 = new punto();

    public Triangulo(punto punto1, punto punto2, punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    public Triangulo() {
        this.punto1 = new punto();
        this.punto2 = new punto();
        this.punto3 = new punto();
    }

    public Triangulo(double x1, double x2, double x3, double y1, double y2, double y3) {
        this.punto1.setx(x1);
        this.punto2.setx(x2);
        this.punto3.setx(x3);
        this.punto1.sety(x1);
        this.punto2.sety(x2);
        this.punto3.sety(x3);
    }

    public double getx1() {
        return this.punto1.getx();
    }

    public double gety1() {
        return this.punto1.gety();
    }

    public double getx2() {
        return this.punto2.getx();
    }

    public double gety2() {
        return this.punto2.gety();
    }

    public double getx3() {
        return this.punto3.getx();
    }

    public double gety3() {
        return this.punto3.gety();
    }

    public double calcularDistanciaDesde(punto punto) {
        return Math.sqrt(Math.pow(this.punto1.getx() - punto.getx(), 2)
                + Math.pow(this.punto1.getx() - punto.gety(), 2));
    }

    public double calcularPerimetro() {
        return punto.distancia(punto1.getx(), punto1.gety(), punto2.getx(), punto2.gety())
                + punto.distancia(punto1.getx(), punto1.gety(), punto3.getx(), punto3.gety())
                + punto.distancia(punto3.getx(), punto3.gety(), punto2.getx(), punto2.gety());
    }

    public double calcularArea() {
        punto P = new punto();

        double m1 = (punto2.gety() - punto3.gety()) / (punto2.getx() - punto3.getx());
        double m2 = -1 / m1;
        double n1 = punto1.gety() - m2 * punto1.getx();
        double n2 = punto2.gety() - m1 * punto2.getx();

        P.setx((n2 - n1) / (m1 - m2));
        P.sety(m1 * P.getx() + n1);

        return punto.distancia(punto2.getx(), punto2.gety(), punto3.getx(), punto3.gety())
                * punto.distancia(punto1.getx(), punto1.gety(), P.getx(), P.gety()) / 2;
    }

}
