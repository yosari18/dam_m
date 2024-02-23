/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioprofesor;

/**
 *
 * @author yosari
 */
public class Persona {
    private String nom;
    private String DNI;
    private String direccion;
    private int telefon;

    public Persona(String nom, String DNI, String direccion, int telefon) {
        this.nom = nom;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telefon = telefon;
    }

    public String getNom() {
        return nom;
    }

    public String getDNI() {
        return DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }
    
   public void mostrarPersona(){
       System.out.println("Nombre "+this.nom);
       System.out.println("DNI :"+this.DNI);
       System.out.println("Direccion "+this.direccion);
       System.out.println("Telefono :"+this.telefon);
   
   }

   
}
