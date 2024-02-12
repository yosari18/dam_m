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
        Rectangle r1 = new Rectangle(0, 0, 5, 5);
      
        System.out.println("El perimetro del rectangulo es : " + r1.perimetro());
        System.out.println("El area es :" + r1.area());
        
        
        Rectangle r2 = new Rectangle(5, 5,0,0 );
        System.out.println("El perimetro del rectangulo es : " + r1.perimetro());
        System.out.println("El area es :" + r1.area());

    }
}
