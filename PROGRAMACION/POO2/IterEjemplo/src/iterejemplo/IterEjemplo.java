/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iterejemplo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author yosari
 */
public class IterEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList llista = new ArrayList();

        
        llista.add("Banana");
        llista.add("Arroz");
        llista.add("Manzana");

        Iterator iter = llista.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        llista.remove(1);
             
    }
}
