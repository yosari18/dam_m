
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class Ejercicio_13_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime valor para iniciar :");
        int inicial =entrada.nextInt();
        System.out.print("Dime numero final :");
        int fin=entrada.nextInt();
        System.out.print("Dime el numero de incremeto :");
        int inc=entrada.nextInt();
        int miarray[]=new int[fin-inicial+1];
        for (int i = 0; i < miarray.length; i+=inc) {
            miarray[i]=inicial+i;
            System.out.print(miarray[i]+" ");
            
        }
    }
    
}
