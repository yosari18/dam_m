
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner (System.in);
        System.out.print("Introducir un numero para calcular su factoria : ");
        int n=entrada.nextInt();
        int fac=1;
        for (int i = 1; i <= n; i++) {
            fac=fac*i;
            
            
        }
        System.out.println(fac);
    }
    
}
