
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class personalizado {

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
            System.out.printf("%3s", i);
        }
        System.out.println("");
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
        if (esVertical && fila + longitud <= matriz.length) {
            for (int i = fila; i < fila + longitud; i++) {
                if (matriz[i][columna] != '-') {
                    return false; // Hay colisión, el espacio no está vacío
                }
            }
        } else if (!esVertical && columna + longitud <= matriz[0].length) {
            for (int i = columna; i < columna + longitud; i++) {
                if (matriz[fila][i] != '-') {
                    return false; // Hay colisión, el espacio no está vacío
                }
            }
        } else {
            return false; // Fuera de límites de la matriz
        }
        return true; // No hay colisión, el espacio está vacío
    }

    public static void colocarBarcos(char[][] matriz, char letra, int longitud, int cantidad, boolean vertical) {
        int barcosColocados = 0;

        while (barcosColocados < cantidad) {
            int fila, columna;
            int intentos = 0;

            while (intentos < 100) {  // Límite de intentos para evitar bucles infinitos
                fila = aleatorio(matriz.length);
                columna = aleatorio(matriz[0].length);

                if (verificarEspacio(matriz, fila, columna, longitud, vertical)) {
                    if (vertical) {
                        for (int i = fila; i < fila + longitud; i++) {
                            matriz[i][columna] = letra;
                        }
                    } else {
                        for (int i = columna; i < columna + longitud; i++) {
                            matriz[fila][i] = letra;
                        }
                    }
                    barcosColocados += longitud;  // Incrementar por la cantidad de barcos colocados
                    break;  // Sale del bucle si el barco se coloca correctamente
                }

                intentos++;
            }

        }
    }

    public static void lancha(char[][] matriz, char letra, int cantidad) {
        for (int j = 0; j < cantidad; j++) {
            int fila, columna;
            do {
                fila = aleatorio(matriz.length);
                columna = aleatorio(matriz[0].length);
            } while (matriz[fila][columna] != '-');
            matriz[fila][columna] = letra;
        }
    }

    public static void disparo(char[][] matriz, char[][] matrizOculta, int tiros) {
        char fila = 0;
        int columna = 0;
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
        System.out.println("Agotaste tus Balas");
        mostrarResultado(matriz);
    }

    public static void mostrarResultado(char[][] matriz) {
        System.out.println("Resultado final:");
        mostrarMatriz('A', matriz);
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

    public static int menu(char[][] matriz, char[][] matrizOculta, int elegir) {
        int tiros;
        switch (elegir) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                tiros = 2;
                llenarMatriz(matriz, '-');
                llenarMatriz(matrizOculta, '-');
                colocarBarcos(matriz, 'L', 1, 1, false); // L se coloca en diferentes posiciones
                colocarBarcos(matriz, 'B', 3, 1, false);
                mostrarMatriz('A', matrizOculta);
                disparo(matriz, matrizOculta, tiros);
                break;
            case 4:
                personalizado();
                break;
            default:
                System.out.println("El número que ha elegido no existe");
        }
        return elegir;
    }

    public static void personalizado() {
        System.out.print("Introducir tamaño de fila (máximo 26)  : ");
        int filasPers = entrada.nextInt();
        System.out.print("Introducir tamaño de columna (máximo 56): ");
        int columnasPers = entrada.nextInt();
        System.out.print("Introducir cantidad de lanchas (L)     : ");
        int lanchas = entrada.nextInt();
        System.out.print("Introducir cantidad de barcos (BBB)    : ");
        int barcos = entrada.nextInt();
        System.out.print("Introducir cantidad de acorazado (ZZZZ) : ");
        int acorazado = entrada.nextInt();
        System.out.print("Cantidad de portaaviones (PPPPP)       : ");
        int portaaviones = entrada.nextInt();
        System.out.print("Cantidad de tiros                      : ");
        int tiros = entrada.nextInt();

        char[][] matriz = new char[filasPers][columnasPers];
        char[][] matrizOculta = new char[filasPers][columnasPers];

        llenarMatriz(matriz, '-');
        llenarMatriz(matrizOculta, '-');
        lancha(matriz, 'L', lanchas);
        colocarBarcos(matriz, 'P', 5, portaaviones, true);
        colocarBarcos(matriz, 'B', 3, barcos, false);
        colocarBarcos(matriz, 'Z', 4, acorazado, false);

        mostrarMatriz('A', matrizOculta);
        disparo(matriz, matrizOculta, tiros);
    }

    public static void elegirNivel() {
        char[][] matriz = new char[10][10];
        char[][] matrizOculta = new char[10][10];
        System.out.println("    ///////////////////// \n   ///   HUNDIR      /// \n  ///      LA       /// \n ///     FLOTA     ///\n/////////////////////");
        try {
            System.out.println("**MENU**");
            System.out.println("1)Facil");
            System.out.println("2)Medio");
            System.out.println("3)Dificil");
            System.out.println("4)Personalizado");
System.out.print("Elige: ");
            int elegir = entrada.nextInt();
            menu(matriz, matrizOculta, elegir);
        } catch (InputMismatchException e) {
            System.out.println("**ERROR** Entrada no válida. Debes ingresar un número.");
            entrada.nextLine(); // Limpia el buffer del scanner
        }
    }

    public static void main(String[] args) {
        elegirNivel();
    }
}
