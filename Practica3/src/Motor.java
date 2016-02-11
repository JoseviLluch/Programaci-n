
public class Motor {

    private int CV, litros;

    public Motor(int CV) {
        this.litros = 0;
        this.CV = CV;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public int getLitros() {
        return this.litros;
    }

    public int getCV() {
        return this.CV;
    }

}
