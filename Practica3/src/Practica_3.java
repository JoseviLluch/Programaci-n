
public class Practica_3 {

    public static void main(String[] args) {
        Garaje garaje;
        Coche mustang = new Coche("Mustang", "RT6");
        Coche ford = new Coche("Ford", "Lion King");

        garaje = new Garaje(mustang, "Ruedas rotas");

        garaje.getCoche().setPrecio(Math.random() * 100);

        if ("Aceite".equals(garaje.getAveria())) {
            garaje.getCoche().setLitros(10);
        }

        garaje.devolverCoche();

        garaje.aceptarCoche(ford, "Aceite");

        garaje.getCoche().setPrecio(Math.random() * 100);

        if ("Aceite".equals(garaje.getAveria())) {
            garaje.getCoche().setLitros(10);
        }

        garaje.devolverCoche();

        garaje.aceptarCoche(ford, "Puerta rota");

        garaje.getCoche().setPrecio(Math.random() * 100);

        if ("Aceite".equals(garaje.getAveria())) {
            garaje.getCoche().setLitros(10);
        }

        garaje.devolverCoche();

        garaje.aceptarCoche(mustang, "Aceite");

        garaje.getCoche().setPrecio(Math.random() * 100);

        if ("Aceite".equals(garaje.getAveria())) {
            garaje.getCoche().setLitros(10);
        }

        garaje.devolverCoche();

        System.out.println(mustang.getMarca() + " " + mustang.getModelo() + " se ha gastado "
                + mustang.getPrecio() + "€ y ha puesto " + mustang.getMotor().getLitros()
                + " litros de aceite.");

        System.out.println(ford.getMarca() + " " + ford.getModelo() + " se ha gastado "
                + ford.getPrecio() + "€ y ha puesto " + ford.getMotor().getLitros()
                + " litros de aceite.");

    }
}
