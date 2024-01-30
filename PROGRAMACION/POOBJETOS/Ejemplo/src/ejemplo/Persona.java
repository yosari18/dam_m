/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;

/**
 *
 * @author yosari
 */
public class Persona {
    String nombre;
    int edad;
    
    void setNom(String pepe){
    nombre=pepe;
    
    }
    void setEdad(int e){
    edad=e;
    
    }
    String getNom(){
    return nombre;
    }
    
    int getEdad(){
    return edad;
    
    }
    void imprimeNom(){
        System.out.println(nombre);
    }
    boolean esMayor(){
    return (edad>=18);
    }
    
    
}
