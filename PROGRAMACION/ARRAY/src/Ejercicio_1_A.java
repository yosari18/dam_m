
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class Ejercicio_1_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        double num[] = new double[4];
        System.out.println("Introducir 10 numeros reales: ");

        for (int i = 0; i < num.length; i++) {
            System.out.println("Numero #" + (i + 1) + " :");
            num[i] = entrada.nextDouble();

        }
         for (int i = 0; i < num.length; i++) {
             System.out.println(num[i]);
        }
    }
    
}
