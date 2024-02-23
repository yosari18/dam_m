/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayproducto;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author yosari
 */
public class ArrayProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList llista = new ArrayList();
        Producto pro = new Producto();
        llista.add(new Producto("mad", 4));
        llista.add(new Producto("maa", 3));
        llista.add(new Producto("matt", 6));
        llista.add(new Producto("maiy", 9));
        llista.add(new Producto("marr", 2));
        
        llista.add(2, new Producto("marriiiii", 2));

        for (Iterator iter = llista.iterator(); iter.hasNext(); ) {
            Producto  pro1=(Producto)iter.next();
            System.out.println(pro1.getNomP()+ " "+pro1.getCantidad());

        }
        llista.remove(2);
        Iterator iter=llista.iterator();
        while(iter.hasNext()){
          //  Producto pro2=(Producto);
        
        }
        
    }

}
