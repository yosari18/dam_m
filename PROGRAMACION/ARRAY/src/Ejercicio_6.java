
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime valor inicial :");
        int p=entrada.nextInt();
        System.out.print("Dime un valo final:");
        int q=entrada.nextInt();
        
        int miarray[]=new int [q-p+1];
        for (int i = 0; i <miarray.length; i++) {
            miarray[i]=p+i;
            System.out.println(miarray[i]);
            
        }
        
    }
    
}
