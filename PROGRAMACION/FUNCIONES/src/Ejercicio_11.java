
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class Ejercicio_11 {

    public static void tabla(int num) {
        int resultado;
        for (int i = 1; i <= 12; i++) {
            
             System.out.printf("%d X %d = %d %n",num,i,num*i);
            
        }

    }

    public static void main(String[] args) {
       Scanner entrada =new Scanner (System.in);
        System.out.print("Introducir un numero para mostrar la tabla de multiplicar :");
        int num=entrada.nextInt();
        System.out.printf("%8s %d %n","TABLA:",num);
        tabla(num);
       
    }

}
