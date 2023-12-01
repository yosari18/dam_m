
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introducir notas con valores de 0 a 10: ");
        int notas;
        boolean neg = false;
        do {
            System.out.print("Introducir notas: ");
            notas = entrada.nextInt();

            if (notas == 10) {
                neg = true;

            }

        } while (notas != -1);

        if (neg == false) {
            System.out.println("No hay notas con valor 10");
        } else {
            System.out.println("Si hay notas con valor 10");
        }
    }

}
