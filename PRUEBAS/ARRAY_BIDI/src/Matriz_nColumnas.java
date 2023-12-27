
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
public class Matriz_nColumnas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        2) Crear una matriz de 5 filas y n columnas (se pide al usuario). 
        Rellenarlo con números aleatorios entre 0 y 10.
         */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el numero de columnas :");
        int n = entrada.nextInt();
        int arr[][] = new int[5][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 11 + 0);

            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }

}
