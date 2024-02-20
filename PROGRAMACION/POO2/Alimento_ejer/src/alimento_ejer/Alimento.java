/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alimento_ejer;

/**
 *
 * @author yosari
 */
public class Alimento {
    String nom;
    int cantidad;

    public Alimento(String nom, int cantidad) {
        this.nom = nom;
        this.cantidad = cantidad;
    }

    public String getNom() {
        return nom;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Alimento{" + "nom=" + nom + ", cantidad=" + cantidad + '}';
    }
    
    
}
