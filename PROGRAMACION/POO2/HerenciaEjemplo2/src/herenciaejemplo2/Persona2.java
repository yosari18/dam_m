/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaejemplo2;

/**
 *
 * @author yosari
 */
public class Persona2 {

    private String nom;
    protected String DNI;

    public Persona2(String nom, String DNI) {
        this.nom = nom;
        this.DNI = DNI;
    }

  public void mostrarPersona() {
        System.out.println("nombre :" + this.nom);
        System.out.println("DNI  :" + this.DNI);
    }

}
