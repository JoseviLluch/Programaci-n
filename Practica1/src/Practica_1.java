
public class Practica_1 {

    public static void main(String[] args) {
        punto punto1 = new punto(5, 6);
        punto punto2 = new punto(8, 1);

        System.out.println("Distancia: " + punto.distancia(punto1.getx(), punto1.gety(),
                punto2.getx(), punto2.gety()));

        Circulo circulo = new Circulo(5, 7, 3);

        System.out.println("Area: " + circulo.calcularArea());
        System.out.println("Perimetro: " + circulo.calcularPerimetro());
        System.out.println("Distancia al punto 1: "
                + circulo.distancia(punto1.getx(), punto1.gety()));
        Triangulo triangulo = new Triangulo(7, 2, 7, 3, 8, 11);
        System.out.println("Area: " + triangulo.calcularArea());
        System.out.println("Perimetro: " + triangulo.calcularPerimetro());
        punto origen = new punto();
        System.out.println("Distacia a un punto: "
                + triangulo.calcularDistanciaDesde(origen));
    }
}
