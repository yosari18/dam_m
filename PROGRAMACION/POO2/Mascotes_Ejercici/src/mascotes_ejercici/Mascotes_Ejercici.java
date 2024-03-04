/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mascotes_ejercici;

import java.util.Iterator;

/**
 *
 * @author yosari
 */
public class Mascotes_Ejercici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Inventari inv = new Inventari();

        inv.insertar_Mascota(new Gos("Boby", 3, "jugando", 12, "lobo ", false));
        inv.insertar_Mascota(new Gat("Manchas ", 1, "dormido", 2, "blanco con manchas negras ", true));
        inv.insertar_Mascota(new Lloro("Pareto", 2, "comiendo", 4, "corto", false, "selva", true));
        inv.insertar_Mascota(new Canari("lolo", 1, "volando", 3, "corto", true, "amarillo", true));

        inv.mostrar_lista();
        inv.mostar_mascotaPosicion(3);
        inv.mostrar_todo();
        
        inv.eliminar_Mascota(3);
        
        inv.vaciar_lista();
        
     

    }

}
