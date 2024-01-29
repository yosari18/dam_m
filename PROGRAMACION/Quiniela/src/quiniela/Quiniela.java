/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiniela;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class Quiniela {

    public static void goles(int goles, int goles1, String local, String visitante) {

        Scanner entrada = new Scanner(System.in);

        int gol[][] = new int[goles][goles1];

        if (goles > goles1) {
            System.out.println(local + "   " + visitante + "   :1");
        } else if (goles < goles1) {
            System.out.println(":2");
        } else {
            System.out.println(local + "   " + visitante + ":X");
        }

    }

    public static void mostrar(String local, String visitante, int goles, int goles1) {

        System.out.println("QUINIEALA DE LA JORNADA ");
        System.out.println("-".repeat(30));
        goles(goles, goles1, local, visitante);

    }

    public static void nombres(int partido) {
        Scanner entrada = new Scanner(System.in);

        String local = "";
        String visitante = "";
        int goles = 0;
        int goles1 = 0;

        for (int i = 0; i < partido; i++) {
            System.out.print("Ingresar nombre de los equipos locales: ");
            local = entrada.nextLine();
            entrada.nextLine();
            System.out.print("Cuantos goles");
            goles = entrada.nextInt();
            System.out.print("Ingresar nombre de los equipos visitantes: ");
            visitante = entrada.nextLine();
            entrada.nextLine();
            System.out.print("Cunatos goles");
            goles1 = entrada.nextInt();
        }

        mostrar(local, visitante, goles, goles1);

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("INgresar numeros de partidos");
        int partido = entrada.nextInt();
        nombres(partido);

    }

}
