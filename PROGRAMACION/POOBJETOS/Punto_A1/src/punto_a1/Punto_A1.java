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
        int x;
        int y;
        Coordenadas p = new Coordenadas(5, 7);
        Coordenadas p1 = new Coordenadas(5, 0);
        Coordenadas p2 = new Coordenadas(10, 10);
        Coordenadas p3 = new Coordenadas(-3, 7);

        p1.setx(4);
        p1.sety(5);

        System.out.println("La coordenada del punto 1 es : (" + p1.getx() + "," + p1.y + ")");
        System.out.println("La coordenada del punto 2 es : (" + p2.getx() + "," + p2.gety() + ")");
        System.out.println("La coordenada del punto 3 es : (" + p3.getx() + "," + p3.y + ")");

    }

}
