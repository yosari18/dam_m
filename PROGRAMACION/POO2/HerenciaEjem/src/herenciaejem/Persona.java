/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaejem;

/**
 *
 * @author yosari
 */
public class Persona {
    private String nom;
    private String DNI;

    public Persona(String nom, String DNI) {
        this.nom = nom;
        this.DNI = DNI;
    }
    
    public void mostrarPersona(){
        System.out.println("nombre :" +this.nom);
        System.out.println("DNI  :"+this.DNI);
    }
    
}
