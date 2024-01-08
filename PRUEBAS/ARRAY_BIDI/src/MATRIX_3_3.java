


import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class MATRIX_3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        1) Crear una matriz de 3×3 con los números del 1 al 9. Mostrar por pantalla, tal como 
        aparece en la matriz.
        */

       
        int fila = 4;
        int columna = 5;
        int miarray[][] = new int[fila][columna];
        int min = 100, max = 999;
        String guion = "-";

        for (fila = 0; fila < miarray.length; fila++) {
            int sumaFilas = 0;
            for (columna = 0; columna < miarray[fila].length; columna++) {
                miarray[fila][columna] = (int) (Math.random() * (max - min + 1) + min);
                sumaFilas += miarray[fila][columna];
                System.out.print("  " + miarray[fila][columna] + "  ");
            }
            System.out.print("| " + sumaFilas);
            System.out.println("");
        }
        System.out.println(guion.repeat(43));
        int sumaTotal = 0;
        for (columna = 0; columna < miarray.length + 1; columna++) {
            int sumaColumna = 0;
            for (fila = 0; fila < miarray.length; fila++) {
                sumaColumna += miarray[fila][columna];
            }
            sumaTotal += sumaColumna;
            System.out.print(sumaColumna + "   ");
        }
        System.out.println("| " + sumaTotal);
    }

}
