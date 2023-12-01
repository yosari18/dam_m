
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_4_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime 20 numeros :");

        int num1[] = new int[5];
        int neg = 0;
        int pos = 0;
        for (int i = 0; i < num1.length; i++) {
            System.out.println("Numero # " + (i + 1) + " :");
            num1[i] = entrada.nextInt();
            if (num1[i] < 0) {
                neg+=num1[i];
            } else  {
                pos+=num1[i];
            }

        }
        System.out.println("numeros positivos " + pos);
        System.out.println("Numerosnegativos " + neg);
    }

}
