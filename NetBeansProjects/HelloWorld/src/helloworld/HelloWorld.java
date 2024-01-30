/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombre;
        System.out.print("Introducir tu nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Hola te llamas " + nombre);
    }

}
