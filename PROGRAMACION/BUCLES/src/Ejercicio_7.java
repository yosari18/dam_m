
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introducir  10 numero: ");
        int pos = 0;
        int neg = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("numero # " + (i + 1) + " :");
            int n = entrada.nextInt();
            if (n < 0) {
                neg += 1;

            } else {
                pos += 1;
            }

        }
        System.out.println("Hay "+neg+" negativos");
        System.out.println("Hay "+pos+" positivos");
    }

}
