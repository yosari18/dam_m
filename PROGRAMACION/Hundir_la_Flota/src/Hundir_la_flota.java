/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class Hundir_la_flota {
static Scanner entrada = new Scanner(System.in);

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
            for (int i = 0; i <= cantidad; i++) {

                matriz[fila][j + column] = letra;
            }
        }
    }

    public static void lancHorizontal(char[][] matriz, char letra) {

        for (int j = 0; j < 5; j++) {
            matriz[aleatorio()][aleatorio()] = letra;
        }
    }

    public static int aleatorio() {
        // int fila = (int) (Math.random() * 6);
        return (int) (Math.random() * 10);
    }

    public static int menu() {
        char[][] matriz = new char[10][10];
        System.out.println("**MENÙ**");
        System.out.println("1)Fácil");
        System.out.println("2)Medio");
        System.out.println("3)Difícil");
        System.out.println("4)Personalizado");
        System.out.print("Elige: ");
        int menu = entrada.nextInt();
        switch (menu) {
            case 1:
                llenarMatriz(matriz, '-');
                mostrarMatriz('A', matriz);
                System.out.print("Ingresar fila: ");
                entrada.nextLine();
                char fila = entrada.nextLine().toLowerCase().charAt(0);
                System.out.print("Ingresar columna: ");
                //int columna=entrada.nextInt();

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;

            default:
                throw new AssertionError();
        }

        return menu;
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

    public static void jugador(char[][] matriz) {
        // llenarMatriz(matriz, '-');
        //lancHorizontal(matriz, 'L', 5);

    }

    public static void main(String[] args) {
        char[][] matriz = new char[10][10];
        menu();

        // Llenar la matriz con '-'
        // llenarMatriz(matriz, '-');
        // porVertical(matriz, 'P', 5);
        //acoHorizontal(matriz, 'Z', 4);
        //barcHorizontal(matriz, 'B', 3);
        //lancHorizontal(matriz, 'L');
        // mostrarMatriz('A', matriz);
        //jugador (matriz);
    }

}