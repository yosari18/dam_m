/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma=0;
        int produc=1;
        for (int i = 1; i <= 10; i++) {
             suma+=i;
            produc*=i;
        }
        System.out.println("La suma es:"+suma);
        System.out.println("El producto es :" +produc);
    }
    
}
