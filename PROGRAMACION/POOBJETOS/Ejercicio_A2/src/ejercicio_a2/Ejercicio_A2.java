/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_a2;

import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class Ejercicio_A2 {

   static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args) {
       
        
        Persona p1 = new Persona();
        System.out.print("Nombre :");
        p1.nombre=entrada.nextLine();
        System.out.print("Apellido :");
        p1.apellido=entrada.nextLine();
        System.out.print("Edad :");
        p1.edad=entrada.nextInt();
        System.out.print("DNI");
        p1.DNI=entrada.nextLine();
        
         System.out.println(p1.nombre + " " + p1.apellido +" "+p1.DNI+ ""+p1.DNI);
        
        //Persona p1=new Persona();
       
    }
    
}
