/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_a3;

/**
 * @author yosari
 */
public class Ejercicio_A3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(0,0,5,5);
        
        int area = (r1.x2 - r1.x1) * (r1.y2 - r1.y1);
        int perimetro = (r1.x2 - r1.x1) + (r1.y2 - r1.y1) + (r1.x2 - r1.x1) + (r1.y2 - r1.y1);
        System.out.println("El perimetro del rectangulo es : " + perimetro);
        System.out.println("El area es :" + area);

        Rectangle r2 = new Rectangle(5,3,1,2);
        
        int area2 = (r2.x2 - r2.x1) * (r2.y2 - r2.y1);
        int perimetro2 = (r2.x2 - r2.x1) + (r2.y2 - r2.y1) + (r2.x2 - r2.x1) + (r2.y2 - r2.y1);
        System.out.println("El perimetro del rectangulo es : " + perimetro2);
        System.out.println("El area es :" + area2);

    }
}
