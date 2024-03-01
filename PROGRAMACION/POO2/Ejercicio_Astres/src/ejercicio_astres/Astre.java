/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_astres;

/**
 *
 * @author yosari
 */
public class Astre {
    private String nom;
    private int radio;
    private int rotacion;
    private int massa;
    private int temperatura;
    private int gravedad;

    public Astre(String nom, int radio, int rotacion, int massa, int temperatura, int gravedad) {
        this.nom = nom;
        this.radio = radio;
        this.rotacion = rotacion;
        this.massa = massa;
        this.temperatura = temperatura;
        this.gravedad = gravedad;
    }
    
    
    
    public void mostrar(){
        System.out.println("Nombre       :"+this.nom);
        System.out.println("Radio        :"+this.radio);
        System.out.println("Rotacion     :"+this.rotacion);
        System.out.println("Massa        :"+this.massa);
        System.out.println("Temperatura  :"+this.temperatura);
        System.out.println("Gravedad     :"+this.gravedad);
    }

    public String getNom() {
        return nom;
    }

    public int getRadio() {
        return radio;
    }

    public int getRotacion() {
        return rotacion;
    }

    public int getMassa() {
        return massa;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void setRotacion(int rotacion) {
        this.rotacion = rotacion;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }
    
}
