
public class punto {

    private double x, y;

    public punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public punto() {
        x = 0;
        y = 0;
    }

    public double getx() {
        return this.x;
    }

    public double gety() {
        return this.y;
    }

    public void setx(double x) {
        this.x = x;
    }

    public void sety(double y) {
        this.y = y;
    }

    public static double distancia(double x1, double y1, double x2, double y2) {
        double distancia;

        distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        return distancia;
    }

    public static double distanciaorigen(double x1, double y1) {
        double distancia;

        distancia = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));

        return distancia;
    }

}
