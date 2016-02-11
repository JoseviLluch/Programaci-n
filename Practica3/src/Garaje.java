
public class Garaje {

    private Coche coche = new Coche("", "");
    private String averia;
    private int cantidad = 0;
    private boolean libre;

    public Garaje(Coche coche, String averia) {
        this.coche = coche;
        this.averia = averia;
        this.cantidad++;
        this.libre = false;
    }

    public boolean aceptarCoche(Coche coche, String averia) {
        if (this.libre == true) {
            this.coche = coche;
            this.averia = averia;
            this.cantidad++;
            this.libre = false;
            return true;
        }

        System.out.println("Garaje lleno.");
        return false;
    }

    public void devolverCoche() {
        this.libre = true;
    }

    public Coche getCoche() {
        return this.coche;
    }

    public String getAveria() {
        return this.averia;
    }

}
