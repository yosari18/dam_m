/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class flot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[][] matriz = new char[5][10];

        // Llenar la matriz con '-'
        llenarMatriz(matriz, '-');

        // Insertar la letra 'P' cinco veces de manera horizontal
        insertarLetraHorizontal(matriz, 'P', 5, 3); // 2 es la fila donde se insertará

        // Mostrar la matriz
        mostrarMatriz(matriz);
    }

    // Función para llenar una matriz con un carácter específico
    public static void llenarMatriz(char[][] matriz, char caracter) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = caracter;
            }
        }
    }

    // Función para insertar un carácter de manera horizontal en una fila específica
    public static void insertarLetraHorizontal(char[][] matriz, char letra, int cantidad, int fila) {
        for (int i = 0; i < cantidad; i++) {
            matriz[fila][i] = letra;
        }
    }

    // Función para mostrar una matriz
    public static void mostrarMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
