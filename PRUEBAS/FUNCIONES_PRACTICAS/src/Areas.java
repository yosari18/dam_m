
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Areas {
    /*
    1) Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo.
    Pediremos que figura queremos calcular su área y según lo introducido pedirá los valores 
    necesarios para calcular el área. Crea un método por cada figura para calcular cada
    área, este devolverá un número real. Muestra el resultado por pantalla
    */

    public static double cuadrado(double lado) {
        return lado * lado;
    }

    public static double circulo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double triangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("C)cuadrado");
        System.out.println("O)circulo");
        System.out.println("T)triangulo");
        System.out.print("Elege la figura :");
        String figuras = entrada.nextLine().toLowerCase();
        switch (figuras) {
            case "c":

                System.out.printf("%13s %nIntoducir el lado :", "CUADRADO");
                double lado = entrada.nextDouble();
                System.out.println("El area del cuadrado es :" + cuadrado(lado));
                break;
            case "t":
                System.out.printf("%12S %nIntroducir base :", "TRIANGULO");
                double base = entrada.nextDouble();
                System.out.println("Introducir altura :");
                double altura = entrada.nextDouble();
                System.out.println("El area del triangulo es : " + triangulo(altura, base));
                break;

            case "o":
                System.out.printf("%13s %nIntroducir el radio : ", "CIRCULO");
                double radio = entrada.nextDouble();
                System.out.println("El area del circulo es:" + circulo(radio));
                break;

            default:
                System.out.println("Errores en los datos  de enterada ");
        }

    }

}
