/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package articulos;

/**
 *
 * @author yosari
 */
public class Articulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Article Art1 = new Article("polo", 10, 2);
        Art1.imprime();

      
        System.out.println(  "cantidad actual :"+Art1.almacena(-3));
        System.out.println("Se vendio :" + Art1.getvender(6));
       

       
        Art1.almacena(3);
    }
}
