
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_13 {

    public static double porcentaje(double precio, double descuento) {
        return (precio - descuento) / precio*100 ;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el precio sin descuento :");
        double precio = entrada.nextDouble();
        System.out.print("Ingreasar precio con el descuento aplicado :");
        double descuento = entrada.nextDouble();
        
        System.out.printf("El porcentaje de descuento es: %.2f%%\n",porcentaje(precio, descuento) );
    }

}
