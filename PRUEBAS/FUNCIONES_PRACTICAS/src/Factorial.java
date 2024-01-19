
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class Factorial {

    /**
     *4) Crea una aplicación que nos calcule el factorial de un número pedido por 
        teclado, lo realizara mediante un método al que le pasamos el número como parámetro.
        Para calcular el factorial, se multiplica los números anteriores hasta llegar a uno.
        Por ejemplo, si introducimos un 5, realizara esta operación 5*4*3*2*1=120.
        
     */
    public static int factorial(int num){
        int res=1;
        
        for (int i = 1; i <= num; i++) {
            res=res*i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introducir un numero paracalcular la factorial: ");
        int num=entrada.nextInt();
        System.out.println("La factorial de "+num+" es :"+factorial(num));
        
        
    }
    
}
