/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hundir_la_flota;

/**
 *
 * @author yosari
 */
public class hundir_flota {

    public static void llenarMatriz(char[][] matriz, char caracter) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("%3s", i);
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = caracter;
            }
        }
        System.out.println("");
    }

    public static void porVertical(char[][] matriz, char letra, int cantidad) {
        int fila = (int) (Math.random() * 6);
        int column = (int) (Math.random() * matriz.length);
        for (int i = 0; i < cantidad; i++) {
            matriz[i + fila][column] = letra;

        }
    }

    public static void acoHorizontal(char[][] matriz, char letra, int cantidad) {

        int fila = (int) (Math.random() * matriz.length);
        int column = (int) (Math.random() * 6);
        for (int j = 0; j < cantidad; j++) {
            matriz[fila][j + column] = letra;
        }
    }

    public static void barcHorizontal(char[][] matriz, char letra, int cantidad) {

        for (int j = 0; j < cantidad; j++) {
            int fila = (int) (Math.random() * matriz.length);
            int column = (int) (Math.random() * 6);
            for (int i = 0; i <= j; i++) {

                matriz[fila][j + column] = letra;
            }
        }
    }

    public static void lancHorizontal(char[][] matriz, char letra, int cantidad) {

        for (int j = 0; j < cantidad; j++) {

            int fila = (int) (Math.random() * matriz.length);
            int column = (int) (Math.random() * 6);
            matriz[fila][column] = letra;

        }
    }

    public static void mostrarMatriz(char letra, char[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(letra++);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        char[][] matriz = new char[10][10];

        // Llenar la matriz con '-'
        llenarMatriz(matriz, '-');
        porVertical(matriz, 'P', 5);
        acoHorizontal(matriz, 'Z', 4);
        barcHorizontal(matriz, 'B', 3);
        lancHorizontal(matriz, 'L', 5);

        mostrarMatriz('A', matriz);
    }

}
