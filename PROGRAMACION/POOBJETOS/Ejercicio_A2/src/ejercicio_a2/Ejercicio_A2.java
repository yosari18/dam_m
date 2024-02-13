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

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Nombre :");
        String nombre = entrada.nextLine();
        System.out.print("Apellido :");
        String apellido = entrada.nextLine();
        System.out.print("DNI :");
        String DNI = entrada.nextLine();
        System.out.print("Edad :");
        int edad = entrada.nextInt();
        Persona p1 = new Persona(DNI, nombre, apellido, edad);

        Persona p = new Persona(DNI, nombre, apellido, edad);
        p1.diferenciaEdad(p);

        p1.imprime();
    }

}
