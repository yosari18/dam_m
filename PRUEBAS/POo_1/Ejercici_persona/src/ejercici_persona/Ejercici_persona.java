/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercici_persona;

import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class Ejercici_persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introducir nombre :");
        String nombre = entrada.nextLine();

        System.out.print("Introducir sexo :");
        char sexo = entrada.nextLine().charAt(0);
        System.out.print("Introducir edad :");
        int edad = entrada.nextInt();
        System.out.print("Introducir peso :");
        int peso = entrada.nextInt();
        System.out.print("Introducir altura:");
        double altura = entrada.nextDouble();

        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);

        Persona p2 = new Persona(nombre, edad);
        Persona p3 = new Persona();
        p3.setNombre("yosari");
        p3.setSexoH('M');
        p3.setEdad(3);
        p3.setDNI("1w2345");
        p3.setAltura(1.45);
        p3.setPeso(20);

        System.out.println("");
        System.out.println(p1.toString());
        comprobarPeso(p1);
        mayorEdad(p1);
        System.out.println("");
        System.out.println(p3.toString());
        comprobarPeso(p3);
        mayorEdad(p3);

    }

    public static void comprobarPeso(Persona p) {
        switch (p.calcularIMC()) {
            case Persona.peso_debajo:
                System.out.println("Su peso esta por debajo ");
                break;
            case Persona.peso_normal:
                System.out.println("Tiene un peso normal");
                break;
            case Persona.peso_porEncima:
                System.out.println("Tiene sobrepeso");
                break;
        }
    }

    public static void mayorEdad(Persona p) {
        if (p.esMayorDeEdad()) {
            System.out.println("Es mayor de edad ");
        } else {
            System.out.println("Es menor  de edad ");
        }
    }

}
