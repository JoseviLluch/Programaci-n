
public class Practica_2 {

    public static void main(String[] args) {
        Asignatura matematicas = new Asignatura(152);
        Asignatura termodinamica = new Asignatura(522);
        Asignatura fisica = new Asignatura(60);

        Alumno Wanaldino = new Alumno(matematicas, termodinamica, fisica);

        Profesor JoseRamon = new Profesor();

        JoseRamon.ponerNota(Wanaldino);

        System.out.println("Media: " + (Wanaldino.getNotaAsignatura1() + Wanaldino.getNotaAsignatura2()
                + Wanaldino.getNotaAsignatura3()) / 3);

    }
}
