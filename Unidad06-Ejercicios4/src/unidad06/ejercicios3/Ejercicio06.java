package unidad06.ejercicios3;

/*
 6. Crea un programa para gestionar las notas de un grupo escolar. 
 * El grupo se compone de 20 alumnos y tiene3 modulos.
 * Calcular la nota media de cada alumno
 * Calcular la maxima nota de cada modulo
 * Calcular la nota media por modulo y cuantos alumnos la sobrepasan
 */
public class Ejercicio06 {

    public static void main(String[] args) {

        double[][] alumnos = new double[20][3];
        System.out.println("Mod1.\tMod2.\tMod3\tMedia\tMax.Nota");
        System.out.println("__________________________________________");
        double media = 0, max = 0;
        for (int fila = 0; fila < alumnos.length; fila++) {
            for (int columna = 0; columna < alumnos[fila].length; columna++) {

                alumnos[fila][columna] = (Math.random() * 10 + 0);
                //MEDIA ALUMNO
                media = media + alumnos[fila][columna];
                //MAXIMA NOTA ALUMNO
                if (columna == 0) {
                    max = alumnos[fila][columna];
                } else if (alumnos[fila][columna] > max) {
                    max = alumnos[fila][columna];
                }

                System.out.printf("%.2f\t", alumnos[fila][columna]);
                if (columna == alumnos[fila].length - 1) {
                    media = media / 3;
                    System.out.printf("%.2f\t", media);
                    System.out.printf("%.2f", max);
                    media = 0;
                    max = 0;
                }

            }
            System.out.println("");
        }

        //CALCULAR MEDIA POR MODULO
        double mediamodulo1 = 0, mediamodulo2 = 0, mediamodulo3 = 0;
        for (int columna = 0; columna < alumnos[columna].length; columna++) {
            for (int fila = 0; fila < alumnos.length; fila++) {
                if (columna == 0) {
                    mediamodulo1 = mediamodulo1 + alumnos[fila][columna];
                }
                if (columna == 1) {
                    mediamodulo2 = mediamodulo2 + alumnos[fila][columna];
                }
                if (columna == 2) {
                    mediamodulo3 = mediamodulo3 + alumnos[fila][columna];
                }
            }
        }
        mediamodulo1 = mediamodulo1 / alumnos.length;
        mediamodulo2 = mediamodulo2 / alumnos.length;
        mediamodulo3 = mediamodulo3 / alumnos.length;
        System.out.println("__________________________________________");
        System.out.printf("%.2f\t%.2f\t%.2f\n", mediamodulo1, mediamodulo2, mediamodulo3);

//CONTAR ALUMNOS SOBREPASAN MEDIA DEL MODULO
        int contmod1 = 0, contmod2 = 0, contmod3 = 0;
        for (int columna = 0; columna < alumnos[columna].length; columna++) {
            for (int fila = 0; fila < alumnos.length; fila++) {
                if (columna == 0 && alumnos[fila][columna] > mediamodulo1) {
                    contmod1++;
                }
                if (columna == 1 && alumnos[fila][columna] > mediamodulo2) {
                    contmod2++;
                }
                if (columna == 2 && alumnos[fila][columna] > mediamodulo3) {
                    contmod3++;
                }
            }
        }
        System.out.println("__________________________________________");
        System.out.println("- NÚMERO ALUMNOS SOBREPASAN MEDIA");
        System.out.println("MÓDULO 1: " + contmod1 + " alumnos.");
        System.out.println("MÓDULO 2: " + contmod2 + " alumnos.");
        System.out.println("MÓDULO 3: " + contmod3 + " alumnos.");

    }
}
