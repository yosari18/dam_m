
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_9 {

    public static int valorElevado(int a, int b) {
        return Math.max(a, b);
        //return (a>b)? a:b; ? es un operadir ternario 
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("INgrese el primer valor :");
        int a = entrada.nextInt();
        System.out.print("Ingresew el segundo valor :");
        int b = entrada.nextInt();
        System.out.print("Ingrese el segundo valor :");
        int c = entrada.nextInt();
        System.out.println("El mayor es : " + valorElevado(valorElevado(a, b), c));

    }

}
