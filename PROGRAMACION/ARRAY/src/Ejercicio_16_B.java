
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
public class Ejercicio_16_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int miarray1[] = new int[2];
        int miarray2[] = new int[2];
        System.out.println("Array 1");
        for (int i = 0; i < miarray1.length; i++) {
            System.out.print("Numero # " + (i + 1) + " :");
            miarray1[i] = entrada.nextInt();
        }
        System.out.println("Array 2");
        for (int i = 0; i < miarray2.length; i++) {
            System.out.print("Numero # " + (i + 1) + " :");
            miarray2[i] = entrada.nextInt();

        }
        if (Arrays.equals(miarray1, miarray2)) {
            System.out.println("Iguales");

        } else {
            System.out.println("No son iguales");
        }

    }

}
