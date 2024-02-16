/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_a2;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author yosari
 */
public class Persona {

    private String DNI;
    private String nombre;
    private String apellido;
    private int edad;
    private final int mayoriaDeEdad = 18;

    public Persona(String DNI, String nombre, String apellido, int edad) {
        Scanner entrada = new Scanner(System.in);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        while (validarDNI(DNI) == false) {
            System.out.print("Ingresar DNI  correcto:");
            DNI = entrada.nextLine();
        }
        this.DNI = DNI;

    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void imprime() {
        System.out.println(this.nombre + " " + this.apellido + " tiene " + this.edad + " anios DNI " + this.DNI + " ");
    }

    @Override
    public String toString() {
        return "Persona  " + "DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", mayoriaDeEdad=" + mayoriaDeEdad ;
    }
    

    public boolean esMayorEdad() {
        return (this.edad > this.mayoriaDeEdad) ? true : false;
    }

    public boolean esJubilado() {
        return (this.edad > 65) ? true : false;
    }

    public int diferenciaEdad(Persona p) {
        return (this.edad > p.edad) ? this.edad : p.edad;
    }

    public static boolean validarDNI(String DNI) {
        //return (DNI.length()==8 && (DNI.matches("[A-HJ-NP-TV-Z]")))? true:false;
        return DNI.matches("\\d{8}[A-HJ-NP-TV-Z]");
    }

}
