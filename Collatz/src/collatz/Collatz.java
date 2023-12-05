/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collatz;

import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class Collatz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num;
        int div = 0;
        int mul = 0;
        do {
            System.out.print(" introducir un numero :");
            num = entrada.nextInt();
            if (num <= 1) {
                System.out.println("El numero que ingreseo debe ser mayor que 1");

            }
        } while (num <= 1);

        for (int i = 0; i < num; i++) {

            if (num % 2 == 0) {
                for (int j = 0; j < num; j++) {

                    div = num / 2;
                    System.out.print(div + " ");

                }
            } else {
                mul = (num * 3) + 1;
                System.out.print(mul + " ");
            }

        }

    }

}
