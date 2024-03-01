/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_astres;

/**
 *
 * @author yosari
 */
public class SatelLit extends Astre {

    private int distancia_planeta;
    private int orbita_planeta;
    private Planeta planeta;

    public SatelLit(String nom, int radio, int rotacion, int massa, int temperatura, int gravedad, int distancia_planeta, int orbita_planeta, Planeta planeta) {
        super(nom, radio, rotacion, massa, temperatura, gravedad);
        this.distancia_planeta = distancia_planeta;
        this.orbita_planeta = orbita_planeta;
        this.planeta = planeta;
    }

    public SatelLit(String nom, int radio, int rotacion, int massa, int temperatura, int gravedad, int distancia_planeta, int orbita_planeta) {
        super(nom, radio, rotacion, massa, temperatura, gravedad);
        this.distancia_planeta = distancia_planeta;
        this.orbita_planeta = orbita_planeta;
    }
    public void mostrar(){
        super.mostrar();
        
        System.out.println("Distancia  al planeta:"+this.distancia_planeta);
        System.out.println("Orbita del planeta   :"+this.orbita_planeta);
        System.out.println("Planeta              :"+this.planeta.getNom());
    }

    public void setDistancia_planeta(int distancia_planeta) {
        this.distancia_planeta = distancia_planeta;
    }

    public void setOrbita_planeta(int orbita_planeta) {
        this.orbita_planeta = orbita_planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }

    public int getDistancia_planeta() {
        return distancia_planeta;
    }

    public int getOrbita_planeta() {
        return orbita_planeta;
    }

    public Planeta getPlaneta() {
        return planeta;
    }
    

}
