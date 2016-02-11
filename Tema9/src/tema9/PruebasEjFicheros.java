package tema9;

import java.io.*;
import java.util.*;

public class PruebasEjFicheros {

    public static void main(String[] args) {
        String fichero1 = "file1.txt";
        String fichero2 = "file2.txt";
        String fichero3 = "file3.txt";
        FileWriter fw = null;
        BufferedWriter bw = null;
        BufferedReader br = null, br1 = null;

        System.out.println("Escribe un separador: ");
        Scanner scan = new Scanner(System.in);
        String hueco = scan.nextLine();

        try {
            FileReader fr1 = new FileReader(fichero1);
            br = new BufferedReader(fr1);
            FileReader fr2 = new FileReader(fichero2);
            br1 = new BufferedReader(fr2);
            fw = new FileWriter(fichero3);
            bw = new BufferedWriter(fw);

        }
    }
}
