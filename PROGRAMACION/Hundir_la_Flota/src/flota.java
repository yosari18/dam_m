
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * @author yosari
 */
public class flota {

    static Scanner entrada = new Scanner(System.in);

    /**
     * Ompli la matriu amb el caràcter especificat.
     *
     * @param matriz Matriu a omplir.
     * @param caracter Caràcter especifique
     */
    public static void llenarMatriz(char[][] matriz, char caracter) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = caracter;
            }
        }
    }

    /**
     * Mostra la matriu en format tabular amb lletres de fila i números de
     * columna.
     *
     * @param letra Letra de inicio para las filas.
     * @param matriz Matriz a mostrar.
     */
    public static void mostrarMatriz(char letra, char[][] matriz) {
        for (int j = 0; j < matriz[0].length; j++) {
            System.out.printf("%3s", j);
        }
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(letra++);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Genera un número aleatori entre 0 i el valor màxim especificat
     *
     * @param max Valor màxim per a la generació del número aleatori.
     * @return resultado
     */
    public static int aleatorio(int max) {
        return (int) (Math.random() * max);
    }

    /**
     * Verifica si l'espai en la matriu està disponible per a col·locar un
     * vaixell en una posició específica.
     *
     * @param matriz Matriu principal que representa el tauler de joc.
     * @param fila Fila on s'intenta col·locar els vaixells.
     * @param columna Columna on s'intenta col·locar els vaixells.
     * @param longitud Longitud els vaixells que es col·locarà.
     * @param esVertical Indica si els vaixells es col·locaran de manera
     * vertical TRUE o horitzontal FALSE
     *
     * @return true si l'espai està disponible i dins dels límits de la matriu,
     * *false si xoquen o està fora de límits.
     */
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

    /**
     * Col·loca un vaixell en la matriu de joc de manera aleatòria,
     * assegurant-se que no xoquen amb altres vaixells
     *
     * @param matriz Matriu principal que representa el tauler de joc
     * @param letra Símbol que representa el tipus de vaixell
     * @param longitud Longitud del vaixell que es col·locarà
     * @param cantidad Quantitat de vaixells del mateix tipus que s'han de
     * col·locar.
     * @param vertical Indica si el vaixell ha de col·locar-se de manera
     * vertical
     */
    public static void colocarBarcos(char[][] matriz, char letra, int longitud, int cantidad, boolean vertical) {
        while (0 < cantidad) {
            int fila, columna;
            do {
                fila = aleatorio(matriz.length);
                columna = aleatorio(matriz[0].length);
            } while (!verificarEspacio(matriz, fila, columna, longitud, vertical));
            if (vertical) {
                for (int i = fila; i < fila + longitud; i++) {
                    matriz[i][columna] = letra;
                }
            } else {
                for (int i = columna; i < columna + longitud; i++) {
                    matriz[fila][i] = letra;
                }
            }
            cantidad--;
        }
    }

    /**
     * Realitza l'execució dels trets del jugador.
     *
     * @param matriz Matriu principal que conté la ubicació dels vaixells.
     * @param matrizOculta Matriu oculta que mostra els resultats de els trets.
     * @param tiros Nombre total de tirs disponibles.
     */
    public static void disparo(char[][] matriz, char[][] matrizOculta, int tiros) {
        char fila = 0;
        int columna = 0;
        while (tiros > 0) {
            System.out.print("Ingressar fila: ");
            entrada.nextLine();
            fila = entrada.nextLine().toUpperCase().charAt(0);
            while ((fila < 'A' || fila > 'Z') || (fila - 'A' >= matriz.length)) {
                System.out.print("La fila " + fila + " no existe en la matriz\nIngresar fila :");
                fila = entrada.nextLine().toUpperCase().charAt(0);
            }
            System.out.print("Ingressar columna: ");
            columna = entrada.nextInt();
            while (columna < 0 || columna >= matriz[0].length) {
                System.out.print("La columna " + columna + " no existix en la matriu\nIngressar columna: ");
                columna = entrada.nextInt();
            }
            tiros--;
            System.out.println("OjO et queda " + tiros + " tirs OjO");
            tocado_agua(fila, columna, matriz, matrizOculta);
        }
        System.out.println("Vas esgotar les teues Bales");
        mostrarResultado(matriz);
    }

    /**
     * Realitza la verificació d'impacte i actualitza la matriu oculta.
     *
     * @param fila Fila del tret (representada per una lletra).
     * @param columna Columna del tret.
     * @param matriz Matriu principal que conté la ubicació dels vaixells.
     * @param matrizOculta Matriu oculta que mostra els resultats de els trets.
     */
    public static void tocado_agua(char fila, int columna, char[][] matriz, char[][] matrizOculta) {
        if (matriz[fila - 'A'][columna] == 'L' || matriz[fila - 'A'][columna] == 'P' || matriz[fila - 'A'][columna] == 'B' || matriz[fila - 'A'][columna] == 'Z') {
            matrizOculta[fila - 'A'][columna] = 'X';
            System.out.println("Tocat");
        } else {
            matrizOculta[fila - 'A'][columna] = 'A';
            System.out.println("Aigua");
        }
        mostrarMatriz('A', matrizOculta);

    }

    /**
     * Revela les posicions dels vaixells i indica si va guanyar o va perdre
     *
     * @param matriz Matriu del joc.
     */
    public static void mostrarResultado(char[][] matriz) {

        System.out.printf("%27s %n %25s %n %25s %n ", "* ".repeat(11), "*  RESULTAT FINAL  *", " *".repeat(11));
        System.out.println("");
        mostrarMatriz('A', matriz);
        System.out.println(mostrarVictoria(matriz));
    }

    /**
     * Menú principal del joc amb diferents nivells i opció personalitzada.
     *
     * @param matriz Matriu principal del joc.
     * @param matrizOculta Matriu oculta
     * @param elegir Opció seleccionada per l'usuari.
     * @return Opció triada per l'usuari.
     */
    public static int menu(char[][] matriz, char[][] matrizOculta, int elegir) {
        int tiros;
        switch (elegir) {
            case 1:
                tiros = 2;
                llenarMatriz(matriz, '-');
                llenarMatriz(matrizOculta, '-');
                colocarBarcos(matriz, 'L', 1, 5, true);
                colocarBarcos(matriz, 'P', 5, 1, true);
                colocarBarcos(matriz, 'B', 3, 3, false);
                colocarBarcos(matriz, 'Z', 4, 1, false);
                mostrarMatriz('A', matrizOculta);
                disparo(matriz, matrizOculta, tiros);
                break;
            case 2:
                tiros = 3;
                llenarMatriz(matriz, '-');
                llenarMatriz(matrizOculta, '-');
                colocarBarcos(matriz, 'L', 1, 2, true);
                colocarBarcos(matriz, 'P', 5, 1, true);
                colocarBarcos(matriz, 'B', 3, 1, false);
                colocarBarcos(matriz, 'Z', 4, 1, false);
                mostrarMatriz('A', matrizOculta);
                disparo(matriz, matrizOculta, tiros);
                break;
            case 3:
                tiros = 2;
                llenarMatriz(matriz, '-');
                llenarMatriz(matrizOculta, '-');
                colocarBarcos(matriz, 'L', 1, 1, false);
                colocarBarcos(matriz, 'B', 3, 1, false);
                mostrarMatriz('A', matrizOculta);
                disparo(matriz, matrizOculta, tiros);
                break;
            case 4:
                personalizado();
                break;
            default:
                System.out.println("El número que ha triat no existix");
        }
        return elegir;
    }

    /**
     * Esta *funcion és cridada per la *funcion (*moatrarResultado)
     *
     * @param matriz Matriu del joc.
     * @return Missatge de victòria o derrota.
     */
    public static String mostrarVictoria(char[][] matriz) {
        boolean victoria = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 'L' || matriz[i][j] == 'P' || matriz[i][j] == 'B' || matriz[i][j] == 'Z') {
                    victoria = false; // Todavía hay barcos sin hundir
                }
            }
        }
        return (victoria) ? "¡Felicitats! Has afonat tots els vaixells. Vas guanyar!" : "Continua intentant. No has afonat tots els vaixells.";
    }

    /**
     * Inserida vaixells en una matriu personalitzada segons les especificacions
     * de l'usuari.
     *
     * @param filasPers Nombre de files per a la matriu personalitzada.
     * @param columnasPers Nombre de columnes per a la matriu personalitzada.
     */
    public static void inserta_barco_personalizado(int filasPers, int columnasPers) {
        System.out.print("Introduir quantitat de llanxes     (L) : ");
        int lanchas = entrada.nextInt();
        System.out.print("Introduir quantitat de vaixells  (BBB) : ");
        int barcos = entrada.nextInt();
        System.out.print("Introduir quantitat de cuirassat(ZZZZ) : ");
        int acorazado = entrada.nextInt();
        System.out.print("Quantitat de portaavions       (PPPPP) : ");
        int portaaviones = entrada.nextInt();
        System.out.print("Quantitat de tirs                      : ");
        int tiros = entrada.nextInt();
        char[][] matriz = new char[filasPers][columnasPers];
        char[][] matrizOculta = new char[filasPers][columnasPers];
        llenarMatriz(matriz, '-');
        llenarMatriz(matrizOculta, '-');
        colocarBarcos(matriz, 'L', 1, lanchas, true);
        colocarBarcos(matriz, 'B', 3, barcos, false);
        colocarBarcos(matriz, 'Z', 4, acorazado, false);
        colocarBarcos(matriz, 'P', 5, portaaviones, true);
        mostrarMatriz('A', matrizOculta);
        disparo(matriz, matrizOculta, tiros);
    }

    //Opció personalitzada que permet a l'usuari configurar la grandària de la matriu i la quantitat de vaixells.
    public static void personalizado() {
        System.out.print("Introduir grandària de fila (màxim  26)  : ");
        int filasPers = entrada.nextInt();
        System.out.print("Introduir grandària de columna(màxim  56): ");
        int columnasPers = entrada.nextInt();
        do {
            if (filasPers >= 26) {
                System.out.printf("%35s %n", "** La fila " + filasPers + " és superior a 26 **");
                System.out.print("Introduir grandària de fila (màxim  26)  : ");
                filasPers = entrada.nextInt();
            }
            if (columnasPers >= 56) {
                System.out.printf("%38s %n", "** La columna " + columnasPers + " es superior a 56 **");
                System.out.print("Introduir grandària de columna(màxim  56)): ");
                columnasPers = entrada.nextInt();
            }
        } while (filasPers >= 26 || columnasPers >= 56);
        inserta_barco_personalizado(filasPers, columnasPers);
    }

    /**
     * Mètode principal que inicia el joc permetent a l'usuari triar el nivell
     * de dificultat.
     */
    public static void elegirNivel() {
        char[][] matriz = new char[10][10];
        char[][] matrizOculta = new char[10][10];
        System.out.printf("    " + "/".repeat(21) + "\n   ///   HUNDIR      /// \n  ///      LA       /// \n ///     FLOTA     ///\n" + "/".repeat(21));
        try {
            System.out.println("\n ## MENU ##");
            System.out.println("1)Facil");
            System.out.println("2)Medio");
            System.out.println("3)Dificil");
            System.out.println("4)Personalizado");
            System.out.print("Elige: ");
            int elegir = entrada.nextInt();
            menu(matriz, matrizOculta, elegir);
        } catch (InputMismatchException e) {
            System.out.println("**ERROR** Entrada no válida. Debes ingresar un número.");
            entrada.nextLine();
        }
    }

    public static void main(String[] args) {
        elegirNivel();
    }
}
