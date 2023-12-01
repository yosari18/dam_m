
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame un numero para contar los multiplos: ");
        int n = entrada.nextInt();
        boolean esprimo = true;
        int contador=n-1;
       
        while ( contador >1) {
            if (n % contador == 0) {
                esprimo = false;
            }
            contador--;
        }
        if (esprimo == true) {
            System.out.println(" Es primo");

        } else {
            System.out.println("No es primo");
        }

    }

}
