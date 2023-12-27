
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_6 {

    public static double preuAmbIVA(double precio) {
        return 1.21 * precio;

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precios[] = new double[5];
        for (int i = 0; i < precios.length; i++) {
            System.out.print("Introduce precio #" + (i + 1) + " :");
            precios[i] = entrada.nextDouble();
        }
        for(double precio: precios){
        System.out.printf("El precio total %.2f con IVA %.2f%n", precio,  preuAmbIVA(precio));
           
        
        }
       

    }

}
