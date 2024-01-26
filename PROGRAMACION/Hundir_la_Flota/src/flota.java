
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class flota {
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

    public static int aleatorio(char[][] matriz) {
        return (int) (Math.random() * matriz.length);
    }

    public static void lancHorizontal(char[][] matriz, char letra) {
        for (int j = 0; j < 5; j++) {
            matriz[aleatorio(matriz)][aleatorio(matriz)] = letra;
        }
    }

    public static void disparos(char[][] matriz, char[][] matrizOculta, char fila, int columna) {
        try {
            int tiros = 3;
            //   llenarMatriz(matrizOculta, '-'); // Llena la matriz oculta con guiones
            // lancHorizontal(matriz, 'L'); // Llama a lancHorizontal una vez al principio del juego
            // mostrarMatriz('A', matrizOculta);
            insertar(matriz, matrizOculta);
            while (tiros > 0) {

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
                System.out.println("!OjO! Te queda " + tiros + " tiros ");
                tocado_agua(fila, columna, matriz, matrizOculta);
            }
            System.out.println("tiros agotados");
            mostrarResultado(matriz);
        } catch (Exception ArrayIndexOutOfBoundsException) {
            System.out.println("La fila " + fila + " no existe");
        }
    }

    public static void tocado_agua(char fila, int columna, char[][] matriz, char[][] matrizOculta) {
        if (matriz[fila - 'A'][columna] == 'L') {
            matrizOculta[fila - 'A'][columna] = 'X'; // Marca con X si toca
            System.out.println("Tocado");
        } else {
            matrizOculta[fila - 'A'][columna] = 'A'; // Marca con A si no toca
            System.out.println("Agua");
        }
        mostrarMatriz('A', matrizOculta);
    }

    public static void insertar(char[][] matriz, char[][] matrizOculta) {

        llenarMatriz(matrizOculta, '-'); // Llena la matriz oculta con guiones
        lancHorizontal(matriz, 'L'); // Llama a lancHorizontal una vez al principio del juego
        mostrarMatriz('A', matrizOculta);
    }

    public static void mostrarResultado(char[][] matriz) {
        System.out.println("Resultado final:");
        mostrarMatriz('A', matriz);
    }

    public static int menu(char[][] matriz, char[][] matrizOculta, char fila, int columna) {
        int opcion = 0;
        boolean salir = true;
        try {
            System.out.println("    ///////////////////// \n   ///   HUNDIR      /// \n  ///      LA       /// \n ///     FLOTA     ///\n/////////////////////");
            do {
                System.out.println("\n##MENU ##");
                System.out.println("1)Facil");
                System.out.println("2)Medio");
                System.out.println("3)Dificil");
                System.out.println("4)Personalizado");
                System.out.println("5)Salir");
                System.out.print("Elige: ");
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        disparos(matriz, matrizOculta, fila, columna);
                        break;
                    case 2:
                        System.out.println("hola 2");
                        break;
                    case 3:
                        System.out.println("hola 3");
                        break;
                    case 4:
                        System.out.println("hola 4");
                        break;
                    case 5:
                        salir = false;
                        break;
                    default:
                        System.out.println("opcion que eligio no existe");
                }
            } while (salir);
        } catch (Exception InputMismatchException) {
            System.out.println("Ingresar numeros enteros");
        }
        return opcion;
    }

    public static void main(String[] args) {
        char[][] matriz = new char[10][10];
        char[][] matrizOculta = new char[10][10];
        char fila = 0;
        int columna = 0;

        menu(matriz, matrizOculta, fila, columna);
    }
}