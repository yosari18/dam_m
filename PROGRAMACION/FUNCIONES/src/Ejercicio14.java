
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio14 {

    public static void arbol(String carc, int line) {
        //int espacio = line;
        for (int i = line; i >= 0; i--) {
            System.out.println("f".repeat(i));
            for (int j = 0; j <line; j--) {
                System.out.println(carc);
            }
           
        }
        System.out.println("");
        for (int k = 0; k < line; k++) {

            for (int j = 0; j < k + 1; j++) {
                System.out.print(carc);
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un caracter :");
        String carc = entrada.nextLine();
        System.out.print("Introducir cantidad de lineas :");
        int line = entrada.nextInt();

        arbol(carc, line);

    }

}
