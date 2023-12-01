
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class Ejercicio_7_a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor inicial P: ");
        int p = entrada.nextInt();
        System.out.print("Valor final Q: ");
        int q = entrada.nextInt();

        // Creamos el array de tamaño (Q - P + 1)
        int vector[] = new int[q - p + 1];
        
        // En cada posición (i) insertamos (P + i)
        for (int i = 0; i < vector.length; i++) {
            vector[i] = p + i;
            System.out.println(vector[i]);
        }

    }
    
}
