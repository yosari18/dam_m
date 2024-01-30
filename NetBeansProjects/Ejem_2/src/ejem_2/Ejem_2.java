/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejem_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class Ejem_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Introducir nota: ");
            int nota = entrada.nextInt();

            if (nota >= 0 && nota <= 10) {
                if (nota >= 0 && nota < 3) {
                    System.out.println("Muy deficiente");

                
                }if (nota >= 3 && nota < 5) {
                    System.out.println("Insuficiente");
                } else if (nota >= 5 && nota < 6) {
                    System.out.println("Bien");
                } else if (nota >= 6 && nota < 9) {
                    System.out.println("Notable");
                } else {
                    System.out.println("Excelente");
                }

            }

        } catch (Exception InputMismatchException) {
            System.out.println("Ingresar solo numeros enteros ");
        }
    }

}
