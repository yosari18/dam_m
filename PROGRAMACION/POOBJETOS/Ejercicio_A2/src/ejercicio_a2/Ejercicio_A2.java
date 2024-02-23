/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_a2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class Ejercicio_A2 {

    public static void main(String[] args) {

        ArrayList llista = new ArrayList();

        llista.add(-25);
        llista.add(3.14);
        llista.add('A');
        llista.add("luis");
        llista.add(new Persona("12345678A", "maro", "lol", 13));
        llista.add(new Persona("12345678A", "mari", "lolaaa", 19));
        for (int i = 0; i < llista.size(); i++) {
            System.out.println(llista.get(i));

        }

    }

}
