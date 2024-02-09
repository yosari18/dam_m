/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_a2;

/**
 *
 * @author yosari
 */
public class Persona {

    String DNI;
    String nombre;
    String apellido;
    int edad;
    public Persona(String DNI, String nombre, String apellido, int edad){
        this.DNI=DNI;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    
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
    

}
