
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
public class Matriu_Transposada {

    public static void omplirMatriu(int m[][]) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("Ingresar posicion [" + i + "] [" + j + "] :");
                m[i][j] = entrada.nextInt();
            }
        }

    }

    public static void omplirMatriuAleatorio(int[][] m) {
        int max = 10;
        int min = 0;
        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (Math.random() * (max - min + 1) + min);
                System.out.println("valores " + m[i][j]);

            }
            System.out.print("");
        }

    }

    public static int[][] transposada(int m[][]) {
        //int arr[]
        for (int i = 0; i < m.length; i++) {//FILA
            for (int j = 0; j < m[i].length; j++) {//COLUMANS
                m[i][j]=m[j][i];

            }
        }
        return m;
    }

    public static void visualitzaMatriu(int [ ][ ] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println(Arrays.toString(m));
                
            }
        }
        transposada(m);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar numero de fila :");
        int fila = entrada.nextInt();
        System.out.println("Ingresar numero de columna:");
        int columna = entrada.nextInt();
        int m[][] = new int[fila][columna];

        System.out.println("**MENÚ**");
        System.out.println("1)Rellenas tú");
        System.out.println("2)Rellenar máquina");
        System.out.println("Elige");
        int elig = entrada.nextInt();
        switch (elig) {
            case 1:
                omplirMatriu(m);
                break;
            case 2:
                omplirMatriuAleatorio(m);
                break;
            default:
                throw new AssertionError();
        }
        visualitzaMatriu(m);
        
    }

}
