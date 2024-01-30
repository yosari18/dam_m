/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_a1;

/**
 *
 * @author yosari
 */
public class Punto_A1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Coordenadas p1 = new Coordenadas();
        p1.x = 5;
        p1.y = 0;
        System.out.println("La coordenada del punto 1 es : (" + p1.x + "," + p1.y + ")");

        Coordenadas p2 = new Coordenadas();
        p2.x = 10;
        p2.y = 10;
        System.out.println("La coordenada del punto 2 es : (" + p2.x + "," + p2.y + ")");

        Coordenadas p3 = new Coordenadas();
        p3.x = -3;
        p3.y = 7;
        
        p3.y=p3.y-5;
        System.out.println("La coordenada del punto 3 es : (" + p3.x + "," + p3.y + ")");
        System.out.println("La suma  de p3 es " + (p3.x + p3.y));

    }

}
