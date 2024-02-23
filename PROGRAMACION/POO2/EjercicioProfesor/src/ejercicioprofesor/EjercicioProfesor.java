/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioprofesor;

import java.util.ArrayList;

/**
 *
 * @author yosari
 */
public class EjercicioProfesor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList <Integer>notas = new ArrayList();
        
        ArrayList <String>modulos= new ArrayList();
        
        notas.add(21);
        notas.add(34);
        notas.add(43);
        
        Persona P1 = new Persona("yos", "1234r", "yoques", 12344);
        Alumne A1 = new Alumne("nada", "1234r", "yoques", 12344, 123, "DAM", 1, notas);
        
        modulos.add("programacion");
        modulos.add("LMS");
        modulos.add("sistemas");
        Professor pro1=new Professor (12233, "xccg", modulos, "martes","nom", "1234r", "yoques", 12344);
        System.out.println("");
        
        P1.mostrarPersona();
        A1.mostraPersona();
        System.out.println("");
        
        P1.mostrarPersona();
        pro1.mostraPersona();
        
       
    }

}
