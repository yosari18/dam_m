/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotes_ejercici;

import java.util.ArrayList;

/**
 *
 * @author yosari
 */
public class Inventari {

    private ArrayList<Mascota> animales = new <Mascota>ArrayList();

    public void insertar_Mascota(Mascota m1) {
        this.animales.add(m1);

    }

    public void eliminar_Mascota(int m1) {
        this.animales.remove(m1);

    }

    public void vaciar_lista() {
        this.animales.clear();

    }

    public void mostrar_lista() {

        for (int i = 0; i < this.animales.size(); i++) {
            System.out.println(i + ") " + this.animales.get(i).getClass().getSimpleName() + " " + this.animales.get(i).getNombre());//getClass: obtiene la clase de objeto 
        }
    }

    public void mostar_mascotaPosicion(int posicion) {
        for (int i = 0; i < animales.size(); i++) {
            if (i == posicion) {
                System.out.println("/////////////" + this.animales.get(i).getClass().getSimpleName() + "/////////////// \n");
                this.animales.get(i).mostrar();
            }
        }

    }

    public void mostrar_todo() {
        for (int i = 0; i < this.animales.size(); i++) {
            System.out.println("");
            System.out.println("/////////////" + this.animales.get(i).getClass().getSimpleName() + "/////////////// \n");
           
                this.animales.get(i).mostrar();
            
        }
    }

}
