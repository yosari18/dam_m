
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
public class Quadrat_magic {

    public static boolean comprovar(int[][] matriu) {
        boolean res = true;
        int sumaColumnas;
        int sumaFila;
        int sumaDiago1;
        int sumaDiago2;
        for (int i = 0; i < matriu.length; i++) {//fila
            sumaFila = 0;
            sumaColumnas = 0;
            for (int j = 0; j < matriu[i].length; j++) {//columna
                sumaFila += matriu[i][j];
                sumaColumnas += matriu[j][i];

            }
            if (sumaFila != sumaFila || sumaColumnas != sumaColumnas) {
                res = false;

            } else {
                res = true;
            }
        }

        for (int i = 0; i < matriu.length; i++) {
            sumaDiago1 = 0;
                sumaDiago2 = 0;
            for (int j = 0; j < matriu.length; j++) {
                 if (Arrays.equals(matriu[i], matriu[j])) {//Comparamos si las posiciones son iguales
                    sumaDiago1 += matriu[i][j];
                }
            }
        }

        return res;
    }

    public static void llegirmatriu(int[][] matriu) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print("Ingresar posicion [" + i + "] [" + j + "] :");
                matriu[i][j] = entrada.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz;
        do {
            System.out.print("Ingresa tamano de la matriz mayor que 2 :");
            matriz = entrada.nextInt();
        } while (matriz < 3);
        int matriu[][] = new int[matriz][matriz];
        llegirmatriu(matriu);
        System.out.println(comprovar(matriu));

    }

}
