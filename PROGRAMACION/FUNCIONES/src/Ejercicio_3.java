
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_3 {

    public static int minim(int a, int b) {
        int resultado;
        if (a < b) {
            return resultado = a;

        } else {
            return resultado = b;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el primer numero : ");
        int num1 = entrada.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int num2 = entrada.nextInt();
        System.out.println("El minimo es : " + minim(num1, num2));
    }

}
