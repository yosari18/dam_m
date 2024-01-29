/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mesclaarrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class MesclaArrays {

    //public static int[] mescla(int array1[], int[] array2) {

    //}

    public static void aleatorio(int array1, int array2) {
        // int resultado;

        for (int i = 0; i < array1; i++) {

            array1 = (int) (Math.random() * (9 - 2 + 1) - 2);
           System.out.println(array1);

        }
        
        for (int i = 0; i < array2; i++) {
            array2=(int) (Math.random()*(9-2+1)+2);
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime el tamano del array: ");
        int array1 = entrada.nextInt();
        System.out.print("Dime el tamano del segundo array:");
        int array2 = entrada.nextInt();
        aleatorio(array1, array2);

    }

}
