
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_exam {

    /* public static int suma(int num) {
        for (int i = 0; i < num; i++) {

        }

    }*/
    public static int digitos(int num) {
        int resultado ;
        for (int i = 0; i <10; i++) {
            resultado=num%10;
            if(resultado){
            
            }
            
        }
        
        return Math.abs(resultado);

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introducir numeros :");
        int num = entrada.nextInt();

        System.out.println(" El numero de digitos es :" + digitos(num));

    }

}
