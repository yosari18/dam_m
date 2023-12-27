
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
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer numero : ");
        double num1 = entrada.nextDouble();
        System.out.print("Ingrese el segundo numero : ");
        double num2 = entrada.nextDouble();

        System.out.println("El resultado de la multiplicacion es : " + multiplica(num1, num2));
    }

}
