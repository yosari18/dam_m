/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class Hundir_la_flota {

  static Scanner entrada = new Scanner(System.in);

    public static void llenarMatriz(char[][] matriz, char caracter) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = caracter;
            }
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

    public static int aleatorio(int max) {
        return (int) (Math.random() * max);
    }

    public static boolean verificarEspacio(char[][] matriz, int fila, int columna, int longitud, boolean esVertical) {
        if (esVertical) {
            for (int i = fila; i < fila + longitud; i++) {
                if (matriz[i][columna] != '-') {
                    return false; // Hay colisión, el espacio no está vacío
                }
            }
        } else {
            for (int i = columna; i < columna + longitud; i++) {
                if (matriz[fila][i] != '-') {
                    return false; // Hay colisión, el espacio no está vacío
                }
            }
        }
        return true; // No hay colisión, el espacio está vacío
    }

    public static void lancHorizontal(char[][] matriz, char letra, int cantidad) {

        for (int j = 0; j < cantidad; j++) {
            matriz[aleatorio(matriz.length)][aleatorio(matriz[0].length)] = letra;
        }
    }

    public static void lancVertical(char[][] matriz, char letra) {
        int filaInicial = aleatorio(matriz.length - 4); // Asegura espacio suficiente para la letra 'P' en posición vertical
        int columna = aleatorio(matriz[0].length);
        if (verificarEspacio(matriz, filaInicial, columna, 5, true)) {
            for (int i = filaInicial; i < filaInicial + 5; i++) {
                matriz[i][columna] = letra;
            }
        } else {
            lancVertical(matriz, letra); // Intenta de nuevo si hay colisión
        }
    }

    public static void barco(char[][] matriz, char letra) {
        int fila = aleatorio(matriz.length);
        int columna = aleatorio(matriz[0].length - 2);

        if (verificarEspacio(matriz, fila, columna, 3, false)) {
            for (int i = columna; i < columna + 3; i++) {
                matriz[fila][i] = letra;
            }
        } else {
            barco(matriz, letra); // Intenta de nuevo si hay colisión
        }
    }

    public static void acorazado(char[][] matriz, char letra) {
        int fila = aleatorio(matriz.length);
        int columna = aleatorio(matriz[0].length - 3);

        if (verificarEspacio(matriz, fila, columna, 4, false)) {
            for (int i = columna; i < columna + 4; i++) {
                matriz[fila][i] = letra;
            }
        } else {
            acorazado(matriz, letra); // Intenta de nuevo si hay colisión
        }
    }

    public static void disparo(char[][] matriz, char[][] matrizOculta, char fila, int columna, int tiros) {

        while (tiros > 0) {
            try {
                System.out.print("Ingresar fila: ");
                entrada.nextLine();
                fila = entrada.nextLine().toUpperCase().charAt(0);
                System.out.print("Ingresar columna: ");
                columna = entrada.nextInt();

                while (columna < 0 || columna >= matriz[0].length) {
                    System.out.print("**ERROR** Ingresar columna:");
                    columna = entrada.nextInt();
                }

                tiros--;
                System.out.println("Te queda " + tiros + " tiros ");
                tocado_agua(fila, columna, matriz, matrizOculta);
            } catch (InputMismatchException e) {
                System.out.println("**ERROR** Entrada no válida. Debes ingresar valores numéricos.");
                entrada.nextLine(); // Limpia el buffer del scanner para evitar bucles infinitos
            }
        }

        mostrarResultado(matriz);
    }

    public static void tocado_agua(char fila, int columna, char[][] matriz, char[][] matrizOculta) {
        if (matriz[fila - 'A'][columna] == 'L' || matriz[fila - 'A'][columna] == 'P' || matriz[fila - 'A'][columna] == 'B' || matriz[fila - 'A'][columna] == 'Z') {
            matrizOculta[fila - 'A'][columna] = 'X'; // Marca con X si toca
            System.out.println("Tocado");
        } else {
            matrizOculta[fila - 'A'][columna] = 'A'; // Marca con A si no toca
            System.out.println("Agua");
        }

        mostrarMatriz('A', matrizOculta);
    }

    public static void mostrarResultado(char[][] matriz) {
        System.out.println("Resultado final:");
        mostrarMatriz('A', matriz);
    }

    public static int menu(char[][] matriz, char[][] matrizOculta, char fila, int columna) {
        System.out.println("    ///////////////////// \n   ///   HUNDIR      /// \n  ///      LA       /// \n ///     FLOTA     ///\n/////////////////////");
        System.out.println("**MENU**");
        System.out.println("1)Facil");
        System.out.println("2)Medio");
        System.out.println("3)Dificil");
        System.out.println("4)Personalizado");
        System.out.print("Elige: ");
        int menu = entrada.nextInt();
        int tiros;
        switch (menu) {
            case 1:
                tiros = 20;
                llenarMatriz(matriz, '-');
                llenarMatriz(matrizOculta, '-');
                lancHorizontal(matriz, 'L',5);
                lancVertical(matriz, 'P'); // Llama a lancVertical para insertar la letra 'P' verticalmente
                barco(matriz, 'B');
                barco(matriz, 'B');
                barco(matriz, 'B');
                acorazado(matriz, 'Z');
                mostrarMatriz('A', matrizOculta);

                disparo(matriz, matrizOculta, fila, columna, tiros);
                break;
            case 2:
                tiros = 2;
                llenarMatriz(matriz, '-');
                llenarMatriz(matrizOculta, '-');
                lancHorizontal(matriz, 'L',2);
                lancVertical(matriz, 'P'); // Llama a lancVertical para insertar la letra 'P' verticalmente
                barco(matriz, 'B');
               acorazado(matriz, 'Z');
                mostrarMatriz('A', matrizOculta);
                disparo(matriz, matrizOculta, fila, columna, tiros);
                break;
            case 3:
               tiros =2;
               llenarMatriz(matriz, '-');
                llenarMatriz(matrizOculta, '-');
                lancHorizontal(matriz, 'L',1);
                 barco(matriz, 'B');
               mostrarMatriz('A', matrizOculta);
                disparo(matriz, matrizOculta, fila, columna, tiros);
                break;
            case 4:
                // Agrega la lógica para el nivel Personalizado
                break;
            default:
                throw new AssertionError();
        }
        return menu;
    }

    public static void main(String[] args) {
        char[][] matriz = new char[10][10];
        char[][] matrizOculta = new char[10][10];
        char fila = 0;
        int columna = 0;

        menu(matriz, matrizOculta, fila, columna);
    }
}
