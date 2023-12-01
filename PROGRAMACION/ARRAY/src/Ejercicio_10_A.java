
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_10_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime un numero :");
        int n = entrada.nextInt();
        double alturas;
        double suma = 0;
        double miarray[] = new double[n];

        for (int i = 0; i < miarray.length; i++) {
            System.out.print("Ingresar altura #" + (i + 1) + " : ");
            miarray[i] = entrada.nextDouble();
            suma += miarray[i];
        }
        double media = suma / miarray.length;
        double max = miarray[0];
        double min = miarray[0];
        for (int i = 0; i < miarray.length; i++) {

            if (miarray[i] > max) {
                max = miarray[i];

            } else if (miarray[i] < min) {
                min = miarray[i];
            }

        }

        int encima = 0;
        int debajo = 0;
        for (int i = 0; i < miarray.length; i++) {
            if (miarray[i] > media) {
                encima++;
            }
            if (miarray[i] < media) {
                debajo++;
            }

        }
        System.out.println("la minima " + min);
        System.out.println("la maxima " + max);
        System.out.println("la media " + media);
        System.out.println("encima de la media " + encima);
        System.out.println("debajo de la media " + debajo);
    }

}
