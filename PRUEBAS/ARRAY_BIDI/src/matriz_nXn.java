
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
public class matriz_nXn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        3) Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra matriz.
        Los valores y la longitud, seran insertados por el usuario. Mostrar las matrices originales y el resultado.
         */

 /*  Scanner entrada = new Scanner(System.in);
        try {
            System.out.print("Introducir longitud (n) de las matrices  :");
            int n = entrada.nextInt();

            while (n <= 1) {

                System.out.println("El numero tiene que ser mayor que 1");
                System.out.print("Introducir longitud (n) de las matrices :");
                n = entrada.nextInt();
            }

            int arr[][] = new int[n][n];
            int arr2[][] = new int[n][n];
            int suma[][] = new int[n][n];
            System.out.println("Valores del matriz 1 :");
            for (int i = 0; i < arr.length; i++) {

                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print("Ingresa valores de posicion (" + i + ") y (" + j + ") :");
                    arr[i][j] = entrada.nextInt();

                }

            }
            System.out.println("Valores del matriz 2 :");
            for (int i = 0; i < arr.length; i++) {

                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print("Ingresa valores de posicion (" + i + ") y (" + j + ") :");
                    arr2[i][j] = entrada.nextInt();

                }

            }

            //muestra por pantalla
            for (int i = 0; i < arr.length; i++) {
                System.out.println(Arrays.toString(arr[i]));

            }
            System.out.println("");
            for (int i = 0; i < arr2.length; i++) {
                System.out.println(Arrays.toString(arr2[i]));

            }
            //suma de arrays
            System.out.println("La suma de de los valores de los 2 arrays es :");

            for (int i = 0; i < suma.length; i++) {
                for (int j = 0; j < suma[i].length; j++) {
                    suma[i][j] = arr[i][j] + arr2[i][j];

                }
                System.out.println(Arrays.toString(suma[i]));

            }
        } catch (Exception InputMismatchException) {
            System.out.println("Los numeros tiene que ser entero");
        }*/
        Scanner entrada = new Scanner(System.in);
        int tabla[][] = new int[10][10];
        int mult = 1;
        for (int i = 1; i <= tabla.length; i++) {
            System.out.println("");
            System.out.printf("%10s %n", "TABLA :" + i);

            for (int k = 1; k <= tabla.length; k++) {

                mult = i * k;
                System.out.println(i + " X " + k + " = " + mult);

            }

        }

    }

}
