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
       Rectangle p =new Rectangle(2,5,7,8);
       

        
        Rectangle arr[] = new Rectangle[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Rectangle.ale();
            arr[i].imprimir();

        }


    }
}
