
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
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
        int resultado=Math.min(a, b);
        return resultado;
    }

    public static void main(String[] args) {
         PrintStream pri = new PrintStream(System.out, true, StandardCharsets.UTF_8);

        Scanner entrada = new Scanner(System.in);
        pri.print("Ingresa el primer número : ");
        int num1 = entrada.nextInt();
        pri.print("Ingresa el segundo número: ");
        int num2 = entrada.nextInt();
        pri.println("El mínimo es : " + minim(num1, num2));
    }

}
