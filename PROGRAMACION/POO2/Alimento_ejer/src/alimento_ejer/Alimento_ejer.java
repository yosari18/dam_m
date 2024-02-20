/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alimento_ejer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author yosari
 */
public class Alimento_ejer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Alimento a1 = new Alimento("te rojo", 3);
        Alimento a2 = new Alimento("manzanilla", 5);
        Alimento a3 = new Alimento("te", 6);
        Alimento a4 = new Alimento("chocolate", 2);
        Alimento a5 = new Alimento("cafe", 1);

        ArrayList lista = new ArrayList();

        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);
        lista.add(a5);

        Iterator iter = lista.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        
        lista.remove(a5);
        lista.remove(a1);
        
        lista.add(1,new Alimento ("cafe negro",2));
        System.out.println("");
        
        Iterator iter2 =lista.iterator();
        while(iter2.hasNext()){
            System.out.println(iter2.next());
        }
        
        
        

    }

}
