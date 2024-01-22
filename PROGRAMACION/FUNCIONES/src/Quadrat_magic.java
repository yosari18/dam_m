
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
        int sumaColumnas, sumaFila, sumaDiago1 = 0, sumaDiago2 = 0;
        boolean res = true;
        for (int i = 0; i < matriu.length; i++) {//fila
            sumaFila = 0;
            sumaColumnas = 0;
            for (int j = 0; j < matriu.length; j++) {//columna
                sumaFila += matriu[i][j];
<<<<<<< HEAD
                sumaColumnas += matriu[j][i];
=======
                sumaColumnas += matriu[j][i];//invertimos posiciones
>>>>>>> 092b07ca22b400ff5e935df5da19d5d7278d5d80
                if (sumaFila != sumaColumnas) {
                    res = false;
                }
            }
<<<<<<< HEAD

=======
>>>>>>> 092b07ca22b400ff5e935df5da19d5d7278d5d80
        }
        for (int i = 0; i < matriu.length; i++) {
            sumaDiago1 += matriu[i][i];
            sumaDiago2 += matriu[i][matriu.length - i - 1];//columna empieza con valor de 2
            if (sumaDiago1 != sumaDiago2) {
                res = false;
            }
        }
        return res;
    }

    public static void llegirmatriu(int[][] matriu) {
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print("Ingresar posición [" + i + "] [" + j + "] :");
                matriu[i][j] = entrada.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresar tamaño de la matriz :");
        int tama = entrada.nextInt();
        while (tama < 3) {
            System.out.print("***Error*** la matriz debe ser igual o mayor que 3 :");
            tama = entrada.nextInt();
        }
        int matriu[][] = new int[tama][tama];
        llegirmatriu(matriu);
        String r = comprovar(matriu) ? "La matriz es magico" : "La matriz no es magica";
        System.out.println(r);
    }
}
