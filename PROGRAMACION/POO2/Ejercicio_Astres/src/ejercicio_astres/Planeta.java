/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_astres;

import java.util.ArrayList;

/**
 *
 * @author yosari
 */
public class Planeta extends Astre {

    private int distancia_Sol;
    private int orbita_Sol;
    private boolean tiene_satelite;
    private ArrayList<SatelLit> satelite;

    public Planeta(String nom, int radio, int rotacion, int massa, int temperatura, int gravedad, int distancia_Sol, int orbita_Sol, boolean tiene_satelite, ArrayList<SatelLit> satelite) {
        super(nom, radio, rotacion, massa, temperatura, gravedad);
        this.distancia_Sol = distancia_Sol;
        this.orbita_Sol = orbita_Sol;
        this.tiene_satelite = tiene_satelite;
        this.satelite = satelite;
    }

    public Planeta(String nom, int radio, int rotacion, int massa, int temperatura, int gravedad, int distancia_Sol, int orbita_Sol, boolean tiene_satelite) {
        super(nom, radio, rotacion, massa, temperatura, gravedad);
        this.distancia_Sol = distancia_Sol;
        this.orbita_Sol = orbita_Sol;
        this.tiene_satelite = tiene_satelite;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Distancia al sol :" + this.distancia_Sol);
        System.out.println("Orbita al sol    :" + this.orbita_Sol);
        System.out.println("Tiene satelite?  :" + this.tiene_satelite);
        if (this.tiene_satelite == true) {
            for (int i = 0; i < this.satelite.size(); i++) {
                System.out.println("Satelite         :" + this.satelite.get(i).getNom());
            }
        }else{
            System.out.println("No tiene satelite");
        }

    }

    public void anadir_satelite(SatelLit s) {
        this.satelite.add(s);

    }

    public void setDistancia_Sol(int distancia_Sol) {
        this.distancia_Sol = distancia_Sol;
    }

    public void setOrbita_Sol(int orbita_Sol) {
        this.orbita_Sol = orbita_Sol;
    }

    public void setTiene_satelite(boolean tiene_satelite) {
        this.tiene_satelite = tiene_satelite;
    }

    public void setSatelite(ArrayList<SatelLit> satelite) {
        this.satelite = satelite;
    }

    public int getDistancia_Sol() {
        return distancia_Sol;
    }

    public int getOrbita_Sol() {
        return orbita_Sol;
    }

    public boolean isTiene_satelite() {
        return tiene_satelite;
    }

    public ArrayList<SatelLit> getSatelite() {
        return satelite;
    }

}
