
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_7 {

    public static double perimetreRectangle(double ancho, double alto) {
        int perim=(int) ((ancho*2)+(alto*2));
        return perim;
    }

    public static double areaRectangle(double ancho, double alto) {
        return ancho * alto;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introducir ancho :");
        double ancho = entrada.nextDouble();
        System.out.print("Introduce alto :");
        double alto = entrada.nextDouble();

        System.out.println("El area del rectangulo es :" + areaRectangle(ancho, alto));
        System.out.println("El perimetro del rectangulo es :" + perimetreRectangle(ancho, alto));
    }

}
