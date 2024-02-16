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

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre :");
        String nombre = entrada.nextLine();
        System.out.print("Apellido :");
        String apellido = entrada.nextLine();
        System.out.print("Edad :");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.print("DNI :");
        String DNI = entrada.nextLine();
        Persona p1 = new Persona(DNI, nombre, apellido, edad);
        p1.imprime();
    }

}
