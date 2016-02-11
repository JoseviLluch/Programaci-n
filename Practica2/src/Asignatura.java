
public class Asignatura {

    private int id;
    private double nota;

    public Asignatura(int id) {
        this.id = id;
        this.nota = 0;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getid() {
        return this.id;
    }

    public void setnota(double nota) {
        this.nota = nota;
    }

    public double getnota() {
        return this.nota;
    }

}
