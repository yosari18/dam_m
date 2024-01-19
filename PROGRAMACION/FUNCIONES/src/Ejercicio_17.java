
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_17 {

    /*
    
     */
    public static boolean esPrimo(int num) {
        boolean esprimo = false;
        int contador = num - 1;
        if (contador == 0) {
            esprimo = true;
        }
        while (contador > 1) {// iteramos de contados hasta 2
            if (num % contador == 0) {
                esprimo = true;
            }
            contador--;
        }
        return esprimo;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.print("Dame un numero entero :");
        num = entrada.nextInt();
        while (num != 0) {
            if (esPrimo(num)) {
                System.out.println("No esprimo");
            } else {
                System.out.println("Es primo");
            }
            System.out.print("Dame un numero entero :");
            num = entrada.nextInt();

        }

    }

}
