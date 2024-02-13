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
    public void imprime(){
        System.out.println(this.nombre+" "+this.apellido+" tiene "+this.edad+"anios DNI "+this.edad);
   
    }
    public boolean esMayorEdad(){
    return (this.edad>18)? true:false;
    
    }
    
    public boolean esJubilado(){
    return (this.edad>65)? true:false;
    }
    public int  diferenciaEdad(Persona p){
    return (this.edad>p.edad)? this.edad:p.edad;
    }
    

}
