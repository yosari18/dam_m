/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraymajorsmenors;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class ArrayMajorsMenors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.print(" introducir un numero :");
        int n = entrada.nextInt();
        entrada.nextLine();
        
        int miarray[] = new int[n];
        for (int i = 0; i < miarray.length; i++) {
            miarray[i] = (int) (Math.random() * (-10));
            
            System.out.println(miarray[i]);
            
        }
        
        System.out.println("mayores (a)");
        System.out.println("menores(b)");
        System.out.println("Elige");
        String respuesta = entrada.nextLine();
        
        int mayores = miarray[0];
        int menores = miarray[0];
        for (int i = 0; i < miarray.length; i++) {
            switch (respuesta) {
                case "a":
                    if (miarray[i] > mayores) {
                        Arrays.sort(miarray);
                        System.out.println(miarray[i]);
                        
                    }
                    
                    break;
                case "b":
                    if (miarray[i] < menores) {
                        Arrays.sort(miarray);
                        System.out.println(miarray[i]);
                        
                    }
                    break;
                default:
                
            }
        }
        
    }
    
}
