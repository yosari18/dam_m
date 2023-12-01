
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class Ejercicio_9_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int vector[] = new int[10];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*9+1);
            System.out.print(vector[i]+" ");
        }
        System.out.println(" \nIngresa valor para ver posicion ");
        int num=entrada.nextInt();
        for (int i = 0; i < vector.length; i++) {
           if(vector[i]==num){
           System.out.println("El numero "+num+" se encuentra en  la posicion "+ i);
           }
          
            
        }
         
    }
    
}
