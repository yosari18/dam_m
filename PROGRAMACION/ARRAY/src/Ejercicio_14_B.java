
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_14_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime el tamado del array :");
        int n = entrada.nextInt();
        System.out.print("Dime el valor :");
        int m = entrada.nextInt();
        int miarray[] = new int[n];
        Arrays.fill(miarray, m);
        
        System.out.println(Arrays.toString(miarray));
        
    }
    
}
