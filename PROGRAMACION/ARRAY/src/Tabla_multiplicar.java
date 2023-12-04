
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Tabla_multiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese inicio de la tabla de multiplicar :");
        int n = entrada.nextInt();
        System.out.print("Ingrese el final :");
        int m = entrada.nextInt();
        int mult ;
        int suma =m-n+1;
        for (int i = 1; i <= suma; i++) {

            for (int j = 1; j <= 12; j++) {
                mult = j * n;
                
                System.out.println(n + " x " + j + " = " + mult);
            }
            n++;
            System.out.println("");

        }

    }

}
