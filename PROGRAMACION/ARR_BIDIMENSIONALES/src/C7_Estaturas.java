
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class C7_Estaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String paises[] = {"Espana", "Rusia", "Japon", "Australia"};
        int estaturas[][] = new int[4][10];
        boolean primIteracion = true;
        int max = 210, min = 140;
        int media, maxima, minima;

        System.out.printf("%66s", "MED MIN MAX");
        for (int i = 0; i < estaturas.length; i++) {
            int suma = 0;
            maxima = estaturas[0][0];
            minima = estaturas[0][0];
            System.out.println("");
            System.out.printf(" %10s: ", paises[i]);
            for (int j = 0; j < estaturas[i].length; j++) {
                estaturas[i][j] = (int) (Math.random() * (max - min + 1) + min);
                suma += estaturas[i][j];
                System.out.print(estaturas[i][j] + " ");

                if (primIteracion) {// En la primera iteración, inicializar maxima y minima con el primer valor
                    maxima = estaturas[i][j];
                    minima = estaturas[i][j];
                    primIteracion = false;
                } else {
                    if (estaturas[i][j] > maxima) {
                        maxima = estaturas[i][j];
                    }
                    if (estaturas[i][j] < minima) {
                        minima = estaturas[i][j];
                    }
                }
            }
            media = suma / estaturas[i].length;
            System.out.print("| ");
            System.out.print(media + " " + minima + " " + maxima + " ");
        }

    }
}
