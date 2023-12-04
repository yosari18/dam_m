
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Media_mediana_moda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese tamaño del array :");
        int n = entrada.nextInt();
        int suma = 0;
        int media ;
        double mediana = 0;
        

        int miarray[] = new int[n];
        //media
        for (int i = 0; i < miarray.length; i++) {
            System.out.print("Numero # " + (i + 1) + " :");
            miarray[i] = entrada.nextInt();
            suma += miarray[i];

        }
        media = suma / miarray.length;
        Arrays.sort(miarray);
        //mediana
        for (int i = 0; i < miarray.length; i++) {
            if (miarray.length % 2 == 0) {
                int media1 = miarray.length / 2 - 1;
                int media2 = miarray.length / 2;
                mediana = miarray[media1] + miarray[media2] / 2;

            } else {
                int medi = miarray.length / 2;
                mediana = miarray[medi];
            }

        }
        //moda
        int repetir = 0;
        int moda=0;

        for (int i = 0; i < miarray.length; i++) {
            int veces = 0;
            for (int j = 0; j < miarray.length; j++) {
                if (miarray[i] == miarray[j]) {
                    veces++;

                } else if (veces > repetir) {
                    moda = miarray[veces];
                    

                }

            }

        }

        System.out.println("La media " + media);
        System.out.println("mediana " + mediana);
        System.out.println("moda " +moda+ " se repite "+repetir);
    }
}
