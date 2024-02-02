/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo;

import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Persona thomas = new Persona();
        thomas.edad = 84;
        thomas.nombre = "Thomas Alva";
        System.out.println(thomas.nombre + " va morir a la edad de " + thomas.edad + " anys");
        
        Persona pp=new Persona();
        pp.edad = 24;
        pp.nombre = "yosari Alva";
        System.out.println(pp.nombre + " va morir a la edad de " + pp.edad + " anys");
        

    }

}
