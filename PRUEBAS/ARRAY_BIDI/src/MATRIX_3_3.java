


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

       
        int miarray[][] = new int[3][3];
        int num = 0;
        for (int i = 0; i < miarray.length; i++) {
            for (int j = 0; j < miarray[i].length; j++) {
                num = num + 1;
                miarray[i][j] = num;
                
            }
            System.out.println(Arrays.toString(miarray[i]) + " ");
           
        }
        System.out.print("");
    }

}
