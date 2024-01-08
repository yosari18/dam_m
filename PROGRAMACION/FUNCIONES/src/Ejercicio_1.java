
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
public class Ejercicio_1 {

    public static double multiplica(double a, double b) {

        double resultado = a * b;

        return resultado;
    }

    public static void main(String[] args) {

        PrintStream pri = new PrintStream(System.out, true, StandardCharsets.UTF_8);
        Scanner entrada = new Scanner(System.in);
        pri.print("Ingrese el primer número : ");
        double num1 = entrada.nextDouble();
        pri.print("Ingrese el segundo número : ");
        double num2 = entrada.nextDouble();

        pri.println("El resultado de la multiplicación es : " + multiplica(num1, num2));
    }

}
