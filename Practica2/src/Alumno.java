
public class Alumno {

    private Asignatura asignatura1, asignatura2, asignatura3;

    public Alumno(Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3) {
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }

    public Alumno(int id1, int id2, int id3) {
        this.asignatura1 = new Asignatura(id1);
        this.asignatura2 = new Asignatura(id2);
        this.asignatura3 = new Asignatura(id3);
    }

    public int getIdAsignatura1() {
        return this.asignatura1.getid();
    }

    public double getNotaAsignatura1() {
        return this.asignatura1.getnota();
    }

    public int getIdAsignatura2() {
        return this.asignatura2.getid();
    }

    public double getNotaAsignatura2() {
        return this.asignatura2.getnota();
    }

    public int getIdAsignatura3() {
        return this.asignatura3.getid();
    }

    public double getNotaAsignatura3() {
        return this.asignatura3.getnota();
    }

    public void setNotaAsignatura1(double nota) {
        this.asignatura1.setnota(nota);
    }

    public void setNotaAsignatura2(double nota) {
        this.asignatura2.setnota(nota);
    }

    public void setNotaAsignatura3(double nota) {
        this.asignatura3.setnota(nota);
    }

}
