/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercici_password;

import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class Ejercici_Password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresar el tamano del array :");
        int arr = entrada.nextInt();
        System.out.print("Dime  el tamano de la contrasena :");
        int log = entrada.nextInt();
        Password pass1[] = new Password[arr];
        boolean almaPass[] = new boolean[arr];
        for (int i = 0; i < pass1.length; i++) {
            pass1[i] = new Password(log);
            almaPass[i] = pass1[i].esFuerte();

            System.out.println(i + " " + pass1[i].generarPassword() + "  es seguro " + pass1[i].esFuerte());

        }

    }

}
