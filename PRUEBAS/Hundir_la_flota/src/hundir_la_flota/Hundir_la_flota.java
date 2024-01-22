/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hundir_la_flota;

import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class Hundir_la_flota {

    static Scanner entrada = new Scanner(System.in);

    public static int[][] crear_tablero(int[][] arr) {

        char letra = 'A';
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3s", i);
        }
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(letra++);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" - ");
            }
            System.out.println("");
        }
        return arr;
    }

    public static void insertar_barco(int[][] arr) {
        int lancha = 1;
        int barco = 3;
        int acorazado = 4;
        int portaaviones = 5;
        String p = "p";
        int fila = (int) (Math.random() * arr.length);
        int columna = (int) (Math.random() * (arr[0].length - portaaviones + 1));

        System.out.println(fila+ " "+columna);
         for (int i = 0; i < arr.length; i++) {
           
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" - ");
            }
            System.out.println("");
        }

    }

    /* public static int disparo(int disparo) {

    }*/
    public static void mostrar_tablero() {

    }

    public static int menu_niveles() {

        System.out.println("***MENÚ***");
        System.out.println("1)Fácil");
        System.out.println("2)Medio");
        System.out.println("3)Difícil");
        System.out.println("4)Personalizado");
        System.out.print("Elige: ");
        int menu = entrada.nextInt();
        entrada.nextLine();
        return menu;

    }

    public static void main(String[] args) {
        int[][] arr = new int[10][10];

        char fila;
        int columna;
        switch (menu_niveles()) {
            case 1://nivel facil
                crear_tablero(arr);

                System.out.print("Ingresar fila :");
                fila = entrada.nextLine().charAt(0);
                System.out.print("Ingresar Columna :");
                columna = entrada.nextInt();

                while (columna > arr.length || columna < 0) {//Entra si columna esta fuera de limite
                    System.out.println("**Error fuera de rango**");
                    System.out.print("Ingresar Columna :");
                    columna = entrada.nextInt();

                }
                mostrar_tablero();

                break;
            case 2:

                insertar_barco(arr);
                break;

            case 3:

                break;

            case 4:

                break;

            default:
                throw new AssertionError();
        }

    }
}
