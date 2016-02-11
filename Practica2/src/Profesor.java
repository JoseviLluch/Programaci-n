
public class Profesor {

    public Profesor() {

    }

    public void ponerNota(Alumno alumno) {
        double nota = Math.random() * 10;
        alumno.setNotaAsignatura1(nota);
        nota = Math.random() * 10;
        alumno.setNotaAsignatura2(nota);
        nota = Math.random() * 10;
        alumno.setNotaAsignatura3(nota);
    }

}
