
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Numeros_aleatorios {

    /*2) Crea una aplicación que nos genere una cantidad de números enteros aleatorios
    que nosotros le pasaremos por teclado. Crea un método donde pasamos como parámetros
    entre que números queremos que los genere, podemos pedirlas por teclado antes de generar 
    los números. Este método devolverá un número entero aleatorio. Muestra estos números por pantalla.
     */
    public static int aleatorio(int num1, int num2) {

        return (int) (Math.random() * (num2 - num1 + 1) + num1);
}

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa cantidad de numeros que quiere generar:");
        int limi = entrada.nextInt();
        System.out.print("Ingresa numero inicial:");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese numero final:");
        int num2 = entrada.nextInt();

        for (int i = 0; i < limi; i++) {
            System.out.print(aleatorio(num1, num2)+", ");
        
    

         }

    }

}
