/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_a3;

/**
 *
 * @author yosari
 */
public class Ejercicio_A3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Rectangle r1 = new Rectangle();
        r1.x1 = 0;
        r1.y1 = 0;
        r1.x2 = 5;
        r1.y2 = 5;
        System.out.println("El perimetro del rectangulo es : " + (r1.x1 + r1.y1 + r1.x2 + r1.y2));
        System.out.println("El area es :" + (r1.x1 + r1.y1) * (r1.x2 + r1.y2));

        Rectangle r2 = new Rectangle();
        r2.x1 = 7;
        r2.y1 = 9;
        r2.x2 = 2;
        r2.y2 = 3;
        
        int area= (r2.x1 + r2.y1)*(r2.x2 + r2.y2);
        System.out.println("El perimetro del rectangulo es : " + (r2.x1 + r2.y1 + r2.x2 + r2.y2));
        System.out.println("El area es :" +area);

    }

}
