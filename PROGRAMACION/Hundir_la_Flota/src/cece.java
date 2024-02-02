
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class cece {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] tablajugador;
        char[][] tablapc;
        int[] cantidad;
        String[] barcos = new String[]{"L", "BBB", "ZZZZ", "PPPPP"};
        boolean sw = true;
        int seleccion;
        int filas = 10, columnas = 10, tiros;
        int[] totalbarcos = new int[2];
        do {
            seleccion = menu();
            switch (seleccion) {
                case 1:
                case 2:
                case 3:
                    sw = false;
                    break;
                case 4:
                    filas = filas();
                    columnas = columnas();
                    sw = false;
                    break;
                default:
                    System.out.println("Ingrese un Modo correcto (1,2,3,4)");
            }
        } while (sw);
        tiros = tiros(seleccion);
        tablajugador = creartabla(filas, columnas);
        tablapc = creartabla(filas, columnas);
        cantidad = cantidadbarcos(seleccion);
        rellenartableros(tablajugador, tablapc);
        dsds(cantidad, tablapc, barcos);
        totalbarcos[1] = sumarbarcos(cantidad);
        mostrartabla(tablapc);
        do {
            mostrartabla(tablajugador);
            System.out.println("Le quedan un total de " + tiros + "Tiros");
            totalbarcos[0] += pedircoordenadas(tablajugador, tablapc);
            System.out.println(totalbarcos[0]);
            tiros--;
        } while (tiros > 0 && totalbarcos[0] != totalbarcos[1]);
        finish(totalbarcos, tiros);
        mostrartabla(tablapc);
        mostrartabla(tablajugador);
        entrada.close();
    }

    public static void finish(int totalbarcos[], int tiros) {
        if (tiros >= 0 && totalbarcos[0] == totalbarcos[1]) {
            System.out.println("-".repeat(30));
            System.out.println("-".repeat(30));
            System.out.printf("%20S", "GANASTES\n");
            System.out.println("-".repeat(30));
            System.out.println("-".repeat(30));
        } else {
            System.out.println("-".repeat(30));
            System.out.println("-".repeat(30));
            System.out.printf("%20S", "Perdistes\n");
            System.out.println("-".repeat(30));
            System.out.println("-".repeat(30));
        }
    }

    public static int menu() {
        System.out.println("-".repeat(30));
        System.out.println(" ".repeat(13) + "MENU");
        System.out.println("1.Facil");
        System.out.println("2.Normal");
        System.out.println("3.Dificil");
        System.out.println("4.Personalizado");
        System.out.println("-".repeat(30));

        return entrada.nextInt();
    }

    public static int tiros(int a) {
        int tiros = 50;
        switch (a) {
            case 1:
                tiros = 50;
                break;
            case 2:
                tiros = 30;
                break;
            case 3:
                tiros = 10;
                break;
            case 4:
                System.out.println("Cuantos Tiros Desea?");
                tiros = entrada.nextInt();
                break;
        }
        return tiros;
    }

    public static int numramdom(int a) {
        return (int) (Math.random() * (a));
    }

    public static int[] cantidadbarcos(int a) {
        int cantidad[] = new int[4];
        switch (a) {
            case 1:
                cantidad = new int[]{5, 3, 1, 1};
                break;
            case 2:
                cantidad = new int[]{2, 1, 1, 1};
                break;
            case 3:
                cantidad = new int[]{1, 1, 0, 0};
                break;
            case 4:
                for (int i = 0; i < cantidad.length; i++) {
                    cantidad[i] = pedirbarcos(i);
                }
                break;
        }
        return cantidad;
    }

    public static int sumarbarcos(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                total = array[i] * (i + 1);
            } else {
                total = total + (array[i] * (i + 2));
            }
        }
        return total;
    }

    public static void rellenartableros(char tablero1[][], char tablero2[][]) {
        for (int i = 0; i < tablero1.length; i++) {
            for (int j = 0; j < tablero1[i].length; j++) {
                tablero1[i][j] = '-';
                tablero2[i][j] = '-';
            }
        }
    }

    public static char[][] creartabla(int filas, int columnas) {
        char[][] tablajugador = new char[filas][columnas];
        return tablajugador;
    }

    public static int filas() {
        boolean sw = true;
        int filas;
        do {
            System.out.println("Ingrese el tamaño de filas:");
            filas = entrada.nextInt();
            if (filas <= 3) {
                System.out.println("Ingrese un tamaño correcto (4 o mayor)");
            } else {
                sw = false;
            }

        } while (sw);
        return filas;
    }

    public static int columnas() {
        boolean sw = true;
        int columnas;
        do {

            System.out.println("Ingrese el tamaño de Columnas:");
            columnas = entrada.nextInt();
            if (columnas <= 4) {
                System.out.println("Ingrese un tamaño correcto (5 o mayor)");
            } else {
                sw = false;
            }

        } while (sw);
        return columnas;
    }

    public static void mostrartabla(char[][] tabla) {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < tabla[0].length; i++) {
            if (i == 0) {
                System.out.printf("%4S", i);
            } else {
                System.out.printf("%3S", i);
            }
        }
        System.out.println("");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(letras.charAt(i));
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.printf("%3S", tabla[i][j]);
            }
            System.out.println("");
        }
    }

    public static void rellenarbarcos(char tabla[][], int conteo[], String[] barcos, int seleccion, int fila, int columnas) {
        switch (seleccion) {
            case 0:
                for (int i = 0; i < conteo[seleccion]; i++) {
                    fila = numramdom(tabla.length - 1);
                    columnas = numramdom(tabla[0].length - 1);
                    while (comprobar(tabla, fila, columnas, barcos, seleccion)) {
                        fila = numramdom(tabla.length - 1);
                        columnas = numramdom(tabla[0].length - barcos[seleccion].length());
                    }
                    tabla[fila][columnas] = barcos[seleccion].charAt(0);
                }
                break;
            case 1:
            case 2:
                for (int i = 0; i < conteo[seleccion]; i++) {
                    fila = numramdom(tabla.length - 1);
                    columnas = numramdom(tabla[0].length - barcos[seleccion].length());
                    while (comprobar(tabla, fila, columnas, barcos, seleccion)) {
                        fila = numramdom(tabla.length - 1);
                        columnas = numramdom(tabla[0].length - barcos[seleccion].length());
                    }
                    for (int j = 0; j < barcos[seleccion].length(); j++) {
                        tabla[fila][columnas + j] = barcos[seleccion].charAt(0);
                    }
                }
                break;
            case 3:
                for (int i = 0; i < conteo[seleccion]; i++) {
                    fila = numramdom(tabla.length - barcos[seleccion].length());
                    columnas = numramdom(tabla[0].length - 1);
                    while (comprobar(tabla, fila, columnas, barcos, seleccion)) {
                        fila = numramdom(tabla.length - 1);
                        columnas = numramdom(tabla[0].length - barcos[seleccion].length());
                    }
                    for (int j = 0; j < barcos[seleccion].length(); j++) {
                        tabla[fila + j][columnas] = barcos[seleccion].charAt(0);
                    }
                }
                break;
        }
    }

    public static int pedirbarcos(int a) {
        String nombresbarcos[] = new String[]{"Llanxa", "Vaixell", "Cuirassat", "Portaavions"};
        System.out.println("Ingrese un total de " + nombresbarcos[a] + ":");
        return entrada.nextInt();
    }

    public static boolean comprobar(char matriz[][], int fila, int columna, String[] barcos, int count) {
        boolean sw = false;
        if (count == 0) {
            if (!sw) {
                sw = matriz[fila][columna] != '-';
            }
        }
        if (count == 1 || count == 2) {
            for (int i = 0; i < barcos[count].length(); i++) {
                if (!sw) {
                    sw = matriz[fila][columna + i] != '-';
                }
            }
        } else {
            for (int i = 0; i < barcos[count].length(); i++) {
                if (!sw) {
                    sw = matriz[fila + i][columna] != '-';
                }
            }
        }
        return sw;
    }

    public static int disparar(char tablero[][], char tableropc[][], int x, int y) {
        int hit = 0;
        if (tableropc[x][y] == '-') {
            System.out.println("Aigua");
            tablero[x][y] = 'A';
        } else {
            System.out.println("Tocat");
            tablero[x][y] = 'X';
            hit++;
        }
        return hit;
    }

    public static int pedircoordenadas(char tablero[][], char tableropc[][]) {
        boolean sw = true;
        int y, x;

        do {
            System.out.println("Ingrese la letra:");
            x = entrada.next().toUpperCase().charAt(0) - 65;
            if (x >= tablero.length && x < 0) {
                System.out.println("Ingrese un numero entre los que elijio");
            } else {
                sw = false;
            }
        } while (sw);

        do {
            System.out.println("Ingrese el numero:");
            y = entrada.nextInt();
            if (y >= tablero[0].length && y < 0) {
                System.out.println("Ingrese un numero entre los que elijio");
            } else {
                sw = true;
            }
        } while (!sw);
        return disparar(tablero, tableropc, x, y);
    }

    public static void dsds(int[] cantidad, char matriz[][], String[] barcos) {
        int[] comprobacion = new int[]{0, 0, 0, 0};         //Seleccion rellenar barcos tiene que pedir el contador
        int fila = 0, columnas = 0;
        int count = 3;
        while (count >= 0) {
            switch (count) {
                case 0:
                case 1:
                case 2:
                case 3:
                    rellenarbarcos(matriz, cantidad, barcos, count, fila, columnas);
                    break;
            }
            count--;
        }
    }
}
