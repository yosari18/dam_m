
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class Ejercicio_8 {

    public static int suma1aN(int n){
        if(n>0){
        return n+suma1aN(n-1);
        }else{
        return 0;
        }
        
    }
    public static int producte1aN(int n){
        int multi=1;
        for (int i = 1; i <= 10; i++) {
            multi*=i;
        }
        return multi;
       
    }
    /*public static double intermedi1aN(int n){
    
    }*/
    public static void main(String[] args) {
       Scanner entrada =new Scanner (System.in);
        System.out.println("Introduce un numero : ");
        int n=entrada.nextInt();
        System.out.println(" La sumatoria es : "+suma1aN(n));
        System.out.println("El producto es : "+producte1aN(n));
        
        
    }
    
}
