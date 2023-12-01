
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_8_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double vector[] = new double[50];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Math.random();
            System.out.printf("%.2f ", vector[i]);
        }
        int cont = 0;
        System.out.print("\nDime un numero para vercuantos son mayorres o iguales :");
        double respuesta = entrada.nextDouble();
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > respuesta) {
                cont++;

            }

        }
        System.out.println("Cantidad de numeros mayores o iguales" + cont);
    }

}
