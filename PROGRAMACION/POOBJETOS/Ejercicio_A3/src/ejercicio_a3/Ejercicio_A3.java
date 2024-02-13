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

        r1.imprimir();
        System.out.println("");
        Rectangle r2 = new Rectangle(0, 0, 4, 5);
        r2.setx1x2(1, 2);
        r2.imprimir();

    }
}
