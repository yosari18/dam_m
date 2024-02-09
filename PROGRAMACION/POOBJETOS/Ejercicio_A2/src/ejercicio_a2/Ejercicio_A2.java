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
        
        p1.setNombre("Rafa");

        entrada.nextLine();
        System.out.print("Nombre :");
        nombre = entrada.nextLine();
        System.out.print("Apellido :");
        apellido = entrada.nextLine();
        System.out.print("DNI :");
        DNI = entrada.nextLine();
        System.out.print("Edad :");
        edad = entrada.nextInt();
        Persona p2 = new Persona(DNI, nombre, apellido, edad);

        if (p1.edad < 18) {
            System.out.println(p1.getNombre() + " " + p1.getApellido() + " con DNI " + p1.getDNI() + " " + "es menor de edad");
        } else {
            System.out.println(p1.getNombre() + " " + p1.getApellido() + " con DNI " + p1.getDNI() + " " + "es mayor de edad");
        }
        if (p2.edad < 18) {
            System.out.println(p2.getNombre() + " " + p2.getApellido() + " con DNI " + p2.getDNI() + " " + "es menor de edad");
        } else {
            System.out.println(p2.getNombre() + " " + p2.getApellido() + " con DNI " + p2.getDNI() + " " + "es mayor de edad");
        }
    }

}
