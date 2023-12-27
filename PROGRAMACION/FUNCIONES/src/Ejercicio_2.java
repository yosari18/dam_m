
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class Ejercicio_2 {

    public static boolean esMajorEdat(int a){
       boolean resultado=true; 
      if(a<18){
      return resultado=false;
      }else{
      return resultado;
      }
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        System.out.print("Introducir edad :");
        int edad =entrada.nextInt();
        System.out.println("Es true si es mayor y false si es menor :"+esMajorEdat(edad));
    }
    
}
